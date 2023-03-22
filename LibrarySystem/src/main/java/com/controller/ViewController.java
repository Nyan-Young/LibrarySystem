package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ViewController {
    //网站首页页面
    @RequestMapping(value = "index",produces = "text/html;charset=UTF-8")
    public String index(){
        return "index";
    }
    //登录页面
    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }
    //注册页面
    @RequestMapping(value = "register")
    public String register(){
        return "register";
    }
    //退出登录
    @RequestMapping(value = "logout")
    public String logout(){
        return "login";
    }
    //个人信息-查看个人信息
    @RequestMapping(value = "user-info")
    public String user_info(){
        return "user-info";
    }
    //个人信息-修改密码
    @RequestMapping(value = "user-password")
    public String user_password(){
        return "user-password";
    }
    //书籍管理-书籍借阅
    @RequestMapping(value = "book-borrow")
    public String book_borrow(){
        return "book-borrow";
    }
    //书籍管理-查看&搜索书籍
    @RequestMapping(value = "book-list")
    public String book_list(){
        return "book-list";
    }
    //书籍管理-归还书籍
    @RequestMapping(value = "book-return")
    public String book_return(){
        return "book-return";
    }
    //书籍管理-借阅历史
    @RequestMapping(value = "book-history")
    public String book_history(){
        return "book-history";
    }
    //书籍管理-上架
    @RequestMapping(value = "book-on")
    public String book_on(){
        return "book-on";
    }
    //主页面-书籍管理-下架
    @RequestMapping(value = "book-off")
    public String book_off(){
        return "book-off";
    }
}
