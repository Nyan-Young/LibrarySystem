package com.controller;

import com.domain.Record;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.RecordsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RecordsController {
    @Resource
    private RecordsService recordsService;
    // 借阅登记（管理员）
    @RequestMapping(value = "borrow",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String borrowBook(@RequestBody Map<String, String> map) throws Exception {
        Map map0 = new HashMap();
        map0.put("msg", recordsService.borrowBook(Integer.parseInt((String) map.get("uid")), Integer.parseInt(map.get("bid"))));
        ObjectMapper mapper = new ObjectMapper();
        String msg = mapper.writeValueAsString(map0);
        return msg;
    }
    // 历史借阅查询（学生）
    @RequestMapping(value = "history", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<Object> borrowHistroy(@RequestBody Map<String, String> map) throws Exception{
        return recordsService.findRecord(Integer.parseInt(map.get("uid")), Integer.parseInt(map.get("currPage")), Integer.parseInt(map.get("pageSize")));
    }
    // 归还登记（管理员）
    @RequestMapping(value = "return", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String returnBook(@RequestBody Map<String, String> map) throws JsonProcessingException {
        Map map0 = new HashMap();
        map0.put("msg", recordsService.returnBook(Integer.parseInt((String) map.get("uid")), Integer.parseInt(map.get("bid"))));
        ObjectMapper mapper = new ObjectMapper();
        String msg = mapper.writeValueAsString(map0);
        return msg;
    }
    // 续借（学生）
    @RequestMapping(value = "delay", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String delay(Integer rid){
        return recordsService.returnDelay(rid);
    }
    // 书籍预约（学生）
    @RequestMapping(value = "reservation", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String reservation(Integer uid, Integer bcode){
        return recordsService.addReservation(uid, bcode);
    }
}
