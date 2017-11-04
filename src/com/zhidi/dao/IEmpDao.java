package com.zhidi.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized.Parameter;

import com.zhidi.entity.Dept;
import com.zhidi.entity.Emp;
import com.zhidi.entity.EmpVO;

public interface IEmpDao {
	//@Param("firstResult")Integer  @Param("maxResult")
	/**
	 * 根据部门名称查
	 * @param firstResult
	 * @param maxResult
	 * @return
	 */
	//List<Emp> queryByDname (String dneptno); //（复合POJO）
	//List<Emp> queryByPage (Integer firstResult,Integer maxResult); 
	
	/**
	 * 分页查询
	 * @param params
	 * @return
	 */
	
	List<Emp> queryByPage (Map<String,Object> params); 

	//查询指定部门标号的员工姓名和部门名称
	List<Map<String, Object>> queryByDept(Integer deptnpo); 
	
	List<EmpVO> queryByVO(Integer deptnpo);
	
	//分页条件查询
	List<Emp> queryByPage2(@Param("firstResult")Integer firstResult,@Param("maxResult")Integer maxResult,@Param("params") Map<String,Object> params);

	
	List<Emp> queryByPage3(@Param("firstResult")Integer firstResult,
							@Param("maxResult")Integer maxResult,
							@Param("params") Map<String, Object> params);
	
	List<Emp> queryByPage4(@Param("firstResult")Integer firstResult,
			@Param("maxResult")Integer maxResult,
			@Param("params") Map<String, Object> params);
	
	//批量删除
	void batchDelete(@Param("ids") Integer[] ids);
	
	List<Emp> queryByDeptNo(@Param("dept") List<Dept> dept);
	
	//更新
	void update(Emp emp);
	
	List<Emp> queryLike(@Param("ename") String ename);

	

}
