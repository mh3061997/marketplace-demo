package com.example.marketplacedemo.controllers;

import com.example.marketplacedemo.interfaces.ItemController;
import com.example.marketplacedemo.models.Item;
import com.example.marketplacedemo.services.MarketFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "item")
public class ItemContollerImpl implements ItemController {

    private final MarketFacade marketFacade;

    @Autowired
    public ItemContollerImpl(MarketFacade marketFacade) {
        this.marketFacade = marketFacade;
    }

    @Override
    @GetMapping
    public List<Item> getMarketItems() {
        return marketFacade.getMarketItems();
    }

    @Override
    @PostMapping("/{id}")
    public void changeItemQuantity(@PathVariable Long itemId, @RequestParam int quantity) {
        marketFacade.changeItemQuantity(itemId, quantity);

    }
}
