package com.spring.SpringBootSignUpLogIn.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}