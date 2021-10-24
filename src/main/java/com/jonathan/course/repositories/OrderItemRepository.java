package com.jonathan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
