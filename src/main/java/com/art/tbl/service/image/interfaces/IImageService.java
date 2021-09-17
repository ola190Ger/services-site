package com.art.tbl.service.image.interfaces;
/*
@author ArtemFrunze
@class IImageServices
@date 16.09.2021
@time 22:58 
*/

import com.art.tbl.model.Image;

import java.util.List;

public interface IImageService {
    Image create(Image image);
    Image get(String id);
    List<Image> getAll();
    Image update(Image image);
    Image delete(String id);
}
