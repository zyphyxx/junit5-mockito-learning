package com.zpx.junitmockito.config;

import com.zpx.junitmockito.entities.User;
import com.zpx.junitmockito.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public Object startDB() {
        User u1 = new User(1, "Valdir", "valdir@mail.com", "123");
        User u2 = new User(2, "Luiz", "luiz@mail.com", "123");

        repository.saveAll(List.of(u1, u2));


        return new Object();
    }
}
