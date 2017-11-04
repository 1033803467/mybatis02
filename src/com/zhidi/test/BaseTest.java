package com.zhidi.test;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

public class BaseTest {
	
	protected static SqlSessionFactory factory;
	
	
	@BeforeClass
	public static void beforeClass(){
		
		factory=new SqlSessionFactoryBuilder().build(BaseTest.class.getResourceAsStream("/mybatis-config.xml"));
		
	}
	
}
