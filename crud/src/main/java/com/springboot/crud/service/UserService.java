package com.springboot.crud.service;

import com.springboot.crud.entity.UserEntity;
import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity> findAllUsers();

    Optional<UserEntity> findById(Long id);
    UserEntity saveUser(UserEntity userEntity);

    UserEntity updateUser( UserEntity userEntity);

    String deleteUser(Long id, UserEntity userEntity);
}
