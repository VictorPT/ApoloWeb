package com.apolo.service;

import com.apolo.entity.User;
import com.apolo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.repository = userRepository;
    }

    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

    public User addUser(User user){
        return repository.save(user);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }

}
