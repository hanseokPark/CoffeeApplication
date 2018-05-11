package kr.or.dgit.coffee.Dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.coffee.Dto.Sale;

public interface SaleDao {
	Sale selectSaleByNo(Sale sale);
	
	List<Sale> selectSaleByAll();
	List<Sale> callSaleDetail(Map<String, Boolean> map);
	
	int insertSale(Sale sale); 	
	int updateSale(Sale sale);
	int deleteSale(Sale sale);
	
	List<Map<String, Object>> getTotal();
}
