package com.zq.api;

import com.zq.api.entity.UserVO;

public interface UserReadService {

    UserVO getById(long id);

}
