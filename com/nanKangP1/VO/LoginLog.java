package com.nanKangP1.VO;

import java.util.Date;

public class LoginLog {
    private int loginLogID;
    private String loginUser;
    private Date loginDateCurrent;
    private Date loginDateLast;

    public LoginLog(String loginUser, Date loginDateCurrent, Date loginDateLast) {
        this.loginUser = loginUser;
        this.loginDateCurrent = loginDateCurrent;
        this.loginDateLast = loginDateLast;
    }

    public int getLoginLogID() {
        return loginLogID;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public Date getLoginDateCurrent() {
        return loginDateCurrent;
    }

    public Date getLoginDateLast() {
        return loginDateLast;
    }
}
