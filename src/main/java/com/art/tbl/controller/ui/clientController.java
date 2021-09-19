package com.art.tbl.controller.ui;
/*
@author ArtemFrunze
@class indexController
@date 19.09.2021
@time 11:50
*/

import com.art.tbl.model.*;
import com.art.tbl.service.contractor.impls.ContractorServiceImpl;
import com.art.tbl.service.image.impls.ImageServiceImpl;
import com.art.tbl.service.location.impls.LocationServiceImpl;
import com.art.tbl.service.providedservice.impls.ProvidedServiceServiceImpl;
import com.art.tbl.service.reviews.impls.ReviewsServiceImpl;
import com.art.tbl.service.socialnetwork.impls.SocialNetworkServiceImpl;
import com.art.tbl.service.typecontractor.impls.TypeContractorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping()
@Controller()
public class clientController {
    @Autowired
    ContractorServiceImpl contractorService;

    @Autowired
    ImageServiceImpl imageService;

    @Autowired
    TypeContractorServiceImpl typeContractorService;

    @Autowired
    ProvidedServiceServiceImpl pSService;

    @Autowired
    LocationServiceImpl locationService;

    @Autowired
    SocialNetworkServiceImpl sNService;

    @Autowired
    ReviewsServiceImpl reviewsService;

    @RequestMapping(value = {"/client"}, method = RequestMethod.GET)
    public String client(Model model){
        List<Contractor> contractorList = contractorService.getAll();
        model.addAttribute("contractorList", contractorList);
        return "client";
    }

    @RequestMapping(value = {"/client/contractor/{id}"}, method = RequestMethod.GET)
    public String contractorInfo(Model model, @PathVariable("id") String id){
        Contractor contractor = contractorService.get(id);
        Image contractorImage = imageService.getAll().stream().filter(item -> item.getContractorId().equals(id)).findFirst().get();
        List<TypeContractor> typeContractor = typeContractorService.getall().stream().filter(item -> contractor.getTypeContractorId().contains(item.getId())).collect(Collectors.toList());
        List<ProvidedService> providedServices = pSService.getAll().stream().filter(item -> contractor.getProvidedServicesId().contains(item.getId())).collect(Collectors.toList());
        List<Location> locations = locationService.getall().stream().filter(item -> item.getContractorId().contains(id)).collect(Collectors.toList());
        List<SocialNetwork> socialNetworks = sNService.getall().stream().filter(item -> item.getContractorId().equals(id)).collect(Collectors.toList());
        List<Reviews> reviews = reviewsService.getAll().stream().filter(item -> item.getContractorId().equals(id)).collect(Collectors.toList());
        model.addAttribute("contractor", contractor);
        model.addAttribute("contractorImage", contractorImage);
        model.addAttribute("typeContractor", typeContractor);
        model.addAttribute("providedServices", providedServices);
        model.addAttribute("locations", locations);
        model.addAttribute("socialNetworks", socialNetworks);
        model.addAttribute("reviews", reviews);
        return "contractorInfo";
    }
}
