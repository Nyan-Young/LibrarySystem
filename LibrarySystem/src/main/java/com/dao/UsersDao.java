package com.dao;

import com.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDao {
    // 用户表插入新用户
    void insertUser(User user);
    // 查询用户id是否存在
    Integer selectUid(Integer uid);
    // 查询用户密码
    String selectPassword(Integer uid);
    // 查询学生用户
    User selectStu(Integer uid);
    // 查询管理员用户
    User selectAdmin(Integer uid);
    // 更新用户密码
    void updatePassword(@Param("uid") Integer uid, @Param("password") String password);
    // 将用户表用户状态更新为“frozen“
    Integer updateFrozen();
}
