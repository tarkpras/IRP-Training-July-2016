package org.cap.service;

import org.cap.dto.Product;
import org.cap.exception.InsufficientQuantityException;
import org.cap.exception.InvalidQuantityException;

public interface ProductService {
	
	public Product addProduct(Product product)throws InvalidQuantityException;
	public Product findProduct(int productId);
	
	public Product consumeProduct(int qty,int productId)throws InsufficientQuantityException;
	public Product produceProduct(int qty,int productId)throws InsufficientQuantityException;

	public int caculateSum(int num1,int num2);
	
	public int findSqare(int num);
}
