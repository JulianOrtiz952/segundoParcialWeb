package com.ufps.edu.co.SegundoParcialWeb.service;

import com.ufps.edu.co.SegundoParcialWeb.entity.User;
import com.ufps.edu.co.SegundoParcialWeb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ArrayList<User> getUser(){
        return (ArrayList<User>) userRepository.findAll();
    }

    public User postUser(User user){
        return userRepository.save(user);
    }

}
