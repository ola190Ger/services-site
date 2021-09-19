package com.art.tbl.controller.ui;
/*
@author ArtemFrunze
@class ImageController
@date 16.09.2021
@time 23:04 
*/

import com.art.tbl.model.Image;
import com.art.tbl.service.image.impls.ImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/web/images")
@Controller
public class ImageController {
    @Autowired
    ImageServiceImpl imageService;

    @RequestMapping(value = {"/", "/admin"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "admin";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String imageList(Model model){
        model.addAttribute("images", imageService.getAll());
        return "imageList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteImage(Model model, @PathVariable("id") String id)
    {
        imageService.delete(id);
        return "redirect:/web/images/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editImage(Model model, @PathVariable("id") String id)
    {
        Image image = imageService.get(id);
        model.addAttribute("image", image);
        return "editImage";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editImage(Model model,
                               @ModelAttribute("image") Image image,
                               @PathVariable("id") String id)
    {
        imageService.update(image);
        return "redirect:/web/images/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addImage(Model model)
    {
        Image image = new Image();
        model.addAttribute("image", image);
        return "addImage";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addImage(Model model,
                              @ModelAttribute("image") Image image)
    {
        imageService.create(image);
        return "redirect:/web/images/list";
    }
}
