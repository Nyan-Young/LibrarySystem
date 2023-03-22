package com.domain;


public class User {
    //用户id
    private Integer uid;
    //姓名
    private String name;
    //密码
    private String password;
    //性别
    private String gender;
    //学院
    private String department;
    //年级
    private String grade;
    //身份
    private String status;

    public User(Integer uid, String password) {
        this.uid = uid;
        this.password = password;
    }

    public User(Integer uid, String password, String status) {
        this.uid = uid;
        this.password = password;
        this.status = status;
    }

    public User(String name, Integer uid,  String password) {
        this.name = name;
        this.uid = uid;
        this.password = password;
    }

    public User(Integer uid, String name, String password, String gender, String department, String grade, String status) {
        this.uid = uid;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.department = department;
        this.grade = grade;
        this.status = status;
    }

    public Integer getUid() {
        return uid;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String res = "";
        if (status.equals("admin")){
            res = "uid=" + uid +
                    ", name=管理员" +
                    ", gender=不可见"+
                    ", department=不可见"+
                    ", grade=不可见"+
                    ", status=管理员";
        } else {
            res = "uid=" + uid +
                    ", name=" + name +
                    ", gender=" + gender +
                    ", department=" + department +
                    ", grade=" + grade +
                    ", status=学生";
        }
        return res;
    }
}
