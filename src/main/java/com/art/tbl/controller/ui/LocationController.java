package com.art.tbl.controller.ui;
/*
@author ArtemFrunze
@class LocationController
@date 14.09.2021
@time 21:44 
*/

import com.art.tbl.dto.LocationDTO;
import com.art.tbl.model.Contractor;
import com.art.tbl.model.Location;
import com.art.tbl.service.contractor.impls.ContractorServiceImpl;
import com.art.tbl.service.location.impls.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/web/locations")
@Controller
public class LocationController {
    @Autowired
    LocationServiceImpl locationService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String locationList(Model model){
        model.addAttribute("locations", locationService.getall());
        return "locationList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteLocation(Model model, @PathVariable("id") String id)
    {
        locationService.delete(id);
        return "redirect:/web/locations/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editLocation(Model model, @PathVariable("id") String id)
    {
        LocationDTO location = locationService.get(id);
        model.addAttribute("location", location);
        return "editLocation";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editLocation(Model model,
                                   @ModelAttribute("location") LocationDTO location,
                                   @PathVariable("id") String id)
    {
        locationService.update(location);
        return "redirect:/web/locations/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addLocation(Model model)
    {
        LocationDTO location = new LocationDTO();
//        List<String> contractorId = contractorService.getAll().stream()
//                .map(Contractor::getId).collect(Collectors.toList());
        model.addAttribute("location", location);
//        model.addAttribute("contractorId", contractorId);
        return "addLocation";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addLocation(Model model,
                                  @ModelAttribute("location") LocationDTO location)
    {
        locationService.create(location);
        return "redirect:/web/locations/list";
    }
}
