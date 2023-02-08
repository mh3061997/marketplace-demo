package com.example.marketplacedemo.interfaces;

import com.example.marketplacedemo.dtos.ItemDto;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ItemController {

    List<ItemDto> getMarketItems();

    void changeItemQuantity( Long itemId,@RequestParam int quantity);
}
