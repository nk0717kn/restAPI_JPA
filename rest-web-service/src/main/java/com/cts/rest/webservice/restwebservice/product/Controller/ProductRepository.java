package com.cts.rest.webservice.restwebservice.product.Controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.rest.webservice.restwebservice.product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{


	@Query("select p from Product p where LOWER(p.productName) = LOWER(:productName)")
	List<Product> getProductsByName(@Param("productName") String productName);

	

}
