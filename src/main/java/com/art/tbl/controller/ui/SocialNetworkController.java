package com.art.tbl.controller.ui;/*
@author OlgaGereliuk
@class SocialNetworkController
@Date 15.09.2021
@Time 20:11
*/


import com.art.tbl.model.SocialNetwork;
import com.art.tbl.service.reviews.impls.ReviewsServiceImpl;
import com.art.tbl.service.socialnetwork.impls.SocialNetworkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/web/socialnetwork")
@Controller
public class SocialNetworkController {
    @Autowired
    SocialNetworkServiceImpl snService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String socialNetworkList(Model model){
        model.addAttribute("socialNetworks", snService.getall());
        return "socialNetworkList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteSocialNetwork(Model model, @PathVariable("id") String id)
    {
        snService.delete(id);
        return "redirect:/web/socialnetwork/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editSocialNetwork(Model model, @PathVariable("id") String id)
    {
        SocialNetwork socialNetwork = snService.get(id);
        model.addAttribute("socialnetwork", socialNetwork);
        return "editSocialNetwork";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editSocialNetwork(Model model,
                            @ModelAttribute("socialnetwork") SocialNetwork socialNetwork,
                            @PathVariable("id") String id)
    {
        snService.update(socialNetwork);
        return "redirect:/web/socialnetwork/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addSocialNetwork(Model model)
    {
        SocialNetwork socialNetwork = new SocialNetwork();
        model.addAttribute("socialNetwork", socialNetwork);
        return "addSocialNetwork";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addSocialNetwork(Model model,
                            @ModelAttribute("socialNetwork") SocialNetwork socialNetwork)
    {
        snService.create(socialNetwork);
        return "redirect:/web/socialnetwork/list";
    }
}
