package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class SocialNetworkController
@date 01.09.2021
@time 19:46 
*/


import com.art.tbl.model.SocialNetwork;
import com.art.tbl.service.socialnetwork.impls.SocialNetworkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/socialnetwork")
public class SocialNetworkController {
    @Autowired
    SocialNetworkServiceImpl service;

    @RequestMapping("/getall")
    public List<SocialNetwork> getAll() {
        return service.getall();
    }

    @RequestMapping("/get/{id}")
    public SocialNetwork get(@PathVariable("id") String id)
    {
        return service.get(id);
    }

    @PostMapping("/create")
    public SocialNetwork create(@RequestBody SocialNetwork socialNetwork)
    {
        return service.create(socialNetwork);
    }

    @PostMapping("update")
    public SocialNetwork update(@RequestBody SocialNetwork socialNetwork)
    {
        return  service.update(socialNetwork);
    }

    @RequestMapping("/delete/{id}")
    public SocialNetwork delete(@PathVariable("id") String id)
    {
        return service.delete(id);
    }
}
