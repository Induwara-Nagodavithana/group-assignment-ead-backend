package com.example.assignment.repository;

import com.example.assignment.collection.User.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
