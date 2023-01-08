package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.dto.UserDTO;

import java.util.List;
@Mapper
public interface UserMapper {

    public List<UserDTO> findUserList();

}
