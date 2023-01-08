package org.example.service;

import org.example.dao.UserMapper;
import org.example.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
 @Autowired
 private UserMapper userMapper;

    public List<UserDTO> findUserList(){

        return userMapper.findUserList();
    };
}
