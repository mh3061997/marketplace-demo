package com.example.marketplacedemo.interfaces;

import com.example.marketplacedemo.models.Item;

import java.util.List;

public interface SupplierController {
    List<Item> getSupplierItems(Long supplierId);
}
