package com.ais.service;

import com.ais.dao.UserRepository;
import com.ais.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username,String password){

        User user = userRepository.findByUsernameAndPassword(username,password);
        return user;
    };
}
