package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class ProvidedService
@date 01.09.2021
@time 19:41 
*/

import com.art.tbl.model.ProvidedService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/providedservice")
public class ProvidedServiceController {
    @RequestMapping("/getone")
    public ProvidedService getone()
    {
        return new ProvidedService("1", "name", LocalDateTime.now(), LocalDateTime.now());
    }
}
