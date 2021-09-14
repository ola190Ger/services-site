package com.art.tbl.controller.ui;
/*
@author ArtemFrunze
@class CategoryController
@date 07.09.2021
@time 21:44 
*/

import com.art.tbl.model.TypeContractor;
import com.art.tbl.service.typecontractor.impls.TypeContractorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/web/typecontractors")
@Controller
public class TypeContractorController {

    @Autowired
    TypeContractorImpl typeContractorService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String typeContractorList(Model model){
        model.addAttribute("typeContractors", typeContractorService.getall());
        return "typeContractorList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteTypeContractor(Model model, @PathVariable("id") String id)
    {
        typeContractorService.delete(id);
        return "redirect:/web/typecontractors/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editTypeContractor(Model model, @PathVariable("id") String id)
    {
        TypeContractor typeContractor = typeContractorService.get(id);
        model.addAttribute("typeContractor", typeContractor);
        return "editTypeContractors";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editTypeContractor(Model model,
                                     @ModelAttribute("typeContractor") TypeContractor typeContractor,
                                     @PathVariable("id") String id)
    {
        typeContractorService.update(typeContractor);
        return "redirect:/web/typecontractors/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addTypeContractor(Model model)
    {
        TypeContractor typeContractor = new TypeContractor();
        model.addAttribute("typeContractor", typeContractor);
        return "addTypeContractor";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addTypeContractor(Model model,
                                    @ModelAttribute("typeContractor") TypeContractor typeContractor)
    {
        typeContractorService.create(typeContractor);
        return "redirect:/web/typecontractors/list";
    }
}
