package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class LocationController
@date 01.09.2021
@time 19:39 
*/

import com.art.tbl.model.Location;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/location")
public class LocationController {
    @RequestMapping("getone")
    public Location getone()
    {
        return new Location("1", "country", "region", "city", LocalDateTime.now(), LocalDateTime.now());
    }
}
