package com.example.marketplacedemo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private long id;
    private double amount;
    @ManyToOne
    private Buyer buyer;
}
