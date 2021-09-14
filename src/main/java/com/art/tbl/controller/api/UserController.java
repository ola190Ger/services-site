package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class UserController
@date 01.09.2021
@time 19:56 
*/

import com.art.tbl.model.User;
import com.art.tbl.service.user.impls.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserServiceImpl service;

    @RequestMapping("/getall")
    public List<User> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    public User get(@PathVariable("id") String id)
    {
        return service.get(id);
    }

    @RequestMapping("/create")
    public User create(@RequestBody User user){
        return service.create(user);
    }
    @RequestMapping("/update")
    public User update(@RequestBody User user){
        return service.update(user);
    }
    @RequestMapping("/delete/{id}")
    public User delete(@PathVariable("id") String id)
    {
        return service.delete(id);
    }
}
