package com.jonathan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
	
}
