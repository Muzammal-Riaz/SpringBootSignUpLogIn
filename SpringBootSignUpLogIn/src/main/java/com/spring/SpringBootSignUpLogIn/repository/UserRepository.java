package com.spring.SpringBootSignUpLogIn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringBootSignUpLogIn.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}