package com.example.security.service;

import com.example.security.entity.SysUser;
import com.example.security.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserMapper userMapper;

    public List<SysUser> getAll() {
        return userMapper.getAll();
    }

    public SysUser getById(long id) {
        return userMapper.getById(id);
    }
    public SysUser getByUsername(String username) {
        return userMapper.getByUsername(username);
    }
    public List<SysUser> getAllUserEntity() {
        return userMapper.getAllUserEntity();
    }


    public SysUser login(String username,String password) {
       SysUser entity = userMapper.checkLogin(username,password);
      return entity;
    }


}