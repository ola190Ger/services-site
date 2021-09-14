package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class ReviewsController
@date 01.09.2021
@time 19:45 
*/

import com.art.tbl.model.Reviews;
import com.art.tbl.service.reviews.impls.ReviewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/reviews")
public class ReviewsRESTController {
    @Autowired
    ReviewsServiceImpl service;

    @RequestMapping("/getall")
    public List<Reviews> getAll() {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    public Reviews get(@PathVariable("id") String id)
    {
        return service.get(id);
    }

    @PostMapping("/create")
    public Reviews create(@RequestBody Reviews reviews)
    {
        return service.create(reviews);
    }

    @PostMapping("update")
    public Reviews update(@RequestBody Reviews reviews)
    {
        return  service.update(reviews);
    }

    @RequestMapping("/delete/{id}")
    public Reviews delete(@PathVariable("id") String id)
    {
        return service.delete(id);
    }
}
