package com.art.tbl.service.image.impls;
/*
@author ArtemFrunze
@class ImageServiceImpl
@date 16.09.2021
@time 23:00 
*/

import com.art.tbl.dto.CategoryDTO;
import com.art.tbl.dto.ImageDTO;
import com.art.tbl.mapper.CategoryMapper;
import com.art.tbl.mapper.ImageMapper;
import com.art.tbl.model.Category;
import com.art.tbl.model.Image;
import com.art.tbl.repository.ImageRepositoryFake;
import com.art.tbl.service.image.interfaces.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageServiceImpl implements IImageService {
    @Autowired
    ImageRepositoryFake repo;

    @Override
    public ImageDTO create(ImageDTO image) {
        return ImageMapper.IMAGE_MAPPER.fromImageDTO(repo.create(ImageMapper.IMAGE_MAPPER.toImage(image)));
    }

    @Override
    public ImageDTO get(String id) {
        return ImageMapper.IMAGE_MAPPER.fromImageDTO(repo.get(id));
    }

    @Override
    public List<ImageDTO> getAll() {
        List<ImageDTO> imageDTOList = new ArrayList<>();
        for (Image image : repo.getAll()){
            imageDTOList.add(ImageMapper.IMAGE_MAPPER.fromImageDTO(image));
        }
        return imageDTOList;
    }

    @Override
    public ImageDTO update(ImageDTO image) {
        return ImageMapper.IMAGE_MAPPER.fromImageDTO(repo.update(ImageMapper.IMAGE_MAPPER.toImage(image)));
    }

    @Override
    public ImageDTO delete(String id) {
        return ImageMapper.IMAGE_MAPPER.fromImageDTO(repo.delete(id));
    }
}
