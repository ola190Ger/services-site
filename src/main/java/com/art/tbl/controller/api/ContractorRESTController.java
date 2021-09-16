package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class ContractorController
@date 01.09.2021
@time 19:58 
*/

import com.art.tbl.model.*;
import com.art.tbl.service.contractor.impls.ContractorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contractor")
public class ContractorRESTController {
    @Autowired
    ContractorServiceImpl service;

    @RequestMapping("/getall")
    public List<Contractor> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    public Contractor get(@PathVariable("id") String id)
    {
        return service.get(id);
    }

    @RequestMapping("/create")
    public Contractor create(@RequestBody Contractor contractor)
    {
        return service.create(contractor);
    }

    @RequestMapping("/update")
    public Contractor update(@RequestBody Contractor contractor)
    {
        return service.update(contractor);
    }

    @RequestMapping("/delete/{id}")
    public Contractor delete(@PathVariable("id") String id)
    {
        return service.delete(id);
    }
}
