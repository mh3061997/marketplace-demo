package com.example.marketplacedemo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Buyer {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private long id;
    private String name;
    @OneToMany
    private List<Order> orders;
}
