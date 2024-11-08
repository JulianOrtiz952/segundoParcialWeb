package com.ufps.edu.co.SegundoParcialWeb.controller;

import com.ufps.edu.co.SegundoParcialWeb.entity.User;
import com.ufps.edu.co.SegundoParcialWeb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<ArrayList<User>> getAll(){
        return ResponseEntity.ok(userService.getUser());
    }

    @PostMapping
    public ResponseEntity<User> postUser(@RequestBody User user){
        return ResponseEntity.ok(userService.postUser(user));
    }

}
