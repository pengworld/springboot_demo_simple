package com.peng.demo.service;

import com.peng.demo.domain.ResponseResult;
import com.peng.demo.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);
}
