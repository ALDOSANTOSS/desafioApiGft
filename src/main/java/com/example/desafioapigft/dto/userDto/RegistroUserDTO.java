package com.example.desafioapigft.dto.userDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class RegistroUserDTO {
    private String email;
    private String password;


    public RegistroUserDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public RegistroUserDTO() {
    }
}
