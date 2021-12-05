package com.example.mbs01.daos;

import com.example.mbs01.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, Integer> {
    public Optional<User> findByUsername(String username);
}
