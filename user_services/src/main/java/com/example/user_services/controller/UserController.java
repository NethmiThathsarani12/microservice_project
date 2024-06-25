package com.example.user_services.controller;

import com.example.user_services.dto.UserDTO;
import com.example.user_services.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<UserDTO> getAllVehicle(){
        return service.getAllUser();
    }

    @PostMapping
    public UserDTO saveVehicle(@RequestBody UserDTO dto){
        return service.saveUser(dto);
    }

    @PutMapping
    public UserDTO updateVehicle(@RequestBody UserDTO dto){
        return service.updateUser(dto);
    }
}
