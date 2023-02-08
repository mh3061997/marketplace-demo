package com.example.marketplacedemo.mappers;

import com.example.marketplacedemo.dtos.ItemDto;
import com.example.marketplacedemo.models.Item;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ItemMapper {

    public ItemDto mapItemtoDto(Item item){
        return new ItemDto(item.getId(),item.getName(),item.getDescription(),item.getPrice(),item.getQuantity(),item.getSupplier().getId(),item.getSupplier().getName());
    }



}
