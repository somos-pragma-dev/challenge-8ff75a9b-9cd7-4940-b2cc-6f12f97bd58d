package com.pragma.academic;

import com.pragma.academic.application.UserService;
import com.pragma.academic.application.UserServiceImpl;
import com.pragma.academic.domain.model.User;
import com.pragma.academic.infrastructure.UserRepository;
import com.pragma.academic.infrastructure.UserRepositoryImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {
    private UserService userService;

    @BeforeEach
    public void setUp() {
        UserRepository userRepository = new UserRepositoryImpl();
        userService = new UserServiceImpl(userRepository);
    }

    @Test
    public void testCreateUser() {
        User user = userService.createUser("1", "John Doe", "john.doe@example.com", "student");
        assertNotNull(user);
        assertEquals("1", user.getId());
    }

    @Test
    public void testGetUserById() {
        userService.createUser("1", "John Doe", "john.doe@example.com", "student");
        User user = userService.getUserById("1");
        assertNotNull(user);
        assertEquals("John Doe", user.getName());
    }

    @Test
    public void testUpdateUser() {
        User user = userService.createUser("1", "John Doe", "john.doe@example.com", "student");
        user.setName("Jane Doe");
        userService.updateUser(user);
        User updatedUser = userService.getUserById("1");
        assertEquals("Jane Doe", updatedUser.getName());
    }

    @Test
    public void testDeleteUser() {
        userService.createUser("1", "John Doe", "john.doe@example.com", "student");
        userService.deleteUser("1");
        User user = userService.getUserById("1");
        assertEquals(null, user);
    }
}