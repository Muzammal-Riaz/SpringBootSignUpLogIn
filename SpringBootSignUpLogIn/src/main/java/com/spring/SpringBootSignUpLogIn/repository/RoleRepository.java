package com.spring.SpringBootSignUpLogIn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringBootSignUpLogIn.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}