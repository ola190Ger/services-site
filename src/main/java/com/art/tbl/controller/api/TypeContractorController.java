package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class TypeContractorController
@date 01.09.2021
@time 19:54 
*/

import com.art.tbl.model.TypeContractor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/typecontractor")
public class TypeContractorController {
    @RequestMapping("/getone")
    public TypeContractor getone()
    {
        return new TypeContractor("1", "name", LocalDateTime.now(), LocalDateTime.now());
    }
}
