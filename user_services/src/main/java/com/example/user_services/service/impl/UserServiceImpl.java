package com.example.user_services.service.impl;

import com.example.user_services.dto.UserDTO;
import com.example.user_services.entity.User;
import com.example.user_services.repo.UserRepo;
import com.example.user_services.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public UserDTO saveUser(UserDTO dto) {
        if (repo.existsById(dto.getId())){
            new RuntimeException("all ready exits");
        }
        return mapper.map(repo.save(mapper.map(dto, User.class)),UserDTO.class);
    }

    @Override
    public UserDTO updateUser(UserDTO dto) {
        if (repo.existsById(dto.getId())){
            new RuntimeException("all ready exits");
        }
        return mapper.map(repo.save(mapper.map(dto, User.class)),UserDTO.class);
    }

    @Override
    public List<UserDTO> getAllUser() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<UserDTO>>() {
        }.getType()); }

}
