package com.cts.rest.webservice.restwebservice.product.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cts.rest.webservice.restwebservice.product.Product;

@Component
public class ProductDaoService {
	
	private static List<Product> products = new ArrayList<Product>();
	
	private static int prodCount=3;
	
	
	static {
		
		products.add(new Product(1,"ABC","AAA",10.99));
		products.add(new Product(2,"DEF","BBB",20.45));
		products.add(new Product(3,"GHI","CCC",30));
		
		
	}
	
	
	public List<Product> getAllProducts() {
		
		return products;
	}


	public Product getProductById(int id) {

		for(Product product: products) {
			if (product.getProductId()==id) {
				return product;
			}
		}
		return null;
	}
	
	
	public Product addProduct(Product product) {
		
		if(product.getProductId() == null) {
			product.setProductId(++prodCount);
		}
		products.add(product);
		
		return product;
	}
	
	
	
	public Product deleteProductById(int id) {
		
		Iterator<Product> iterator = products.iterator();
		Product product = null;
		while(iterator.hasNext()) {
			 product= iterator.next();
			if(product.getProductId()==id) {
				iterator.remove();
				return product;
			}
			
		}
		return null;
	}
	
	

}
