package com.example.exampleproject.service;

import com.example.exampleproject.entity.User;
import com.example.exampleproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUserById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public User updateUser(Long id, User user) {
        User existing = getUserById(id);

        if (existing != null) {
            existing.setName(user.getName());
            existing.setEmail(user.getEmail());
            existing.setAge(user.getAge());
            return repository.save(existing);
        }

        return null;
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
