package com.crudapp.crud.controller;

import com.crudapp.crud.model.User;
import com.crudapp.crud.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
@AllArgsConstructor
public class UsrControl {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/all")
    public List<User> getUsers(User user) {
        return this.userService.getAllUser(user);
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable String userId) {
        return this.userService.getUserById(Long.parseLong(userId));
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/user/{userId}")
    public void deleteUser(@PathVariable String userId){
         userService.deleteUser(Long.parseLong(userId));
    }
}
