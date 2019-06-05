package com.chamal.ecom.controllers;

import com.chamal.ecom.models.User;
import com.chamal.ecom.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    UserRepo repo;

    @RequestMapping("/signIn")
    public User signIn(@RequestBody User user){
        return repo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }
    @GetMapping("/{id}")
    public Optional<User> get(@PathVariable int id){
        return repo.findById(id);
    }
    @CrossOrigin("*")
    @GetMapping
    public List<User> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public User add(@RequestBody User user){
        return repo.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        repo.deleteById(id);
    }

}
