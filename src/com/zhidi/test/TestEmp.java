package com.zhidi.test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zhidi.dao.IEmpDao;
import com.zhidi.entity.Dept;
import com.zhidi.entity.Emp;
import com.zhidi.entity.EmpVO;


public class TestEmp extends BaseTest{

	private IEmpDao empDao;
	
	private SqlSession session;
	
	
	@Before //@Before有这个注解，代表每次方法的执行都会运行一次这里的方法
	public void beforeMethod(){
  
	 session = factory.openSession();
		
		//通过getMapper获取Dao接口的代理对象，由Mybatis框架自动创建
		 empDao = session.getMapper(IEmpDao.class);
		
		
	}
	@After
	public void afterMethod(){
		session.commit();
		session.close();
		
	}
	
	@Test
	public void testQueryByPage(){
		
		//IEmpDao mapper = session.getMapper(IEmpDao.class);
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("firstResult", 0);
		params.put("maxResult", 10);
		empDao.queryByPage(params);
		
	}
	@Test
	public void testQueryByDept(){
		
		//IEmpDao mapper = session.getMapper(IEmpDao.class);
		
		List<Map<String,Object>> list= empDao.queryByDept(4);
		
		for(Map<String,Object> map:list){ 
			//获取键的set集合
			Set<String> set = map.keySet();
			//遍历set集合
			for(String s:set){
				//根据Key取map集合的value
				Object value = map.get(s);
				System.out.println("key:"+s+", value:"+value);
			}
		}
	
	}
	
	@Test
	public void testQueryByVO() {
		List<EmpVO> list = empDao.queryByVO(2);
		System.out.println(list);
	}
	
	@Test
	public void testQueryByPage2() {
		//new一个Map集合用来设置查询条件
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ename", "王");
		List<Emp> list = empDao.queryByPage2(0, 10, params);
	}
	
	@Test
	public void testQueryByPage3() {
		//new一个Map集合用来设置查询条件
		Map<String, Object> params = new HashMap<String, Object>();
		//params.put("ename", "王");
		params.put("sal", 3000);
		List<Emp> list = empDao.queryByPage3(0, 10, params);
	}
	
	@Test
	public void testQueryByPage4() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ename", "王");
		params.put("sal", 3000);
		List<Emp> list = empDao.queryByPage4(0, 10, params);
	}
	
	@Test
	public void testBatchDelete(){
		
		Integer[] ids = {8,9};
		empDao.batchDelete(ids);
	}
	
	@Test
	public void testQueryByDeptNo(){
	List<Dept> list = new ArrayList<Dept>();
	Dept dept = new Dept();
	dept.setDeptno(2);
	Dept dept2 = new Dept();
	dept2.setDeptno(7);
	list.add(dept);
	list.add(dept2);
	
	List<Emp> emps =empDao.queryByDeptNo(list);
	}
	@Test
	public void testUpdate(){
		
		
		Emp emp =new Emp();
		emp.setEmpno(4);
		emp.setJob("律师");
		
		empDao.update(emp);
	}
	
	@Test
	public void testQueryByLike(){
	
		List<Emp> list = empDao.queryLike("张");
	}
}
	
	
