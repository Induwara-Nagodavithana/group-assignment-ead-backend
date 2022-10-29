package com.example.assignment.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.assignment.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService implements UserDetailsService,AuthServiceInt {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {


        System.out.println(userName);
        List<com.example.assignment.collection.User.User> users=userRepository.findByEmail(userName);
        System.out.println(users);
        return new User("admin","password",new ArrayList<>());
    }


}
