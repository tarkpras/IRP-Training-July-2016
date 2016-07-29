package org.cap.product.test;

import static org.junit.Assert.*;

import org.cap.dao.ProductDao;
import org.cap.dto.Product;
import org.cap.exception.InsufficientQuantityException;
import org.cap.service.ProductService;
import org.cap.service.ProductServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ProductDependenciesTest {

	@Mock
	private ProductDao productDao;
	private ProductService productService;
	
	@Before
	public void beforeMethod(){
		MockitoAnnotations.initMocks(this);
		productService=new ProductServiceImpl(productDao);
	}
	
	@Test
	public void find_product_method_with_mock(){
		
		Product product=new Product();
		product.setProductId(1001);
		product.setProductName("XYZ Product");
		product.setPrice(100);
		product.setQty(15);
		
		//Declaration
		Mockito.when(productDao.findProduct(1001)).thenReturn(product);
		
		//invoke real logic
		Product fProduct=productService.findProduct(1001);
		
		//Verification
		Mockito.verify(productDao).findProduct(1001);
		
		//assertEquals(fProduct.getQty(), product.getQty());
		assertEquals(15,fProduct.getQty());
		
	}

	
	@Test
	public void when_product_product_increase_qty() throws InsufficientQuantityException{
		Product product=new Product();
		product.setProductId(1001);
		product.setProductName("XYZ Product");
		product.setPrice(100);
		product.setQty(15);
		
		//Declaration
		Mockito.when(productDao.findProduct(1001)).thenReturn(product);
		
		//invoke real logic
		//Product fProduct=productService.findProduct(1001);
		Product pr_product= productService.produceProduct(20, 1001);
		
		//Verification
		Mockito.verify(productDao).findProduct(1001);
		
		assertEquals(35, pr_product.getQty());
		
	}
	
	
}
