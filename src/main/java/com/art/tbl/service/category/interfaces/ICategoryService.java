package com.art.tbl.service.category.interfaces;
/*
@author ArtemFrunze
@class ICategoryService
@date 02.09.2021
@time 18:41 
*/

import com.art.tbl.model.Category;

import java.util.List;

public interface ICategoryService {
    Category create(Category category);
    Category get(String id);
    Category update(Category category);
    Category delete(String id);
    List<Category> getAll();
}
