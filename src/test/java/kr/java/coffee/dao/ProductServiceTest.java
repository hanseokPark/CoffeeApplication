package kr.java.coffee.dao;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import kr.or.dgit.coffee.Dto.Product;
import kr.or.dgit.coffee.service.ProductService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductServiceTest {
	
	private static ProductService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		service = ProductService.getInstance();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		service = null;
	}

	@Before
	public void setUp() throws Exception{
		System.out.println("setUp");
	}	
	@After
	public void tearDown() throws Exception{
		testAselectProductByAll();
	}
	
	//@Test
	public void testAselectProductByAll() {		
		List<Product> pdtLists = service.selectProductAll();
		Assert.assertNotNull(pdtLists.size());
	}
	
	//@Test
	public void testBselectProductByNo() {	
		Product product = service.selectProductByNo(new Product("A001"));
		Assert.assertNotNull("아메리카노",product.getName());
	}
	
	//@Test
	public void testCinsertProduct() {
		Product product = new Product("A005", "캬라멜마키아또");
		int res = service.insertProduct(product);
		Assert.assertNotNull(res);
	}
	
	//@Test
	public void testDupdateProduct() {
		Product product = new Product("A005","홍차");
		int res = service.updateProduct(product);
		Assert.assertNotNull(res);
	}
	
	//@Test
	public void testEdeleteProduct() {
		Product product = new Product("A005");
		int res = service.deleteProduct(product);
		Assert.assertNotNull(res);
	}
	
}
