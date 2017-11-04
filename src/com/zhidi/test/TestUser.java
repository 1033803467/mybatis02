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
	
		@Before // @Before�����ע�⣬����ÿ�η�����ִ�ж�������һ������ķ���
		public void beforeMethod() {
	
			session = factory.openSession();
	
			// ͨ��getMapper��ȡDao�ӿڵĴ��������Mybatis����Զ�����
			userDao = session.getMapper(IUserDao.class);
	
		}
	
		@After
	public void afterMethod() {
		session.commit();
		session.close();

	}
	//@SuppressWarnings("WWW")	ȡ������
	@Test	
	public void testQueryById(){
		User user = userDao.queryById(1);
		String roleName = user.getRole().getRoleName();
		System.out.println(roleName);
	}
}
