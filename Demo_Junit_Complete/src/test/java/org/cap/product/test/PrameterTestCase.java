package org.cap.product.test;

import java.security.KeyStore.ProtectionParameter;
import java.util.Arrays;
import java.util.List;

import org.cap.service.ProductService;
import org.cap.service.ProductServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrameterTestCase {
	
	private int input;
	private int expected;
	
	private ProductService productService=new ProductServiceImpl();
	
	public PrameterTestCase(int input, int expected) {
		super();
		this.input = input;
		this.expected = expected;
	}
	
	@Parameters
	public static List<Object[]> myParams(){
		return Arrays.asList(new Object[][]{
			{1,1},
			{2,4},
			{0,0},
			{-1,1}
		});
	}
	
	@Test
	public void test_find_Square_Method(){
		
		Assert.assertEquals(expected, productService.findSqare(input));
		
	}

}
