package com.art.tbl.service.category.interfaces;
/*
@author ArtemFrunze
@class ICategoryService
@date 02.09.2021
@time 18:41 
*/

import com.art.tbl.dto.CategoryDTO;
import com.art.tbl.model.Category;

import java.util.List;

public interface ICategoryService {
    CategoryDTO create(CategoryDTO category);
    CategoryDTO get(String id);
    CategoryDTO update(CategoryDTO category);
    CategoryDTO delete(String id);
    List<CategoryDTO> getAll();
}
