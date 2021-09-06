package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class CategoryController
@date 31.08.2021
@time 20:13 
*/

import com.art.tbl.model.Category;
import com.art.tbl.service.category.impls.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    CategoryServiceImpl service;

    @RequestMapping("/getall")
    public List<Category> getAll() {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    public Category get(@PathVariable("id") String id)
    {
        return service.get(id);
    }

    @PostMapping("/create")
    public Category create(@RequestBody Category category)
    {
        return service.create(category);
    }

    @PostMapping("update")
    public Category update(@RequestBody Category category)
    {
        return  service.update(category);
    }

    @RequestMapping("/delete/{id}")
    public Category delete(@PathVariable("id") String id)
    {
        return service.delete(id);
    }
}
