package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class SubscriptionController
@date 01.09.2021
@time 19:49 
*/

import com.art.tbl.model.Contractor;
import com.art.tbl.model.Subscription;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/subscription")
public class SubscriptionController {
    @RequestMapping("/getone")
    public Subscription getone()
    {
        return new Subscription("1", new Contractor(), LocalDate.now(), LocalDate.now(), LocalDateTime.now(), LocalDateTime.now());
    }
}
