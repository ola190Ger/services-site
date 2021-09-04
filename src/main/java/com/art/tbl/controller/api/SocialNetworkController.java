package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class SocialNetworkController
@date 01.09.2021
@time 19:46 
*/


import com.art.tbl.model.SocialNetwork;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/socialnetwork")
public class SocialNetworkController {
    @RequestMapping("/getone")
    public SocialNetwork getone()
    {
        return new SocialNetwork("1", "name", "url", LocalDateTime.now(), LocalDateTime.now());
    }
}
