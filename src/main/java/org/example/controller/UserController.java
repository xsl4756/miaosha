package org.example.controller;

import org.example.dto.UserDTO;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/get")
    public List<UserDTO> findUserList(){
        System.out.println("aa");
        List<UserDTO> userList = userService.findUserList();
        System.out.println(userList);
        System.out.println("aaa");
        System.out.println("aaa");
        return userList;
    }

}
