package com.art.tbl.controller.ui;/*
@author OlgaGereliuk
@class ProvidedServiceController
@Date 16.09.2021
@Time 22:37
*/

import com.art.tbl.model.ProvidedService;
import com.art.tbl.model.Reviews;
import com.art.tbl.service.providedservice.impls.ProvidedServiceServiceImpl;
import com.art.tbl.service.reviews.impls.ReviewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/web/providedservice")
@Controller
public class ProvidedServiceController {

    @Autowired
    ProvidedServiceServiceImpl providedServiceService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String providedServiceList(Model model){
        model.addAttribute("providedservice", providedServiceService.getAll());
        return "providedServiceList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteProvidedService(Model model, @PathVariable("id") String id)
    {
        providedServiceService.delete(id);
        return "redirect:/web/providedservice/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editProvidedService(Model model, @PathVariable("id") String id)
    {
        ProvidedService providedService = providedServiceService.get(id);
        model.addAttribute("providedservice", providedService);
        return "editprovidedservice";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editProvidedService(Model model,
                            @ModelAttribute("providedservice") ProvidedService providedService,
                            @PathVariable("id") String id)
    {
        providedServiceService.update(providedService);
        return "redirect:/web/providedservice/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProvidedService(Model model)
    {
        ProvidedService providedService = new ProvidedService();
        model.addAttribute("providedservice", providedService);
        return "addprovidedservice";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addProvidedService(Model model,
                            @ModelAttribute("providedservice") ProvidedService providedService)
    {
        providedServiceService.create(providedService);
        return "redirect:/web/providedservice/list";
    }

}
