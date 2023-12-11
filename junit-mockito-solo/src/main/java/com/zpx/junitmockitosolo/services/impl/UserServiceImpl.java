package com.zpx.junitmockitosolo.services.impl;

import com.zpx.junitmockitosolo.domains.User;
import com.zpx.junitmockitosolo.domains.dto.UserDTO;
import com.zpx.junitmockitosolo.repositories.UserRepository;
import com.zpx.junitmockitosolo.services.UserService;
import com.zpx.junitmockitosolo.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public User findUserById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("ID de Usuario não encontrado " + id));
    }
}
