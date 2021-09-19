package com.art.tbl.service.image.interfaces;
/*
@author ArtemFrunze
@class IImageServices
@date 16.09.2021
@time 22:58 
*/

import com.art.tbl.dto.ImageDTO;
import com.art.tbl.model.Image;

import java.util.List;

public interface IImageService {
    ImageDTO create(ImageDTO image);
    ImageDTO get(String id);
    List<ImageDTO> getAll();
    ImageDTO update(ImageDTO image);
    ImageDTO delete(String id);
}
