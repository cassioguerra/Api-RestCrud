package com.example.DEV.controller;

import com.example.DEV.entities.User;
import com.example.DEV.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired // DEPENDENCIA DE INJEÇÃO
    private UserRepository repository;

    @GetMapping // para fazer consuta por lista completa
    public List<User> findAll(){
      List<User> result = repository.findAll();
      return  result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User result = repository.findById(id).get();
        return  result;
    }


    @PostMapping
    public User inser(@RequestBody User user){
        User result = repository.save(user);
        return  result;
    }




}
