package com.example.marketplacedemo.services;

import com.example.marketplacedemo.models.Item;
import com.example.marketplacedemo.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierFacade {

    private final ItemRepository itemRepo;

    @Autowired
    SupplierFacade(ItemRepository itemRepo) {
        this.itemRepo = itemRepo;
    }

    void changeItemQuantity(Item item,int quantity) {
        item.setQuantity(quantity);
        itemRepo.save(item);
    }
}
