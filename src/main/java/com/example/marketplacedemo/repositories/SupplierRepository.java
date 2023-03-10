package com.example.marketplacedemo.repositories;

import com.example.marketplacedemo.models.Buyer;
import com.example.marketplacedemo.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
