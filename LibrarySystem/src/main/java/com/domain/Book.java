package com.domain;

import java.util.List;

public class Book {
    //书籍编号
    private Integer bcode;
    //书籍id
    private List<Integer> bid;
    //书名
    private String bookname;
    //作者
    private String author;
    //是否上架
    private Boolean available;
    //简介
    private String introduction;
    //书籍总数
    private Integer total;
    //书籍余量
    private Integer rest;

//    public Book(Integer bcode, String bookname, String author, String available, String introduction, Integer total, Integer rest) {
//        this.bcode = bcode;
//        this.bookname = bookname;
//        this.author = author;
//        this.available = available;
//        this.introduction = introduction;
//        this.total = total;
//        this.rest = rest;
//    }

    public Book(Integer bcode, String bookname, String author, Boolean available, String introduction, Long rest, Long total) {
        this.bcode = bcode;
        this.total = Math.toIntExact(total);
        this.bookname = bookname;
        this.author = author;
        this.available = available;
        this.introduction = introduction;
        this.rest = Math.toIntExact(rest);
    }

    public Book(String bookname, String author, String introduction) {
        this.bookname = bookname;
        this.author = author;
        this.introduction = introduction;
    }

    public Integer getBcode() {
        return bcode;
    }

    public void setBcode(Integer bcode) {
        this.bcode = bcode;
    }

    public List<Integer> getBid() {
        return bid;
    }

    public void setBid(List<Integer> bid) {
        this.bid = bid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getRest() {
        return rest;
    }

    public void setRest(Integer rest) {
        this.rest = rest;
    }
}
