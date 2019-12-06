package com.bdiiot.spring.boot.bd.service.impl;

import com.bdiiot.spring.boot.bd.dao.UserRepository;
import com.bdiiot.spring.boot.bd.model.User;
import com.bdiiot.spring.boot.bd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User get(Long id) {
        return userRepository.getOne(id);
    }


}
