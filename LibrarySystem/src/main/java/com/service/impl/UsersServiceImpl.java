package com.service.impl;

import com.dao.StudentsDao;
import com.dao.UsersDao;
import com.domain.User;
import com.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;
    @Resource
    private StudentsDao studentsDao;
    // 学生注册（注册结果：注册成功/学生已注册/学生信息不存在）
    @Override
    public String addUser(User user) {
        String res = "";
        if (studentsDao.selectStudent(user.getUid(), user.getName()) == null) {
            res = "学生信息不存在";
        }
        else if (usersDao.selectUid(user.getUid()) == null) {
            usersDao.insertUser(user);
            res = "注册成功";
        } else {
            res = "用户已存在，不能重复注册";
        }
        return res;
    }
    // 学生&管理员登录（登录结果：登录成功/用户不存在/密码错误/（学生）用户被冻结）
    @Override
    public String findUser(Integer uid, String password, String status) {
        User user = null;
        if(status.equals("admin")){
            user = usersDao.selectAdmin(uid);
        }else{
            user = usersDao.selectStu(uid);
        }
        String res = "";
        if (user == null) {
            res = "用户不存在！";
        } else if (!user.getPassword().equals(password)) {
            res = "密码错误！";
        } else if (user.getStatus().equals("frozen")) {
            res = "账户被冻结，请联系管理员！";
        } else {
            res = user.toString();
        }
        return res;
    }
    // 个人信息修改--密码修改（除密码外的其它个人信息都固定不可更改）
    @Override
    public String changePassword(Integer uid, String p_old, String password) {
        String res = "";
        if(!usersDao.selectPassword(uid).equals(p_old)){
            res="密码输入不正确！";
        }else{
            usersDao.updatePassword(uid, password);
            res="修改成功！";
        }
        return res;
    }

    // 管理员冻结超期学生用户
    @Override
    public String freezeStudent() {
        Integer t = usersDao.updateFrozen();
        return "共冻结" + t.toString() + "个超期用户！";
    }
}