package com.example.desafioapigft.controller;

import com.example.desafioapigft.dto.userDto.ConsultaUserDto;
import com.example.desafioapigft.dto.userDto.RegistroUserDTO;
import com.example.desafioapigft.dto.userDto.UserMapper;
import com.example.desafioapigft.entity.User;
import com.example.desafioapigft.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<ConsultaUserDto>> buscarTodosUser() {
        return ResponseEntity.ok(userService.buscarTodos().stream().map(UserMapper::fromEntity).collect(Collectors.toList()));
    }

    @PostMapping
    public ResponseEntity<ConsultaUserDto> salvarUser(@RequestBody RegistroUserDTO dto) {
        User user = userService.saveUser(UserMapper.fromDTO(dto));
        return ResponseEntity.ok(UserMapper.fromEntity(user));
    }





}
