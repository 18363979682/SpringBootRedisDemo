package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by user on 2019/4/2.
 */
@Mapper
public interface UserDao {

    @Select("select user_id,user_name,user_code,password from user where user_id=#{userId}")
    User getUser(@Param("userId") String userId);
}
