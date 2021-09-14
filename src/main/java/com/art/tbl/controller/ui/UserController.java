package com.art.tbl.controller.ui;
/*
@author ArtemFrunze
@class UserController
@date 14.09.2021
@time 22:27 
*/

import com.art.tbl.model.Location;
import com.art.tbl.model.User;
import com.art.tbl.service.user.impls.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/web/users")
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String userList(Model model){
        model.addAttribute("users", userService.getAll());
        return "userList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(Model model, @PathVariable("id") String id)
    {
        userService.delete(id);
        return "redirect:/web/users/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editUser(Model model, @PathVariable("id") String id)
    {
        User user = userService.get(id);
        model.addAttribute("user", user);
        return "editUser";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editUser(Model model,
                               @ModelAttribute("user") User user,
                               @PathVariable("id") String id)
    {
        userService.update(user);
        return "redirect:/web/users/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUser(Model model)
    {
        User user = new User();
        model.addAttribute("user", user);
        return "addUser";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(Model model,
                              @ModelAttribute("user") User user)
    {
        userService.create(user);
        return "redirect:/web/users/list";
    }
}
