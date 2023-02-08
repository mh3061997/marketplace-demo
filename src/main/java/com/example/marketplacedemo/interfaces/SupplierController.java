package com.example.marketplacedemo.interfaces;

import com.example.marketplacedemo.dtos.ItemDto;
import com.example.marketplacedemo.models.Item;

import java.util.List;

public interface SupplierController {
    List<ItemDto> getSupplierItems(Long supplierId);
}
