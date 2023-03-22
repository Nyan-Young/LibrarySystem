package com.service;

import com.domain.Book;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
public interface BookInfoService {
    // 书籍上架（管理员）
    String bookOn(List<Integer> bcodes);
    // 书籍下架（管理员）
    String bookOff(List<Integer> bcodes);
    // 根据搜索条件查找书籍，条件包括：无/书名/作者/bcode
    List<Object> findBook(String type, String content, Integer currPage, Integer pageSize) throws IOException;
    // 根据图片查找书籍
    List<Object> findBook(MultipartFile file) throws IOException;
}
