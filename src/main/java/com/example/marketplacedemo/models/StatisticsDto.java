package com.example.marketplacedemo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class StatisticsDto {
    @Id
    private String id;
    private int revenue;
    private int numberOfSuppliers;

    public StatisticsDto( int revenue, int numberOfSuppliers) {
        this.revenue = revenue;
        this.numberOfSuppliers = numberOfSuppliers;
    }
}
