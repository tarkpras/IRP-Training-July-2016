package org.cap.dao;

import org.cap.dto.Product;

public interface ProductDao {
	public boolean addProduct(Product product);
	public Product findProduct(int productId);
	

}
