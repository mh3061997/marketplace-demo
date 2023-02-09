package com.example.marketplacedemo.controllers;

import com.example.marketplacedemo.dtos.ItemDto;
import com.example.marketplacedemo.interfaces.SupplierController;
import com.example.marketplacedemo.mappers.ItemMapper;
import com.example.marketplacedemo.models.StatisticsDto;
import com.example.marketplacedemo.services.SupplierFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/supplier")
@CrossOrigin(origins = "*")
public class SupplierControllerImpl implements SupplierController {

    private final SupplierFacade supplierFacade;
    private final ItemMapper itemMapper;

    @Autowired
    public SupplierControllerImpl(SupplierFacade supplierFacade, ItemMapper itemMapper) {
        this.supplierFacade = supplierFacade;
        this.itemMapper = itemMapper;
    }

    @Override
    @GetMapping(value = "/{id}/items")
    public List<ItemDto> getSupplierItems(@PathVariable Long id) {
        return supplierFacade.getSupplierItems(id).stream().map(itemMapper::mapItemtoDto).collect(Collectors.toList());
    }

    @GetMapping(value = "/stats")
    public List<StatisticsDto> getStats(){
        return supplierFacade.getStatistics();
    }

}
