package com.art.tbl.mapper;/*
@author OlgaGereliuk
@class ImageMapper
@Date 19.09.2021
@Time 22:37
*/

import com.art.tbl.dto.CategoryDTO;
import com.art.tbl.dto.ImageDTO;
import com.art.tbl.model.Category;
import com.art.tbl.model.Image;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {Image.class})
public interface ImageMapper {
    ImageMapper IMAGE_MAPPER = Mappers.getMapper(ImageMapper.class);

    ImageDTO fromImageDTO(Image image);

    @InheritInverseConfiguration
    Image toImage(ImageDTO imageDTO);
}
