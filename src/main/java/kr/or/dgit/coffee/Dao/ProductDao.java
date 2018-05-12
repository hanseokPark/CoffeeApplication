package kr.or.dgit.coffee.Dao;

import java.util.List;

import kr.or.dgit.coffee.Dto.Product;


public interface ProductDao {
	
	Product selectProductByNo();
	List<Product> selectProductByAll();		
	int insertProduct(Product product); 	
	int deleteProduct(Product Product);
	int updateProduct(Product Product);
	
	
	
}
