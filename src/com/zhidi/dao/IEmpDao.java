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
	 * ���ݲ������Ʋ�
	 * @param firstResult
	 * @param maxResult
	 * @return
	 */
	//List<Emp> queryByDname (String dneptno); //������POJO��
	//List<Emp> queryByPage (Integer firstResult,Integer maxResult); 
	
	/**
	 * ��ҳ��ѯ
	 * @param params
	 * @return
	 */
	
	List<Emp> queryByPage (Map<String,Object> params); 

	//��ѯָ�����ű�ŵ�Ա�������Ͳ�������
	List<Map<String, Object>> queryByDept(Integer deptnpo); 
	
	List<EmpVO> queryByVO(Integer deptnpo);
	
	//��ҳ������ѯ
	List<Emp> queryByPage2(@Param("firstResult")Integer firstResult,@Param("maxResult")Integer maxResult,@Param("params") Map<String,Object> params);

	
	List<Emp> queryByPage3(@Param("firstResult")Integer firstResult,
							@Param("maxResult")Integer maxResult,
							@Param("params") Map<String, Object> params);
	
	List<Emp> queryByPage4(@Param("firstResult")Integer firstResult,
			@Param("maxResult")Integer maxResult,
			@Param("params") Map<String, Object> params);
	
	//����ɾ��
	void batchDelete(@Param("ids") Integer[] ids);
	
	List<Emp> queryByDeptNo(@Param("dept") List<Dept> dept);
	
	//����
	void update(Emp emp);
	
	List<Emp> queryLike(@Param("ename") String ename);

	

}
