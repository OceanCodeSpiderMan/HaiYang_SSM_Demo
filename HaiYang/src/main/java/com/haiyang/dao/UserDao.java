package com.haiyang.dao;

import com.haiyang.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user where user_name=#{uname} and user_password=#{upwd}")
    @Results({
            @Result(column = "user_name",property = "uname"),
            @Result(column = "user_password",property = "upwd")
    })
    User findUser(User user);
    @Insert("insert into user(user_name,user_password) values(#{uname},#{upwd})")
    int userRegister(User user);
}
