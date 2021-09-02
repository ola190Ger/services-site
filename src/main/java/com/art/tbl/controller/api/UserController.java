package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class UserController
@date 01.09.2021
@time 19:56 
*/

import com.art.tbl.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/user")
public class UserController {
    @RequestMapping("/getone")
    public User getone()
    {
        return new User("1", "name", "surname", "email", "pass",
                "description", LocalDateTime.now(), LocalDateTime.now());
    }
}
