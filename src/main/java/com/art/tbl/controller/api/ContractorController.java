package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class ContractorController
@date 01.09.2021
@time 19:58 
*/

import com.art.tbl.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/contractor")
public class ContractorController {
    @RequestMapping("/getone")
    public Contractor getone()
    {
        return new Contractor("1", "name", "phone", LocalDate.now(), "description", null, new Location(),
                new TypeContractor(), null, null, null, null, LocalDate.now(),
                new User(), LocalDateTime.now(), LocalDateTime.now());
    }
}
