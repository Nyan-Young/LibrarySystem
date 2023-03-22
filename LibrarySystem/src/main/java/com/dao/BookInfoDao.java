package com.dao;

import com.domain.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookInfoDao {
    // 书籍上架/下架
    void updateBooks(@Param("bcodes") List<Integer> bcodes, @Param("available") Boolean available);
    // 查找所有上架书籍
    List<Object> selectBooks(@Param("currPage")Integer currPage, @Param("pageSize")Integer pageSize);
    // 根据书名模糊查找书籍
    List<Object> selectBooksByName(@Param("bookname") String bookname, @Param("currPage")Integer currPage, @Param("pageSize")Integer pageSize);
    // 根据作者模糊查找书籍
    List<Object> selectBooksByAuthor(@Param("author") String author, @Param("currPage")Integer currPage, @Param("pageSize")Integer pageSize);
    // 根据bcode查找书籍
    List<Object> selectBooksByBcode(@Param("bcode") Integer bcode, @Param("currPage")Integer currPage, @Param("pageSize")Integer pageSize);
    // 根据是否上架查找书籍
    List<Object> selectBooksByAvailable(@Param("available") Boolean available, @Param("currPage")Integer currPage, @Param("pageSize")Integer pageSize);
    // 根据书名列表查找书籍
    List<Object> selectBooksByPic(@Param("books")List<String> books, @Param("currPage")Integer currPage, @Param("pageSize")Integer pageSize);
}
