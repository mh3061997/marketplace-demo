package com.example.marketplacedemo.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private long id;
    private String name;
    private String description;
    private double price;

    private int quantity;
    @ManyToOne
    private Supplier supplier;
}
