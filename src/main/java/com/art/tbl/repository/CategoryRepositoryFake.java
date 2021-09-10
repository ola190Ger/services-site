package com.art.tbl.repository;
/*
@author ArtemFrunze
@class CategoryRepositoryFake
@date 02.09.2021
@time 18:49 
*/

import com.art.tbl.fakedata.Data;
import com.art.tbl.model.Category;
import com.art.tbl.model.ProvidedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class CategoryRepositoryFake {

    @Autowired
    Data data;

     public Category create(Category category) {
         UUID id = UUID.randomUUID();
         category.setId(id.toString());
         category.setCreatedAt(LocalDateTime.now());
         category.setUpdatedAt(LocalDateTime.now());
         data.getCategories().add(category);
         return category;
    }

    public Category get(String id) {
         return this.getAll().stream().filter(item -> item.getId().equals(id)).findFirst()
                 .get();
    }

    public Category update(Category category) {
         Category cat = get(category.getId());
         category.setCreatedAt(cat.getCreatedAt());
         category.setUpdatedAt(LocalDateTime.now());
         data.getCategories().set(data.getCategories().indexOf(cat), category);
         return category;
    }

    public Category delete(String id) {
        Category category = get(id);
        data.getCategories().remove(get(id));
        return category;
    }

    public List<Category> getAll() {
        return data.getCategories();
    }
}
