package com.zpx.junitmockitosolo.resources;

import com.zpx.junitmockitosolo.domains.User;
import com.zpx.junitmockitosolo.domains.dto.UserDTO;
import com.zpx.junitmockitosolo.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper mapper;

    private static final String ID = "/{id}";

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAllUser() {
        List<UserDTO> objs = userService.findAllUser()
                .stream().map(x -> mapper.map(x, UserDTO.class)).toList();
        return ResponseEntity.ok().body(objs);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO obj) {

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path(ID)
                .buildAndExpand(obj.getId())
                .toUri();

        User newObj = userService.createUser(mapper.map(obj, UserDTO.class));

        return ResponseEntity.created(uri).body(newObj);
    }


}
