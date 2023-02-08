package com.example.marketplacedemo.interfaces;

import com.example.marketplacedemo.models.Item;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ItemController {

    List<Item> getMarketItems();

    void changeItemQuantity( Long itemId,@RequestParam int quantity);
}
