package kr.or.dgit.coffee.util;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
	private static final Log log = LogFactory.getLog(MyBatisSqlSessionFactory.class);
	
	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSessionFactory getSqlSessionFactory(){
		
		if (sqlSessionFactory == null) {
			try(InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");) {				
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				log.debug("getSqlSesssionFactory() - Connection : " + sqlSessionFactory.openSession().getConnection());
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		return sqlSessionFactory;
	}
	public static SqlSession openSession(){
		return getSqlSessionFactory().openSession();
	}
}
