package com.springboot.crud.controller;

import com.springboot.crud.entity.UserEntity;
import com.springboot.crud.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<UserEntity> findAllUsers(UserEntity userEntity){
        return userService.findAllUsers();
    }
    @GetMapping("/{id}")
    public Optional<UserEntity> findUserById(@PathVariable("id") Long id){
        return userService.findById(id);
    }
    @PostMapping
    public UserEntity saveUser(@RequestBody  UserEntity userEntity) {
        return userService.saveUser(userEntity);
    }
    @PutMapping
    public UserEntity updateUser(@RequestBody UserEntity userEntity) {
        return userService.saveUser(userEntity);
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id,UserEntity userEntity){
         return userService.deleteUser(id,userEntity);
    }
}
