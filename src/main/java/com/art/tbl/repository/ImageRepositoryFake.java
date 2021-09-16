package com.art.tbl.repository;
/*
@author ArtemFrunze
@class ImageRepositoryFake
@date 16.09.2021
@time 22:53 
*/

import com.art.tbl.fakedata.Data;
import com.art.tbl.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class ImageRepositoryFake {
    @Autowired
    Data data;

    public Image create(Image image)
    {
        UUID id = UUID.randomUUID();
        image.setId(id.toString());
        image.setCreatedAt(LocalDateTime.now());
        image.setUpdatedAt(LocalDateTime.now());
        data.getImages().add(image);
        return image;
    }

    public List<Image> getAll()
    {
        return data.getImages();
    }

    public Image get(String id){
        return getAll().parallelStream().filter(s -> s.getId().equals(id)).findFirst().orElseGet(() -> get(id));
    }

    public Image update(Image image) {
        Image img = get(image.getId());
        image.setCreatedAt(img.getCreatedAt());
        image.setUpdatedAt(LocalDateTime.now());
        data.getImages().set(data.getImages().indexOf(img), image);
        return image;
    }

    public Image delete(String id){
        Image image = get(id);
        data.getImages().remove(get(id));
        return image;
    }
}
