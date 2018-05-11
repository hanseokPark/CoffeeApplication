package kr.java.coffee.dao;



import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.coffee.Dto.Product;
import kr.or.dgit.coffee.Dto.Sale;
import kr.or.dgit.coffee.service.SaleService;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaleDaoTest {
	private static SaleService service;

	@Before
	public void setUp() throws Exception{
		testAselectSaleByAll();
	}	
	@After
	public void tearDown() throws Exception{
		testAselectSaleByAll();
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		service = SaleService.getInstance();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		service = null;
	}
	
	//@Test
	public void testAselectSaleByAll() {
		List<Sale> saleLists = service.selectSaleByAll();
		Assert.assertNotNull(saleLists.size());
		
	}
	
	//@Test
	public void testBselectSaleByNo() {
		Sale sale1 = new Sale();
		sale1.setNo(1);
		Sale sale = service.selectSasleByNo(sale1);
		Assert.assertNotNull(sale.getSaleCnt());
	}
	
	//@Test
	public void testCinsertProduct() {
		Sale newSale = new Sale(5, new Product("A001"), 4500, 10, 10);
		int res = service.insertSale(newSale);
		Assert.assertNotNull(res);
		
	}
	//@Test
	public void testDupdateProduct() {
		Sale newSale = new Sale(5, new Product("A001"), 4500, 1000, 20);
		int res = service.updateSale(newSale);
		Assert.assertNotNull(res);
	}
	@Test
	public void testGcallgetTotal() {
		List<Map<String, Object>> maps = service.getTotal();
		Assert.assertNotNull(maps.get(0).size());
	}
}
