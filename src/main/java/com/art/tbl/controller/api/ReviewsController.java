package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class ReviewsController
@date 01.09.2021
@time 19:45 
*/

import com.art.tbl.model.Reviews;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/reviews")
public class ReviewsController {
    @RequestMapping("/getone")
    public Reviews getone()
    {
        return new Reviews("1", "text", LocalDateTime.now(), LocalDateTime.now());
    }
}
