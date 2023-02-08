package com.example.marketplacedemo.dtos;

import com.example.marketplacedemo.models.Supplier;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemDto {

    private long id;
    private String name;
    private String description;
    private double price;

    private int quantity;

    private Long supplierID;
    private String supplierName;
}
