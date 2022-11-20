package com.example.desafioapigft.dto.userDto;


import lombok.Data;


@Data
public class ConsultaUserDto {


    private Long id;
    private String email;
    private String password;


    public ConsultaUserDto() {
    }

    public ConsultaUserDto(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
