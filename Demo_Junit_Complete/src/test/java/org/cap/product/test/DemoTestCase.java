package org.cap.product.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DemoTestCase {

	@Test
	@Category(BadTestCategory.class)
	public void test() {
		//fail("Not yet implemented");
	}

	
	@Test(timeout=10)
	@Category(GoodTestCategory.class)
	public void test_timeout(){
		long sum=0;
		for(long i=0;i<123;i++)
			sum+=i;
	}
}
