package com.art.tbl.service.image.impls;
/*
@author ArtemFrunze
@class ImageServiceImpl
@date 16.09.2021
@time 23:00 
*/

import com.art.tbl.model.Image;
import com.art.tbl.repository.ImageRepositoryFake;
import com.art.tbl.service.image.interfaces.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements IImageService {
    @Autowired
    ImageRepositoryFake repo;

    @Override
    public Image create(Image image) {
        return repo.create(image);
    }

    @Override
    public Image get(String id) {
        return repo.get(id);
    }

    @Override
    public List<Image> getAll() {
        return repo.getAll();
    }

    @Override
    public Image update(Image image) {
        return repo.update(image);
    }

    @Override
    public Image delete(String id) {
        return repo.delete(id);
    }
}
