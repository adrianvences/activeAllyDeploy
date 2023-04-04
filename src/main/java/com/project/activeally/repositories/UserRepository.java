package com.project.activeally.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.project.activeally.models.User;


public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}