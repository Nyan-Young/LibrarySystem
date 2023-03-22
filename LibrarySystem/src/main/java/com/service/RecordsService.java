package com.service;

import com.domain.Record;

import java.util.List;

public interface RecordsService {
    // 借阅登记（管理员）
    String borrowBook(Integer uid, Integer bid);
    // 历史借阅查询（学生）
    List<Object> findRecord(Integer uid, Integer currPage, Integer pageSize);
    // 归还登记（管理员）
    String returnBook(Integer uid, Integer bid);
    // 续借（学生）
    String returnDelay(Integer rid);
    // 书籍预约（学生）
    String addReservation(Integer uid, Integer bid);
}
