package com.zq.api.impl;

import com.zq.api.UserReadService;
import com.zq.api.entity.UserVO;
import com.zq.dao.UserDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserReadServiceImpl implements UserReadService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserVO getById(long id) {
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userDao.getById(id), userVO);
        return userVO;
    }

}
