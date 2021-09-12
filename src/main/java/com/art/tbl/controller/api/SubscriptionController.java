package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class SubscriptionController
@date 01.09.2021
@time 19:49 
*/

import com.art.tbl.model.Subscription;
import com.art.tbl.service.subscription.impls.SubscriptionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subscription")
public class SubscriptionController {
    @Autowired
    SubscriptionServiceImpl service;

    @RequestMapping("/getall")
    public List<Subscription> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    public Subscription get(@PathVariable("id") String id)
    {
        return service.get(id);
    }

    @RequestMapping("/create")
    public Subscription create(@RequestBody Subscription subscription)
    {
        return service.create(subscription);
    }

    @RequestMapping("/update")
    public Subscription update(@RequestBody Subscription subscription)
    {
        return service.update(subscription);
    }

    @RequestMapping("/delete/{id}")
    public Subscription delete(@PathVariable("id") String id)
    {
        return service.delete(id);
    }

}
