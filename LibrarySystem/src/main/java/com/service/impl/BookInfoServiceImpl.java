package com.service.impl;
import com.dao.BookInfoDao;
import com.domain.Book;
import com.service.BookInfoService;
import com.utils.Utils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class BookInfoServiceImpl implements BookInfoService {
    @Resource
    private BookInfoDao bookInfoDao;

    // 书籍上架（管理员）
    @Override
    public String bookOn(List<Integer> bcodes) {
        bookInfoDao.updateBooks(bcodes, true);
        return "共" + bcodes.size() + "本书上架成功！";
    }

    // 书籍下架（管理员）
    @Override
    public String bookOff(List<Integer> bcodes) {
        bookInfoDao.updateBooks(bcodes, false);
        return "共" + bcodes.size() + "本书下架成功！";
    }

    // 根据搜索条件查找书籍，条件包括：无/书名/作者/bcode
    @Override
    public List<Object> findBook(String type, String content, Integer currPage, Integer pageSize) throws IOException {
        List<Object> books = null;
        Integer page = (currPage - 1) * pageSize;
        switch (type) {
            case "all":
                books = bookInfoDao.selectBooks(page, pageSize);
                break;
            case "bookname":
                content = "%" + content + "%";
                books = bookInfoDao.selectBooksByName(content, page, pageSize);
                break;
            case "author":
                content = "%" + content + "%";
                books = bookInfoDao.selectBooksByAuthor(content, page, pageSize);
                break;
            case "available":
                Boolean available = false;
                if (content.equals("on")) {
                    available = true;
                }
                books = bookInfoDao.selectBooksByAvailable(available, page, pageSize);
                break;
            case "bcode":
                books = bookInfoDao.selectBooksByBcode(Integer.parseInt(content), page, pageSize);
                break;
        }
        return books;
    }

    // 根据图片查找书籍
    @Override
    public List<Object> findBook(MultipartFile file) throws IOException {
        List<Object> books = null;
        Integer currPage = 1;
        Integer pageSize = 10;
        Integer page = (currPage - 1) * pageSize;
        List<String> ll = Utils.getImageHistogram(Utils.transferToFile(file));
        books = bookInfoDao.selectBooksByPic(ll, page, pageSize);
        return books;
    }

}
