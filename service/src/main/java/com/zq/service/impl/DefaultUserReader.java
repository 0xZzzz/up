package com.zq.service.impl;

import com.zq.service.UserReader;
import com.zq.api.entity.UserVO;
import com.zq.dao.UserDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserReader implements UserReader {

    @Autowired
    private UserDao userDao;

    public UserVO getById(long id) {
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userDao.getById(id), userVO);
        return userVO;
    }

}
