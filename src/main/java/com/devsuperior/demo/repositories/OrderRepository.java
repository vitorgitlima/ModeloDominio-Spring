package com.devsuperior.demo.repositories;

import com.devsuperior.demo.entities.Order;
import com.devsuperior.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
