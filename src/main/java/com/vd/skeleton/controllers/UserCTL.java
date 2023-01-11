package com.vd.skeleton.controllers;

import com.vd.skeleton.modelo.User;
import com.vd.skeleton.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserCTL
{
    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    @CrossOrigin
    public List<User> list()
    {
        return userRepo.findAll();
    }

    @PostMapping(value = "/")
    @CrossOrigin
    public User save(@RequestBody User userNvo)
    {
        return userRepo.save(userNvo);
    }
}