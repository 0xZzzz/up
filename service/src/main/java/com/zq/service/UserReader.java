package com.zq.service;

import com.zq.api.entity.UserVO;

public interface UserReader {

    UserVO getById(long id);

}
