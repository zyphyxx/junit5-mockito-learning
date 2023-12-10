package com.zpx.junitmockitosolo.services.impl;

import com.zpx.junitmockitosolo.domains.User;
import com.zpx.junitmockitosolo.domains.dto.UserDTO;
import com.zpx.junitmockitosolo.repositories.UserRepository;
import com.zpx.junitmockitosolo.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(UserDTO obj) {
        obj.setId(null);
        return userRepository.save(mapper.map(obj, User.class));
    }
}
