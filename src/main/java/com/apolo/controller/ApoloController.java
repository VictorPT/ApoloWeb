package com.apolo.controller;

import com.apolo.entity.User;
import com.apolo.service.IUserService;
import com.apolo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apolo")
public class ApoloController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping(value = "/userList")
    public List<User> getUsers(){
        return userServiceImpl.findAll();
    }

    @PostMapping(value = "/addUser")
    public User addUser(User user){
        return userServiceImpl.addUser(user);
    }

}
