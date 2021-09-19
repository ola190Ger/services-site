package com.art.tbl.mapper;/*
@author OlgaGereliuk
@class CategoryMapper
@Date 19.09.2021
@Time 17:55
*/

import com.art.tbl.dto.CategoryDTO;
import com.art.tbl.model.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper/*(uses = {Category.class})*/
public interface CategoryMapper {
    CategoryMapper CATEGORY_MAPPER = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO fromCategory(Category category);

    @InheritInverseConfiguration
    Category toCategory(CategoryDTO categoryDTO);
}

