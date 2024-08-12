package com.peng.demo.handler.security;

import com.peng.demo.domain.ResponseResult;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        authException.printStackTrace();

        ResponseResult result = null;
        if (authException instanceof BadCredentialsException) {
            //LOGIN_ERROR

        } else if (authException instanceof InsufficientAuthenticationException) {
            //NEED_LOGIN

        } else {
            //SYSTEM_ERROR

        }
    }
}
