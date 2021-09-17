package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class ImageController
@date 01.09.2021
@time 19:36 
*/

import com.art.tbl.model.Image;
import com.art.tbl.service.image.impls.ImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/image")
public class ImageRESTController {
    @Autowired
    ImageServiceImpl service;

    @RequestMapping("/getall")
    public List<Image> getAll() {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    public Image get(@PathVariable("id") String id) {
        return service.get(id);
    }

    @PostMapping("/create")
    public Image create(@RequestBody Image image) {
        return service.create(image);
    }

    @PostMapping("update")
    public Image update(@RequestBody Image image) {
        return service.update(image);
    }

    @RequestMapping("/delete/{id}")
    public Image delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}

