package com.kimi.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author kimijiaqili
 * @since 2020-12-07 21:33:06
 */
public class User implements Serializable {
    private static final long serialVersionUID = -63416819495632884L;
    /**
    * 用户ID，自动递增
    */
    private Integer id;
    /**
    * 用户名
    */
    private String username;
    /**
    * 用户密码
    */
    private String password;
    /**
    * 头像url
    */
    private String avatarurl;
    /**
    * 用户类型：1平台账号、2微信、3QQ
    */
    private Object userType;
    /**
    * 用户手机号码
    */
    private Integer telNum;
    /**
    * 邮件
    */
    private String email;
    /**
    * 注册时间
    */
    private Date registerTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public Object getUserType() {
        return userType;
    }

    public void setUserType(Object userType) {
        this.userType = userType;
    }

    public Integer getTelNum() {
        return telNum;
    }

    public void setTelNum(Integer telNum) {
        this.telNum = telNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

}