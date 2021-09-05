package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class LocationController
@date 01.09.2021
@time 19:39 
*/

import com.art.tbl.model.Location;
import com.art.tbl.service.location.impls.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/location")
public class LocationController {
    @Autowired
    LocationServiceImpl service;

    @RequestMapping("/getall")
    public List<Location> getAll()
    {
        return service.getall();
    }

    @RequestMapping("/get/{id}")
    public Location get(@PathVariable("id") String id)
    {
        return service.get(id);
    }

    @RequestMapping("/create")
    public Location create(@RequestBody Location location){
        return service.create(location);
    }
    @RequestMapping("/update")
    public Location update(@RequestBody Location location){
        return service.update(location);
    }
    @RequestMapping("/delete/{id}")
    public Location delete(@PathVariable("id") String id)
    {
        return service.delete(id);
    }

    @RequestMapping("/getone")
    public Location getone()
    {
        return new Location("1", "country", "region", "city","description", LocalDateTime.now(), LocalDateTime.now());
    }
}
