package com.jonathan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
