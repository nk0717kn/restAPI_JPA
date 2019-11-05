package com.cts.rest.webservice.restwebservice.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	
	
	private Integer productId ;
	private String productName;
	private String productCategory;
	private double price;
	
	public Product(){
		
		
	}
	
	public Product(Integer productId, String productName, String productCategory, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.price = price;
	}
	
	public Integer getProductId() {
		return productId;
	}



	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	


}
