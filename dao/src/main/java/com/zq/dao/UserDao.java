package com.zq.dao;

import com.zq.entity.User;

public interface UserDao {

    User getById(long id);

    int update(User user);

}
