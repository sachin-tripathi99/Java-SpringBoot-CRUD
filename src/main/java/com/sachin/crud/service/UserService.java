package com.sachin.crud.service;

import com.sachin.crud.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUser();
    User updateUser(User user);
    void deleteUser(Long id);
}
