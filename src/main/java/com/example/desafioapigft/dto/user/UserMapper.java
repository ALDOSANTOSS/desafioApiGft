package com.example.desafioapigft.dto.user;

import com.example.desafioapigft.entity.User;

public class UserMapper {

    public static User fromDTO(RegistroUserDTO dto){
        return new User(dto.getEmail(),dto.getPassword());
    }

    public static ConsultaUserDto fromEntity(User user){
        return new ConsultaUserDto(user.getId(),user.getEmail(),user.getPassword());
    }
}
