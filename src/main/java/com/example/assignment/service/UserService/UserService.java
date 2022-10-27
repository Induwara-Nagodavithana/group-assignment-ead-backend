package com.example.assignment.service.UserService;
import com.example.assignment.collection.User.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveOrUpdate(User user);

    List<User> getAllUsers();

    void delete(String id);

    Optional<User> getUserById(String id);


}

