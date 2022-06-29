package com.ferreira.costa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferreira.costa.demo.entity.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
