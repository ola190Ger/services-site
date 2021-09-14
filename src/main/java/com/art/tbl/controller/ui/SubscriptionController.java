package com.art.tbl.controller.ui;
/*
@author ArtemFrunze
@class SubscriptionController
@date 14.09.2021
@time 19:41 
*/

import com.art.tbl.model.Contractor;
import com.art.tbl.model.Subscription;
import com.art.tbl.service.contractor.impls.ContractorServiceImpl;
import com.art.tbl.service.subscription.impls.SubscriptionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RequestMapping("/web/subscriptions")
@Controller
public class SubscriptionController {
    @Autowired
    SubscriptionServiceImpl subscriptionService;

    @Autowired
    ContractorServiceImpl contractorService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String subscriptionList(Model model){
        model.addAttribute("subscriptions", subscriptionService.getAll());
        return "subscriptionList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteSubscription(Model model, @PathVariable("id") String id)
    {
        subscriptionService.delete(id);
        return "redirect:/web/subscription/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editSubscription(Model model, @PathVariable("id") String id)
    {
        Subscription subscription = subscriptionService.get(id);
        model.addAttribute("subscription", subscription);
        return "editSubscription";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editSubscription(Model model,
                                     @ModelAttribute("subscription") Subscription subscription,
                                     @PathVariable("id") String id)
    {
        subscriptionService.update(subscription);
        return "redirect:/web/subscriptions/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addSubscription(Model model)
    {
        Subscription subscription = new Subscription();
        List<String> contractorId = contractorService.getAll().stream()
                .map(Contractor::getId).collect(Collectors.toList());
        String test = subscription.getEndDate().toString();
        model.addAttribute("subscription", subscription);
        model.addAttribute("contractorId", contractorId);
        return "addSubscription";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addSubscription(Model model,
                                    @ModelAttribute("subscription") Subscription subscription)
    {
        subscriptionService.create(subscription);
        return "redirect:/web/subscription/list";
    }
}
