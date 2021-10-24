package com.jonathan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
	
	
	
}
