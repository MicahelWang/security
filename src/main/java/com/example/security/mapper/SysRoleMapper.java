package com.example.security.mapper;

import com.example.security.entity.SysRole;
import com.example.security.entity.SysRoleExample;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    int insert(SysRole record);

    int insertSelective(SysRole record);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);
}