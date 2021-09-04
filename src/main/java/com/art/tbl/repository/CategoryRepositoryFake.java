package com.art.tbl.repository;
/*
@author ArtemFrunze
@class CategoryRepositoryFake
@date 02.09.2021
@time 18:49 
*/

import com.art.tbl.fakedata.Data;
import com.art.tbl.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositoryFake {

    @Autowired
    Data data;

     public Category create(Category category) {
         data.getCategories().add(category);
         return category;
    }

    public Category get(String id) {
         return this.getAll().stream().filter(item -> item.getId().equals(id)).findFirst()
                 .get();
    }

    public Category update(Category category) {
        return null;
    }

    public Category delete(String id) {
        return null;
    }

    public List<Category> getAll() {
        return data.getCategories();
    }
}