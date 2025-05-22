package com.security.defense.service;

import com.security.defense.entity.Users;
import com.security.defense.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users register(Users user){
        return userRepository.save(user);
    }
}
