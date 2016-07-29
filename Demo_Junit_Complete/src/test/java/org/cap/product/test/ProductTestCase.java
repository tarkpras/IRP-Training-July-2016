package org.cap.product.test;

import static org.junit.Assert.*;

import org.cap.dto.Product;
import org.cap.exception.InvalidQuantityException;
import org.cap.service.ProductService;
import org.cap.service.ProductServiceImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

public class ProductTestCase {

	private  ProductService productService;
	
	/*@BeforeClass
	public static void setUp(){
		System.out.println("setUp method");
				productService=new ProductServiceImpl();
	}
	
	@AfterClass
	public static void tearDown(){
		System.out.println("tearDown method");
				productService=new ProductServiceImpl();
	}*/
	
	@Before
	public void before_Method(){
		//System.out.println("Before Method");
		productService=new ProductServiceImpl();
	}
	
	
	@Test
	@Category(GoodTestCategory.class)
	public void test_calculate_method(){
		//System.out.println("test_calculate_method");
		//productService=new ProductServiceImpl();
		assertEquals(200, productService.caculateSum(100, 100));
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	@Category(BadTestCategory.class)
	public void when_addProduct_with_null_raise_exception() throws InvalidQuantityException{
		//productService=new ProductServiceImpl();
		//System.out.println("when_addProduct_with_null_raise_exception");
		Product product=null;
		productService.addProduct(product);
	}
	
	
	//@Ignore
	//@Test(expected=InvalidQuantityException.class)
	
	
	@Rule
	public ExpectedException thrown=ExpectedException.none();
	@Test
	public void provide_invalid_qty_raise_exception() throws InvalidQuantityException{
		Product product=new Product();
		product.setProductId(1);
		product.setProductName("XYZ");
		product.setQty(0);
		
		thrown.expect(IllegalArgumentException.class);
	//	thrown.expectMessage("Quantity must be greater than zero!");
		thrown.expectMessage("greater");
		productService.addProduct(product);
		
		
	}
	
	
	/*@After
	public void after_method(){
		//System.out.println("After Method");
	}*/
	

}
