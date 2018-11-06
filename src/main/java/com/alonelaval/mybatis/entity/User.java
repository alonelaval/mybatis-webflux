package com.alonelaval.mybatis.entity;

import java.util.Date;

public class User {
    private Integer userId;

    private String loginName;

    private String loginPassword;

    private String phone;

    private String userRealName;

    private String idcard;

    private Short age;

    private String birthday;

    private Byte gender;

    private Byte regSource;

    private String regTerminal;

    private String province;

    private String city;

    private String icon;

    private String county;

    private String address;

    private String email;

    private Integer consumeCount;

    private Byte state;

    private Date createTime;

    private Date lastUpdateTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Byte getRegSource() {
        return regSource;
    }

    public void setRegSource(Byte regSource) {
        this.regSource = regSource;
    }

    public String getRegTerminal() {
        return regTerminal;
    }

    public void setRegTerminal(String regTerminal) {
        this.regTerminal = regTerminal;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getConsumeCount() {
        return consumeCount;
    }

    public void setConsumeCount(Integer consumeCount) {
        this.consumeCount = consumeCount;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", phone='" + phone + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", idcard='" + idcard + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", gender=" + gender +
                ", regSource=" + regSource +
                ", regTerminal='" + regTerminal + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", icon='" + icon + '\'' +
                ", county='" + county + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", consumeCount=" + consumeCount +
                ", state=" + state +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}