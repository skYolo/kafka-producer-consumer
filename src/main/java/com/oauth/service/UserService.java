package com.oauth.service;

import java.util.List;

import com.oauth.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
