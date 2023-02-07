package com.example.marketplacedemo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Supplier {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private long id;
    private long name;
    @OneToMany
    private List<Item> items;

}
