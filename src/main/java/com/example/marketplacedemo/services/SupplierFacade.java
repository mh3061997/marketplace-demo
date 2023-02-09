package com.example.marketplacedemo.services;

import com.example.marketplacedemo.models.Item;
import com.example.marketplacedemo.models.StatisticsDto;
import com.example.marketplacedemo.repositories.ItemRepository;
import com.example.marketplacedemo.repositories.StatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierFacade {

    private final ItemRepository itemRepo;
    private final StatisticsRepository statsRepo;

    @Autowired
    SupplierFacade(ItemRepository itemRepo, StatisticsRepository statsRepo) {

        this.itemRepo = itemRepo;
        this.statsRepo=statsRepo;
    }

    public List<Item> getSupplierItems(Long supplierId) {
        return itemRepo.findBySupplierId(supplierId);
    }

    public List<StatisticsDto> getStatistics() {
        return statsRepo.findAll();
    }
}
