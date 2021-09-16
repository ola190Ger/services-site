package com.art.tbl.controller.ui;
/*
@author ArtemFrunze
@class ContractorController
@date 15.09.2021
@time 19:21 
*/

import com.art.tbl.form.ContractorForm;
import com.art.tbl.model.Contractor;
import com.art.tbl.model.TypeContractor;
import com.art.tbl.service.contractor.impls.ContractorServiceImpl;
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

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "index";
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
        model.addAttribute("contractor", contractor);
        model.addAttribute("typeContractorsId", typeContractorsId);
        return "addTypeContractorToContractor";
    }

    @RequestMapping(value = "/addTypeContractor/{id}", method = RequestMethod.POST)
    public String addTypeContractorToContractor(Model model,
                                                @ModelAttribute("typeContractorsId") String typeContractorId,
                                                @PathVariable("id") String id)
    {
        Contractor contractor = contractorService.get(id);
        contractor.getTypeContractorId().add(typeContractorId);
        contractorService.update(contractor);
        return "addTypeContractorToContractor";
    }
}
