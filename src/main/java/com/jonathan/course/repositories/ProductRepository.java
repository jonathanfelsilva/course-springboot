package com.jonathan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	
}
