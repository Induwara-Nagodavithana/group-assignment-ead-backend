package com.example.assignment.service.UserService;
import com.example.assignment.collection.User.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> getAllUsers();
}

