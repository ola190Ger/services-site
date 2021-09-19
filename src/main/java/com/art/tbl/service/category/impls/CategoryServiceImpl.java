package com.art.tbl.service.category.impls;
/*
@author ArtemFrunze
@class CategoryServiceImpl
@date 02.09.2021
@time 18:45 
*/

import com.art.tbl.dto.CategoryDTO;
import com.art.tbl.mapper.CategoryMapper;
import com.art.tbl.model.Category;
import com.art.tbl.repository.CategoryRepositoryFake;
import com.art.tbl.service.category.interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    CategoryRepositoryFake repository;

    @Override
    public CategoryDTO create(CategoryDTO category) {
        return CategoryMapper.CATEGORY_MAPPER.fromCategory(repository.create(CategoryMapper.CATEGORY_MAPPER.toCategory(category)));
    }

    @Override
    public CategoryDTO get(String id) {
        return CategoryMapper.CATEGORY_MAPPER.fromCategory(repository.get(id));
    }

    @Override
    public CategoryDTO update(CategoryDTO category) {
        return CategoryMapper.CATEGORY_MAPPER.fromCategory(repository.update(CategoryMapper.CATEGORY_MAPPER.toCategory(category)));
    }

    @Override
    public CategoryDTO delete(String id) {

        return CategoryMapper.CATEGORY_MAPPER.fromCategory(repository.delete(id));
    }

    @Override
    public List<CategoryDTO> getAll() {
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
//        List<Category> categoryList = repository.getAll();
        for (Category category : repository.getAll()){
            categoryDTOList.add(CategoryMapper.CATEGORY_MAPPER.fromCategory(category));
        }
        return categoryDTOList;
    }
}
