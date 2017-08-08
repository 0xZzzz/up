package com.zq.api.impl;

import com.zq.api.AdministratorReadService;
import org.springframework.stereotype.Service;

@Service
public class AdministratorReadServiceImpl implements AdministratorReadService {

    @Override
    public boolean auth(String username, String password) {
        return false;
    }

}
