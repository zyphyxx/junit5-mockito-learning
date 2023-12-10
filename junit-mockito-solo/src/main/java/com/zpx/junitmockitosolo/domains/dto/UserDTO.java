package com.zpx.junitmockitosolo.domains.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String name;
    private String email;

    @JsonIgnore
    private String password;
}
