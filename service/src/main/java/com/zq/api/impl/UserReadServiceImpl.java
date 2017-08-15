package com.zq.api.impl;

import com.zq.api.UserReadService;
import org.springframework.stereotype.Service;

@Service
public class UserReadServiceImpl implements UserReadService {

    @Override
    public boolean auth(String username, String password) {
        return false;
    }

}
