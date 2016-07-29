package org.cap.service;

import org.cap.dao.ProductDao;
import org.cap.dao.ProductDaoImpl;
import org.cap.dto.Product;
import org.cap.exception.InsufficientQuantityException;
import org.cap.exception.InvalidQuantityException;
import org.cap.util.ProductUtil;

public class ProductServiceImpl implements ProductService{
	
	private ProductDao productDao;
	
	public ProductServiceImpl(){}

	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
		//this.productDao = new ProductDaoImpl();
	}

	public Product addProduct(Product product) throws InvalidQuantityException {
		
		if(product==null)
			throw new IllegalArgumentException();
		if(product.getQty()<=0)
			throw new InvalidQuantityException();
		
		product.setProductId(ProductUtil.generateProductId());
		
		if(productDao.addProduct(product))
			return product;
		
		return null;
	}

	public Product findProduct(int productId) {
		
		return productDao.findProduct(productId);
	}

	public Product consumeProduct(int qty, int productId) throws InsufficientQuantityException {
		
		Product product= productDao.findProduct(productId);
		
		if(product.getQty()<qty)
			throw new InsufficientQuantityException();
		
		product.setQty(product.getQty()-qty);
		
		return product;
	}

	public Product produceProduct(int qty, int productId) throws InsufficientQuantityException {
		Product product= productDao.findProduct(productId);
		
		if(product.getQty()<0)
			throw new InsufficientQuantityException();
		
		product.setQty(product.getQty()+qty);
		
		return product;
	}

	@Override
	public int caculateSum(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int findSqare(int num) {
		
		return num*num;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
