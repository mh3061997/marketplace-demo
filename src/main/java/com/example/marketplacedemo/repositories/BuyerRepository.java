package com.example.marketplacedemo.repositories;


import com.example.marketplacedemo.models.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Buyer, Long> {
}
