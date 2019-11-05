package com.cts.rest.webservice.restwebservice.product.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cts.rest.webservice.restwebservice.product.Product;

import com.cts.rest.webservice.restwebservice.product.dao.ProductDaoService;

@RestController
public class ProductJPAController {
	
  @Autowired
  private ProductDaoService productDaoService;
  
  //get mapping for the retriving the products
  
  @Autowired
  private ProductRepository productRepository; 
  
  //get mapping for the retriving the products
  
  @GetMapping(path="/products")
	List<Product> getallProducts() {
		return productRepository.findAll();
	}
	
  @GetMapping(path="/product/{id}")
  public Optional<Product> getProductById(@PathVariable int id) {
	 return  productRepository.findById(id);
	  
  }
  
  @PostMapping("/product")
  public void addProduct(@RequestBody Product product) {
	  
	  productRepository.save(product);
  }
	
  @DeleteMapping(path="/product/delete/{id}")
  public void deleteProductById(@PathVariable int id) {
	  
	   productRepository.deleteById(id);
	  
  }
  
	/*
	 * @GetMapping("/product/name/{productName}") public Product
	 * getProductByName(@PathVariable String productName) {
	 * 
	 * Product product=productRepository.findByProductName(productName);
	 * 
	 * return product;
	 * 
	 * }
	 */
  
  @GetMapping("/product/list/{productName}")
  public List<Product> getProductsByName(@PathVariable String productName) {
	  
	  List<Product> productList=productRepository.getProductsByName(productName);
	
	  return productList;
	  
  }
  
	
}
