package com.pragma.academic.infrastructure;

import com.pragma.academic.domain.model.User;

public interface UserRepository {
    void saveUser(User user);
    User findUserById(String id);
    void deleteUser(String id);
}