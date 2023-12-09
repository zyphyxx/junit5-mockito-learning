package com.zpx.junitmockito.services;

import com.zpx.junitmockito.entities.User;
import com.zpx.junitmockito.repositories.UserRepository;
import com.zpx.junitmockito.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Integer id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("objeto não encontrado"));
    }
}
