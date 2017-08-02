package com.zq.dao;

import com.zq.entity.Administrator;

/**
 * 管理员DAO
 */
public interface AdministratorDao {

    /**
     * 根据管理员id获取管理员信息
     */
    Administrator getById(long id);

    /**
     * 主键更新
     */
    int update(Administrator administrator);

}
