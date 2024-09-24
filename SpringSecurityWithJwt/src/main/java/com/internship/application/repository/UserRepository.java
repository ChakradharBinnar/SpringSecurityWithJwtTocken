package com.internship.application.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.internship.application.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
