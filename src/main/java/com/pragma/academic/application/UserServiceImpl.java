package com.pragma.academic.application;

import com.pragma.academic.domain.model.User;
import com.pragma.academic.domain.model.Student;
import com.pragma.academic.domain.model.Professor;
import com.pragma.academic.domain.model.Admin;
import com.pragma.academic.infrastructure.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(String id, String name, String email, String role) {
        User user = switch (role) {
            case "student" -> new Student(id, name, email, id);
            case "professor" -> new Professor(id, name, email, id);
            case "admin" -> new Admin(id, name, email, id);
            default -> throw new IllegalArgumentException("Rol no válido");
        };
        userRepository.saveUser(user);
        return user;
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.saveUser(user);
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteUser(id);
    }
}