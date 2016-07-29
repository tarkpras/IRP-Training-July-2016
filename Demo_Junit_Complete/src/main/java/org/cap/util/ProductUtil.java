package org.cap.util;

public class ProductUtil {
	
	private static int productId=0;
	public static int generateProductId(){
		return productId++;
	}

}
