package com.controller;

import com.alibaba.fastjson.JSONArray;
import com.domain.Book;
import com.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.BookInfoService;
import com.service.UsersService;
import com.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class BookInfoController {
    @Resource
    private BookInfoService bookInfoService;
    // 书籍查询（学生&管理员）
    @RequestMapping(value = "search",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<Object> searchBooks(@RequestBody Map<String, String> map) throws IOException {
        return bookInfoService.findBook(map.get("type"), map.get("content"), Integer.parseInt(map.get("currPage")), Integer.parseInt(map.get("pageSize")));
    }
    // 按图片进行书籍查询（学生&管理员）
    @RequestMapping(value = "searchPic",method = RequestMethod.POST)
    @ResponseBody
    public List<Object> searchBooksPic(@RequestParam("file") MultipartFile file) throws IOException {
        return bookInfoService.findBook(file);
    }
    // 书籍上架（管理员）
    @RequestMapping(value = "bookon", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String bookOn(@RequestBody List<Integer> list) throws JsonProcessingException {
        Map map = new HashMap();
        map.put("msg", bookInfoService.bookOn(list));
        ObjectMapper mapper = new ObjectMapper();
        String msg = mapper.writeValueAsString(map);
        return msg;
//        return bookInfoService.bookOn(JSONArray.parseArray(map.get("bcodes"), Integer.class));
    }
    // 书籍下架（管理员）
    @RequestMapping(value = "bookoff", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String bookOff(@RequestBody  List<Integer> list) throws JsonProcessingException {
        Map map = new HashMap();
        map.put("msg", bookInfoService.bookOff(list));
        ObjectMapper mapper = new ObjectMapper();
        String msg = mapper.writeValueAsString(map);
        return msg;
    }
}
