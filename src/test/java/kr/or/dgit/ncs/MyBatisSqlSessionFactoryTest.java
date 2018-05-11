package kr.or.dgit.ncs;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.coffee.util.MyBatisSqlSessionFactory;

import org.junit.Assert;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyBatisSqlSessionFactoryTest {
	private static SqlSessionFactory factory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = MyBatisSqlSessionFactory.getSqlSessionFactory();
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		factory = null;
	}
	
	@Test
	public void testMyBatisSqlSessionFactory() {
		SqlSession session = factory.openSession();
		Assert.assertNotNull(session);
	}
	
}
