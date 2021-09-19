package com.art.tbl.controller.ui;
/*
@author ArtemFrunze
@class CategoryController
@date 14.09.2021
@time 19:07 
*/

import com.art.tbl.dto.CategoryDTO;
import com.art.tbl.model.Category;
import com.art.tbl.service.category.impls.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/web/categories")
@Controller
public class CategoryController {
    @Autowired
    CategoryServiceImpl categoryService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String categoryList(Model model){
        model.addAttribute("categories", categoryService.getAll());
        return "categoryList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteCategory(Model model, @PathVariable("id") String id)
    {
        categoryService.delete(id);
        return "redirect:/web/categories/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editCategory(Model model, @PathVariable("id") String id)
    {
        CategoryDTO category = categoryService.get(id);
        model.addAttribute("category", category);
        return "editCategory";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editCategory(Model model,
                                     @ModelAttribute("category") CategoryDTO category,
                                     @PathVariable("id") String id)
    {
        categoryService.update(category);
        return "redirect:/web/categories/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addCategory(Model model)
    {
        CategoryDTO category = new CategoryDTO();
        model.addAttribute("category", category);
        return "addCategory";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCategory(Model model,
                                    @ModelAttribute("category") CategoryDTO category)
    {
        categoryService.create(category);
        return "redirect:/web/categories/list";
    }
}
