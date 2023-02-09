package com.example.marketplacedemo.models;

import org.springframework.data.annotation.Id;

public class StatisticsDto {
    @Id
    private String id;
    private int revenue;
    private int numberOfSuppliers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getNumberOfSuppliers() {
        return numberOfSuppliers;
    }

    public void setNumberOfSuppliers(int numberOfSuppliers) {
        this.numberOfSuppliers = numberOfSuppliers;
    }

    public StatisticsDto( int revenue, int numberOfSuppliers) {
        this.revenue = revenue;
        this.numberOfSuppliers = numberOfSuppliers;
    }
}
