package com.zpx.junitmockitosolo.services;

import com.zpx.junitmockitosolo.domains.User;
import com.zpx.junitmockitosolo.domains.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<User> findAllUser ();
    User createUser (UserDTO obj);
}
