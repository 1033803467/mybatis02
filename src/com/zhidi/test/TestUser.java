package com.zhidi.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zhidi.dao.IUserDao;
import com.zhidi.entity.User;

public class TestUser extends BaseTest {

		private IUserDao userDao;
	
		private SqlSession session;
	
		@Before // @Before有这个注解，代表每次方法的执行都会运行一次这里的方法
		public void beforeMethod() {
	
			session = factory.openSession();
	
			// 通过getMapper获取Dao接口的代理对象，由Mybatis框架自动创建
			userDao = session.getMapper(IUserDao.class);
	
		}
	
		@After
	public void afterMethod() {
		session.commit();
		session.close();

	}
	//@SuppressWarnings("WWW")	取消警告
	@Test	
	public void testQueryById(){
		User user = userDao.queryById(1);
		String roleName = user.getRole().getRoleName();
		System.out.println(roleName);
	}
}
