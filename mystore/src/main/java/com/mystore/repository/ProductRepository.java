package com.mystore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mystore.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {
	
	List<Product> findByNameContaining(String name);
	

}
