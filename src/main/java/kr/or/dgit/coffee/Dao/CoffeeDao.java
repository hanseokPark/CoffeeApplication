package kr.or.dgit.Dao;

import java.util.List;

import kr.or.dgit.Dto.Sale;

public interface CoffeeDao {
	
	List<Sale> selectSaleByAll();
	
	List<Sale> selectSaleByNo();
	
	
	int insertProduct(Sale sale); 	
	int updateProduct(Sale sale);
	int deleteProduct(int no);
	
	
	/*callSaleDetail()
	callgetTotal()*/
}
