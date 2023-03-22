package com.service;

import com.domain.User;

public interface UsersService {
    // 学生注册（注册结果：注册成功/学生已注册/学生信息不存在）
    String addUser(User user);
    // 学生&管理员登录（登录结果：登录成功/用户不存在/密码错误/（学生）用户被冻结）
    String findUser(Integer uid, String password, String status);
    // 个人信息修改--密码修改（除密码外的其它个人信息都固定不可更改）
    String changePassword(Integer uid,String p_old,String password);
    // 管理员冻结超期学生用户
    String freezeStudent();
}
