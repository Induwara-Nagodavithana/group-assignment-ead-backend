package com.example.assignment.controller;

import com.example.assignment.collection.User.User;
import com.example.assignment.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/save")
    public User create(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        userService.delete(id);
    }

    @GetMapping("/getUserById")
    public Optional<User> getUserById(@RequestParam(name = "user_Id") String id){
        return userService.getUserById(id);
    }

    @PostMapping("/update")
    public User save(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }

    @GetMapping("/getByEmail")
    public List<User> getByEmail(@RequestParam(name = "email") String email){
        return userService.getAllByEmail(email);
    }

    @GetMapping("/lastName")
    public List<User> getAllByLastName(@RequestParam(name = "lastName") String lastName){
        return userService.getAllByLastName(lastName);
    }


}
