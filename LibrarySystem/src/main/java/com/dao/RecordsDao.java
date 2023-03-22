package com.dao;

import com.domain.Record;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
@Repository
public interface RecordsDao {
    // 根据uid查询借阅历史记录
    List<Object> selectHistory(@Param("uid")Integer uid, @Param("currPage")Integer currPage, @Param("pageSize")Integer pageSize);
    // 插入借阅记录（非预约）
    void insertRecord(@Param("uid") Integer uid, @Param("bid") Integer bid);
    // 插入借阅记录（预约）
    Integer insertReservation(@Param("uid") Integer uid, @Param("bcode") Integer bcode);
    // 根据uid更新还书期限
    Integer updateDeadline(Integer rid);
    // 更新还书时间
    void updateReturn(@Param("uid") Integer uid, @Param("bid") Integer bid);
}
