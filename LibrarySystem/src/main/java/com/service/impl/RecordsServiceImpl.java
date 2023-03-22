package com.service.impl;

import com.dao.RecordsDao;
import com.domain.Record;
import com.service.RecordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RecordsServiceImpl implements RecordsService {
    @Resource
    private RecordsDao recordsDao;
    // 借阅登记（管理员）
    @Override
    public String borrowBook(Integer uid, Integer bid) {
        recordsDao.insertRecord(uid, bid);
        return "借阅登记成功！";
    }

    // 历史借阅查询（学生）
    @Override
    public List<Object> findRecord(Integer uid, Integer currPage, Integer pageSize) {
        Integer page = (currPage - 1) * pageSize;
        return recordsDao.selectHistory(uid, page, pageSize);
    }

    // 归还登记（管理员）
    @Override
    public String returnBook(Integer uid, Integer bid) {
        recordsDao.updateReturn(uid, bid);
        return "归还登记成功！";
    }

    // 续借（学生）
    @Override
    public String returnDelay(Integer rid) {
        Integer res = recordsDao.updateDeadline(rid);
        String delay = "续借成功！";
        if(res == 0){
            delay = "续借失败！";
        }
        return "续借成功！";
    }

    // 书籍预约（学生）
    @Override
    public String addReservation(Integer uid, Integer bcode) {
        Integer ret = recordsDao.insertReservation(uid, bcode);
        String res = "";
        if(ret == 1){
            res = "预约成功！请于今日之内联系管理员进行借阅登记";
        }else {
            res = "预约失败，已没有可预约书籍";
        }
        return res;
    }
}
