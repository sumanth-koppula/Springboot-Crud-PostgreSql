package com.springboot.crud.service;

import com.springboot.crud.entity.UserEntity;
import com.springboot.crud.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser( UserEntity userEntity) {

        return userRepository.save(userEntity);
    }

    @Override
    public String deleteUser(Long id, UserEntity userEntity) {
        Optional<UserEntity> userEntity1 = userRepository.findById(id);
        String name = userEntity1.get().getName();
        userRepository.deleteById(id);
        return name +" with id "+id+" is deleted";
    }
}
