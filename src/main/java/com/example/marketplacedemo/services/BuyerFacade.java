package com.example.marketplacedemo.services;

import com.example.marketplacedemo.models.Item;
import com.example.marketplacedemo.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerFacade {
    private final ItemRepository itemRepo;

    @Autowired
    public BuyerFacade(ItemRepository itemRepo) {
        this.itemRepo = itemRepo;
    }

    List<Item> getMarketItems() {
        return itemRepo.findAll();
    }
}
