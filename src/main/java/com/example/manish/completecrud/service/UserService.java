package com.example.manish.completecrud.service;

import com.example.manish.completecrud.entity.UserModel;
import com.example.manish.completecrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel createUser(UserModel userModel) { // ask the particular question
        return userRepository.save(userModel);
    }
}
