package com.mindi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindi.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
