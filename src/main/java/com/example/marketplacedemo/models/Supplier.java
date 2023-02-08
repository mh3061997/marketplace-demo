package com.example.marketplacedemo.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "SUPPLIER_ID")
    private List<Item> items;

}
