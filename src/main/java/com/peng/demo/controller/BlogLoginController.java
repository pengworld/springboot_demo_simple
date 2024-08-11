package com.peng.demo.controller;

import com.peng.demo.domain.ResponseResult;
import com.peng.demo.domain.entity.User;
import com.peng.demo.service.BlogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogLoginController {

    @Autowired
    private BlogLoginService blogLoginService;

    public ResponseResult login(@RequestBody User user){
        return blogLoginService.login(user);
    }
}
