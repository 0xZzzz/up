package com.zq.service.impl;

import com.zq.api.UserService;
import com.zq.api.entity.UserVO;
import com.zq.service.UserReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserReader userReader;

    public UserVO getById(long id) {
        return userReader.getById(id);
    }
}
