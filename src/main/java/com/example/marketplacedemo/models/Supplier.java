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
    private long name;
    @OneToMany
    private List<Item> items;

}
