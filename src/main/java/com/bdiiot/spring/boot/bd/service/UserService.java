package com.bdiiot.spring.boot.bd.service;


import com.bdiiot.spring.boot.bd.model.User;

import java.util.List;

public interface UserService {

    public void save(User user);

    public User update(User user);

    public void deleteById(Long id);

    public List<User> findAll();

    public User get(Long id);

}
