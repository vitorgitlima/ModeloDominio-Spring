package com.devsuperior.demo.repositories;

import com.devsuperior.demo.entities.OrderItem;
import com.devsuperior.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
