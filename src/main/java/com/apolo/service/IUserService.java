package com.apolo.service;

import com.apolo.entity.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User addUser(User user);

}
