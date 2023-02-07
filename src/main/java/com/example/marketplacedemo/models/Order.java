package com.example.marketplacedemo.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "orders")
@Data
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private long id;
    private double amount;
    @ManyToOne
    private Buyer buyer;
}
