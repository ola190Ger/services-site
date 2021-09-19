package com.art.tbl.controller.ui;
/*
@author ArtemFrunze
@class ContractorController
@date 15.09.2021
@time 19:21 
*/

import com.art.tbl.form.ContractorForm;
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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/web/contractors")
@Controller
public class ContractorController {
    @Autowired
    ContractorServiceImpl contractorService;

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

    @Autowired
    ImageServiceImpl imageService;

    @RequestMapping(value = {"/", "/admin"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "admin";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String contractorList(Model model){
        model.addAttribute("contractors", contractorService.getAll());
        return "contractorList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteContractor(Model model, @PathVariable("id") String id)
    {
        contractorService.delete(id);
        return "redirect:/web/contractors/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editContractor(Model model, @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        ContractorForm contractorForm = new ContractorForm(contractor.getName(), contractor.getPhone().get(0),
                contractor.getBirthday().toString(), contractor.getDescription());
        model.addAttribute("contractorForm", contractorForm);
        return "editContractor";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editContractor(Model model,
                               @ModelAttribute("contractorForm") ContractorForm contractorForm,
                               @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        contractor.setName(contractorForm.getName());
        List<String> phones = contractor.getPhone();
        phones.set(0, contractorForm.getPhone());
        contractor.setPhone(phones);
        contractor.setBirthday(LocalDate.parse(contractorForm.getBirthday()));
        contractor.setDescription(contractorForm.getDescription());
        contractorService.update(contractor);
        return "redirect:/web/contractors/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addContractor(Model model)
    {
        Contractor contractor = new Contractor();
        model.addAttribute("contractorForm", contractor);
        return "addContractor";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContractor(Model model,
                              @ModelAttribute("contractorForm") ContractorForm contractorForm)
    {
        List<String> phone = new ArrayList<>(
                Arrays.asList(
                        contractorForm.getPhone()
                )
        );
        Contractor contractor = new Contractor( contractorForm.getName(), phone, LocalDate.parse(contractorForm.getBirthday()),
                contractorForm.getDescription(), null, null, null);
        contractorService.create(contractor);
        return "redirect:/web/contractors/list";
    }

    @RequestMapping(value = "/addTypeContractor/{id}", method = RequestMethod.GET)
    public String addTypeContractorToContractor(Model model, @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        List<String> typeContractorsId = typeContractorService.getall().stream()
                .map(TypeContractor::getId).collect(Collectors.toList());
        TypeContractor typeContractor = new TypeContractor();
        model.addAttribute("contractor", contractor);
        model.addAttribute("typeContractorsId", typeContractorsId);
        model.addAttribute("typeContractor", typeContractor);
        return "addTypeContractorToContractor";
    }

    @RequestMapping(value = "/addTypeContractor/{id}", method = RequestMethod.POST)
    public String addTypeContractorToContractor(Model model,
                                                @ModelAttribute("typeContractor") TypeContractor typeContractor,
                                                @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        contractor.getTypeContractorId().add(typeContractor.getId());
        contractorService.update(contractor);
        return "redirect:/web/contractors/addTypeContractor/{id}";
    }

   @RequestMapping(value = "/addProvideService/{id}", method = RequestMethod.GET)
    public String addProvideServiceToContractor(Model model, @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        List<String> provideServicesId = pSService.getAll().stream()
                .map(ProvidedService::getId).collect(Collectors.toList());
        ProvidedService providedService = new ProvidedService();
        model.addAttribute("contractor", contractor);
        model.addAttribute("provideServicesId", provideServicesId);
        model.addAttribute("providedService", providedService);
        return "addProvideServiceToContractor";
    }

    @RequestMapping(value = "/addProvideService/{id}", method = RequestMethod.POST)
    public String addProvideServiceToContractor(Model model,
                                                @ModelAttribute("providedService") ProvidedService providedService,
                                                @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        contractor.getProvidedServicesId().add(providedService.getId());
        contractorService.update(contractor);
        return "redirect:/web/contractors/addProvideService/{id}";
    }

    @RequestMapping(value = "/addLocation/{id}", method = RequestMethod.GET)
    public String addLocationToContractor(Model model, @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        List<Location> locCont = locationService.getall().stream().filter(item -> item.getContractorId()
                .contains(id)).collect(Collectors.toList());
        List<String> locationsId = locationService.getall().stream()
                .map(Location::getId).collect(Collectors.toList());
        Location location = new Location();
        model.addAttribute("contractor", contractor);
        model.addAttribute("locationsId", locationsId);
        model.addAttribute("locCont", locCont);
        model.addAttribute("location", location);
        return "addLocationToContractor";
    }

    @RequestMapping(value = "/addLocation/{id}", method = RequestMethod.POST)
    public String addLocationToContractor(Model model,
                                                @ModelAttribute("location") Location location,
                                                @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        Location locationUp = locationService.get(location.getId());
        locationUp.getContractorId().add(contractor.getId());
        locationService.update(locationUp);
        return "redirect:/web/contractors/addLocation/{id}";
    }

    @RequestMapping(value = "/addSocialNetwork/{id}", method = RequestMethod.GET)
    public String addSocialNetworkToContractor(Model model, @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        List<SocialNetwork> socNet = sNService.getall().stream().filter(item -> item.getContractorId()
                .equals(id)).collect(Collectors.toList());
        SocialNetwork socialNetwork = new SocialNetwork();
        model.addAttribute("contractor", contractor);
        model.addAttribute("socNet", socNet);
        model.addAttribute("socialNetwork", socialNetwork);
        return "addSocialNetworkToContractor";
    }

    @RequestMapping(value = "/addSocialNetwork/{id}", method = RequestMethod.POST)
    public String addSocialNetworkToContractor(Model model,
                                          @ModelAttribute("socialNetwork") SocialNetwork socialNetwork,
                                          @PathVariable("id") String id)
    {
        socialNetwork.setContractorId(id);
        sNService.create(socialNetwork);
        return "redirect:/web/contractors/addSocialNetwork/{id}";
    }

    @RequestMapping(value = "/addReviews/{id}", method = RequestMethod.GET)
    public String addReviewsToContractor(Model model, @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        List<Reviews> reviewsList = reviewsService.getAll().stream().filter(item -> item.getContractorId()
                .equals(id)).collect(Collectors.toList());
        Reviews reviews = new Reviews();
        model.addAttribute("contractor", contractor);
        model.addAttribute("reviewsList", reviewsList);
        model.addAttribute("reviews", reviews);
        return "addReviewsToContractor";
    }

    @RequestMapping(value = "/addReviews/{id}", method = RequestMethod.POST)
    public String addReviewsToContractor(Model model,
                                               @ModelAttribute("reviews") Reviews reviews,
                                               @PathVariable("id") String id)
    {
        reviews.setContractorId(id);
        reviewsService.create(reviews);
        return "redirect:/web/contractors/addReviews/{id}";
    }

    @RequestMapping(value = "/addImage/{id}", method = RequestMethod.GET)
    public String addImageToContractor(Model model, @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        Image contractorImage = imageService.getAll().stream().filter(item -> item.getContractorId()
        .equals(id)).findFirst().get();
        model.addAttribute("contractor", contractor);
        model.addAttribute("contractorImage", contractorImage);
        return "addImageToContractor";
    }

    @RequestMapping(value = "/addImage/{id}", method = RequestMethod.POST)
    public String addImageToContractor(Model model,
                                         @ModelAttribute("contractorImage") Image image,
                                         @PathVariable("id") String id)
    {
        Image contractorImage = imageService.getAll().stream().filter(item -> item.getContractorId()
                .equals(id)).findFirst().get();
        contractorImage.setImageUrl(image.getImageUrl());
        imageService.update(contractorImage);
        return "redirect:/web/contractors/addImage/{id}";
    }
}
