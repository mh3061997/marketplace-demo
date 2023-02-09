package com.example.marketplacedemo.controllers;

import com.example.marketplacedemo.dtos.ItemDto;
import com.example.marketplacedemo.interfaces.ItemController;
import com.example.marketplacedemo.mappers.ItemMapper;
import com.example.marketplacedemo.models.Item;
import com.example.marketplacedemo.services.MarketFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/item")
@CrossOrigin(origins = "*")
public class ItemControllerImpl implements ItemController {

    private final MarketFacade marketFacade;
    private final ItemMapper itemMapper;
    @Autowired
    public ItemControllerImpl(MarketFacade marketFacade, ItemMapper itemMapper) {
        this.marketFacade = marketFacade;
        this.itemMapper = itemMapper;
    }

    @Override
    @GetMapping
    public List<ItemDto> getMarketItems() {
        List<Item> list= marketFacade.getMarketItems();
        return marketFacade.getMarketItems().stream().map(itemMapper::mapItemtoDto).collect(Collectors.toList());
    }

    @Override
    @PostMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_SUPPLIER')")
    public void changeItemQuantity(@PathVariable Long id, @RequestParam int quantity) {
        marketFacade.changeItemQuantity(id, quantity);
    }
}
