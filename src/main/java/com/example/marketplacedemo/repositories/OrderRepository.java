package com.example.marketplacedemo.repositories;

import com.example.marketplacedemo.models.Buyer;
import com.example.marketplacedemo.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
