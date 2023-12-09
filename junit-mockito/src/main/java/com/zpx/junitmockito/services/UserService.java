package com.zpx.junitmockito.services;

import com.zpx.junitmockito.entities.User;
import com.zpx.junitmockito.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findById (Integer id) {
        Optional<User> obj = userRepository.findById(id);
        obj.orElseThrow(() -> new RuntimeException("user não encontrado"));
        return obj;
    }
}
