package com.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsDao {
    // 查询sid和name为如下取值的记录是否存在，存在则返回sid，否则返回null
    Integer selectStudent(@Param("sid") Integer sid, @Param("name") String name);
}
