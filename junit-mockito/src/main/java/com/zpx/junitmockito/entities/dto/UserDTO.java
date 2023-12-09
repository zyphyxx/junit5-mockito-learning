package com.zpx.junitmockito.entities.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {


    private Integer id;
    private String name;
    private String email;

    @JsonIgnore
    private String password;
}
