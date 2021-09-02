package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class ImageController
@date 01.09.2021
@time 19:36 
*/

import com.art.tbl.model.Image;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/image")
public class ImageController {
    @RequestMapping("/getone")
    public Image getone()
    {
        return new Image("1", "image", new java.awt.Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        }, LocalDateTime.now(), LocalDateTime.now());
    }
}
