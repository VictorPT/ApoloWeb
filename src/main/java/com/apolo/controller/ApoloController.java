package com.apolo.controller;

import com.apolo.entity.User;
import com.apolo.service.IUserService;
import com.apolo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
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
    public User addUser(@Valid @RequestBody User user){
        return userServiceImpl.addUser(user);
    }

    @DeleteMapping(value= "/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id){
        userServiceImpl.deleteById(id);
    }

}
