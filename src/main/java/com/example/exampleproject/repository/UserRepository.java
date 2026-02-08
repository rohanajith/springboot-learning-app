package com.example.exampleproject.repository;

// Create JPA repository for User

import com.example.exampleproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
