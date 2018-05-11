package kr.or.dgit.coffee.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.dgit.coffee.Dto.Sale;
import kr.or.dgit.coffee.util.MyBatisSqlSessionFactory;

public class SaleService {
	private static final Log log =  LogFactory.getLog(SaleService.class);
	private static final SaleService instance = new SaleService();
	private SqlSessionFactory sessionFactory;
	
	private String namespace = "kr.or.dgit.coffee.Dao.SaleDao";
	
	private SaleService() {
		sessionFactory = MyBatisSqlSessionFactory.getSqlSessionFactory();
	}
	
	public static SaleService getInstance() {
		return instance;
	}
	
	public List<Sale> selectSaleByAll(){
		log.debug("selectSaleByAll");
		try(SqlSession sqlSession = sessionFactory.openSession()){
			return sqlSession.selectList(namespace + ".selectSaleByAll");
		}		
	}
	
	
	public Sale selectSasleByNo(Sale sale) {
		log.debug("selectSasleByNo");
		try(SqlSession sqlSession = sessionFactory.openSession()){
			return sqlSession.selectOne(namespace + ".selectSaleByNo", sale);
		}		
	}
	
	public int insertSale(Sale sale) {
		log.debug("insertSale()");
		try(SqlSession sqlSession = sessionFactory.openSession()){
			int res = sqlSession.insert(namespace + ".insertSale", sale);
			sqlSession.commit();
			return res;
		}		
	}
	
	public int updateSale(Sale sale) {
		try(SqlSession sqlSession = sessionFactory.openSession()){
			int res = sqlSession.update(namespace + ".updateSale", sale);
			sqlSession.commit();
			return res;
		}
	}
	
	public int deleteSale(Sale sale) {
		try(SqlSession sqlSession = sessionFactory.openSession()){
			int res = sqlSession.delete(namespace + ".delete", sale);
			sqlSession.commit();
			return res;
		}
	}
	
	public List<Map<String, Object>> getTotal(){
		log.debug("getToTal()");
		try(SqlSession sqlSession = sessionFactory.openSession()){
			return sqlSession.selectList(namespace + ".getTotal");
		}
	}
	
	
}
