package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class TypeContractorController
@date 01.09.2021
@time 19:54 
*/

import com.art.tbl.model.TypeContractor;
import com.art.tbl.service.typecontractor.impls.TypeContractorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/typecontractor")
public class TypeContractorRESTController {
    @Autowired
    TypeContractorServiceImpl service;

    @RequestMapping("/getall")
    public List<TypeContractor> getall()
    {
        return service.getall();
    }

    @RequestMapping("/get/{id}")
    public TypeContractor get(@PathVariable("id") String id)
    {
        return service.get(id);
    }

    @RequestMapping("/create")
    public TypeContractor create(@RequestBody TypeContractor typeContractor)
    {
        return service.create(typeContractor);
    }

    @RequestMapping("/update")
    public TypeContractor update(@RequestBody TypeContractor typeContractor)
    {
        return service.update(typeContractor);
    }

    @RequestMapping("/delete/{id}")
    public TypeContractor delete(@PathVariable("id") String id)
    {
        return service.delete(id);
    }
}
