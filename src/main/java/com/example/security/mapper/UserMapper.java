package com.example.security.mapper;

import com.example.security.entity.SysUser;

import java.util.List;

public interface UserMapper {

    List<SysUser> getAll();
    List<SysUser> getAllUserEntity();
    SysUser getById(long id);
    SysUser checkLogin(String username,String password);

    SysUser getByUsername(String username);
}
