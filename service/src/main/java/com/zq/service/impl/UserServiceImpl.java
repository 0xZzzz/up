package com.zq.service.impl;

import com.zq.api.UserReadService;
import com.zq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserReadService userReadService;

    public boolean auth(String username, String password) {
        return userReadService.auth(username, password);
    }
}