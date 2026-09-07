package com.pragma.academic.infrastructure;

import com.pragma.academic.domain.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private final Map<String, User> userMap = new HashMap<>();

    @Override
    public void saveUser(User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public User findUserById(String id) {
        return userMap.get(id);
    }

    @Override
    public void deleteUser(String id) {
        userMap.remove(id);
    }
}