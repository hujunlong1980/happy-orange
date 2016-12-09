package com.happy.orange.mybatis.entity.vo;

import java.util.Date;

public class User {
    private Integer id;

    private String loginName;

    private String account;

    private String userType;

    private String password;

    private String dealPwd;

    private String realName;

    private Integer referee;

    private String inviteCode;

    private String email;

    private String mobile;

    private String idcard;

    private String openid;

    private String blacklist;

    private String locked;

    private Date createTime;

    private Date lastupdate;

    private Integer manager;

    private String sourceFrom;

    private Date lastLogintime;

    private String emailVerified;

    private String mobileVerified;

    private String idcardVerified;

    private String headImg;

    private Integer failureTimes;

    private String sex;

    private Date birthday;

    private String registertype;

    private Integer userCfpId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDealPwd() {
        return dealPwd;
    }

    public void setDealPwd(String dealPwd) {
        this.dealPwd = dealPwd == null ? null : dealPwd.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getReferee() {
        return referee;
    }

    public void setReferee(Integer referee) {
        this.referee = referee;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(String blacklist) {
        this.blacklist = blacklist == null ? null : blacklist.trim();
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public String getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
    }

    public Date getLastLogintime() {
        return lastLogintime;
    }

    public void setLastLogintime(Date lastLogintime) {
        this.lastLogintime = lastLogintime;
    }

    public String getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(String emailVerified) {
        this.emailVerified = emailVerified == null ? null : emailVerified.trim();
    }

    public String getMobileVerified() {
        return mobileVerified;
    }

    public void setMobileVerified(String mobileVerified) {
        this.mobileVerified = mobileVerified == null ? null : mobileVerified.trim();
    }

    public String getIdcardVerified() {
        return idcardVerified;
    }

    public void setIdcardVerified(String idcardVerified) {
        this.idcardVerified = idcardVerified == null ? null : idcardVerified.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    public Integer getFailureTimes() {
        return failureTimes;
    }

    public void setFailureTimes(Integer failureTimes) {
        this.failureTimes = failureTimes;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRegistertype() {
        return registertype;
    }

    public void setRegistertype(String registertype) {
        this.registertype = registertype == null ? null : registertype.trim();
    }

    public Integer getUserCfpId() {
        return userCfpId;
    }

    public void setUserCfpId(Integer userCfpId) {
        this.userCfpId = userCfpId;
    }
}