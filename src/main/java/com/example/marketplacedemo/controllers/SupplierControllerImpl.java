package com.example.marketplacedemo.controllers;

import com.example.marketplacedemo.interfaces.SupplierController;
import com.example.marketplacedemo.models.Item;
import com.example.marketplacedemo.services.SupplierFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("supplier")
public class SupplierControllerImpl implements SupplierController {

    private final SupplierFacade supplierFacade;

    @Autowired
    public SupplierControllerImpl(SupplierFacade supplierFacade) {
        this.supplierFacade = supplierFacade;
    }

    @Override
    @GetMapping(name = "/{id}/items")
    public List<Item> getSupplierItems(@PathVariable Long id) {
        return supplierFacade.getSupplierItems(id);
    }


}
