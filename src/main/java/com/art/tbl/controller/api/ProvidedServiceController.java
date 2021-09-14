package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class ProvidedService
@date 01.09.2021
@time 19:41 
*/

import com.art.tbl.model.ProvidedService;
import com.art.tbl.service.providedservice.impls.ProvidedServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/providedservice")
public class ProvidedServiceController {

    @Autowired
    ProvidedServiceServiceImpl service;

    @RequestMapping("/getall")
    public List<ProvidedService> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    public ProvidedService get(@PathVariable("id") String id)
    {
        return service.get(id);
    }

    @RequestMapping("/create")
    public ProvidedService create(@RequestBody ProvidedService providedService){
        return service.create(providedService);
    }
    @RequestMapping("/update")
    public ProvidedService update(@RequestBody ProvidedService providedService){
        return service.update(providedService);
    }
    @RequestMapping("/delete/{id}")
    public ProvidedService delete(@PathVariable("id") String id)
    {
        return service.delete(id);
    }

}
