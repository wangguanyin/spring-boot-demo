package com.spring.boot.mapper;

import com.spring.boot.po.User;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User queryById(int id);
}
