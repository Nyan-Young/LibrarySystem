package com.controller;

import com.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UsersController {
    @Resource
    private UsersService usersService;

    // 根据信息注册新用户&反馈是否注册成功（学生）
    @RequestMapping(value = "register0", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String register0(Integer uid, String name, String password) {
        User user = new User(name, uid, password);
        return usersService.addUser(user);
    }

    // 登录&反馈是否登录成功（学生&管理员）
    @RequestMapping(value = "login0", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String login0(Integer uid, String password, String status) {
        return usersService.findUser(uid, password, status);
    }

    // 个人信息（密码）修改（学生&管理员）
    @RequestMapping(value = "resetPassword", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String resetPassword(@RequestBody Map<String, String> map) throws JsonProcessingException {
        Map map0 = new HashMap();
        map0.put("msg", usersService.changePassword(Integer.valueOf(map.get("uid")), map.get("p_old"), map.get("password")));
        ObjectMapper mapper = new ObjectMapper();
        String msg = mapper.writeValueAsString(map0);
        return msg;
    }

    // 冻结超期学生用户（管理员）
    @RequestMapping(value = "freeze", method = RequestMethod.GET, produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String freezeAccout() throws JsonProcessingException {
        Map map = new HashMap();
        map.put("msg", usersService.freezeStudent());
        ObjectMapper mapper = new ObjectMapper();
        String msg = mapper.writeValueAsString(map);
        return msg;
    }
}