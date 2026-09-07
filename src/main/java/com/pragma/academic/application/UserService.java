package com.pragma.academic.application;

import com.pragma.academic.domain.model.User;

public interface UserService {
    User createUser(String id, String name, String email, String role);
    User getUserById(String id);
    void updateUser(User user);
    void deleteUser(String id);
}