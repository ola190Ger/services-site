package com.art.tbl.service.category.impls;
/*
@author ArtemFrunze
@class CategoryServiceImpl
@date 02.09.2021
@time 18:45 
*/

import com.art.tbl.model.Category;
import com.art.tbl.repository.CategoryRepositoryFake;
import com.art.tbl.service.category.interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    CategoryRepositoryFake repository;

    @Override
    public Category create(Category category) {
        return repository.create(category);
    }

    @Override
    public Category get(String id) {
        return repository.get(id);
    }

    @Override
    public Category update(Category category) {
        return repository.update(category);
    }

    @Override
    public Category delete(String id) {
        return repository.delete(id);
    }

    @Override
    public List<Category> getAll() {
        return repository.getAll();
    }
}
