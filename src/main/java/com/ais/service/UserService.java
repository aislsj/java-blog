package com.ais.service;

import com.ais.entity.User;

public interface UserService   {
    User checkUser(String username,String password);
}
