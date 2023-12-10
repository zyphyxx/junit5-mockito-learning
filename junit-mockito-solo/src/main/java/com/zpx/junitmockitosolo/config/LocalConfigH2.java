package com.zpx.junitmockitosolo.config;

import com.zpx.junitmockitosolo.domains.User;
import com.zpx.junitmockitosolo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Profile("local")
public class LocalConfigH2 {

    @Autowired
    private UserRepository repository;

    @Bean
    public List<User> startDB() {
        User u1 = new User(1L, "Edgar", "edgar@gmail.com", "1234");
        User u2 = new User(2L, "Anny", "anny@gmail.com", "5678");
        User u3 = new User(3L, "Leo", "leo@gmail.com", "7890");

        List<User> userList = new ArrayList<>();

        userList.add(u1);
        userList.add(u2);
        userList.add(u3);

         return repository.saveAll(userList);
    }

}
