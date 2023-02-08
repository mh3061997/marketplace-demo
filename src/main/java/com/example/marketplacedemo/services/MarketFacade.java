package com.example.marketplacedemo.services;

import com.example.marketplacedemo.models.Item;
import com.example.marketplacedemo.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketFacade {
    private final ItemRepository itemRepo;

    @Autowired
    public MarketFacade(ItemRepository itemRepo) {
        this.itemRepo = itemRepo;
    }

    public List<Item> getMarketItems() {
        return itemRepo.findAll();
    }

    public void changeItemQuantity(Long itemId, int quantity) {
        Item item = itemRepo.getReferenceById(itemId);
        item.setQuantity(quantity);
        itemRepo.save(item);
    }

}
