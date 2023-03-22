package com.domain;

import java.sql.Timestamp;


public class Record {
    //记录id
    private Integer rid;
    //书籍id
    private Integer bid;
    //用户id
    private Integer uid;
    //书名
    private String bookname;
    //作者
    private String author;
    //预约时间
    private Timestamp reservation;
    //借出时间
    private Timestamp borrowTime;
    //归还期限
    private Timestamp deadline;
    //归还时间
    private Timestamp returnTime;

    public Record(Integer rid, Integer bid, Integer uid, String bookname, String author, Timestamp reservation, Timestamp borrowTime, Timestamp deadline, Timestamp returnTime) {
        this.rid = rid;
        this.bid = bid;
        this.uid = uid;
        this.bookname = bookname;
        this.author = author;
        this.reservation = reservation;
        this.borrowTime = borrowTime;
        this.deadline = deadline;
        this.returnTime = returnTime;
    }

    public Record(String bookname, String author, Integer rid, Timestamp reservation, Timestamp borrowTime, Timestamp deadline, Timestamp returnTime) {
        this.bookname = bookname;
        this.author = author;
        this.reservation = reservation;
        this.borrowTime = borrowTime;
        this.deadline = deadline;
        this.returnTime = returnTime;
        this.rid = rid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public Timestamp getReservation() {
        return reservation;
    }

    public void setReservation(Timestamp reservation) {
        this.reservation = reservation;
    }

    public Timestamp getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Timestamp borrowTime) {
        this.borrowTime = borrowTime;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public Timestamp getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Timestamp returnTime) {
        this.returnTime = returnTime;
    }
}
