package com.zq.dao;

import com.zq.entity.Administrator;

/**
 * 管理员DAO
 */
public interface AdministratorDao {

    /**
     * 根据管理员id获取管理员信息
     *
     * @param id 管理员id
     * @return 管理员信息
     */
    Administrator getById(long id);

    /**
     * 主键更新
     *
     * @param administrator 管理员信息
     * @return effect rows
     */
    int update(Administrator administrator);

}
