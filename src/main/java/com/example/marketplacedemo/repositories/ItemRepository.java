package com.example.marketplacedemo.repositories;

import com.example.marketplacedemo.models.Buyer;
import com.example.marketplacedemo.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository  extends JpaRepository<Item, Long> {
}
