package com.zpx.junitmockito.controllers;


import com.zpx.junitmockito.entities.User;
import com.zpx.junitmockito.entities.dto.UserDTO;
import com.zpx.junitmockito.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(mapper.map(userService.findById(id), UserDTO.class));
    }
    @GetMapping
    public ResponseEntity<List<UserDTO>>findAll () {
        List<UserDTO> userDTOS = new ArrayList<>();

        return ResponseEntity.ok().body(mapper.map(userService.findAll(), userDTOS.getClass()).stream().toList());
    }



}
