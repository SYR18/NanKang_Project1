package com.nanKangP1.VO;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String userName;
    private String loginName;
    private String password;
    private Date createDate;
    private String company;
    private String department;

    public User(String userName, String loginName, String password, Date createDate, String company, String department) {
        this.userName = userName;
        this.loginName = loginName;
        this.password = password;
        this.createDate = createDate;
        this.company = company;
        this.department = department;
    }

    public String getUserName() {
        return userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getPassword() {
        return password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getCompany() {
        return company;
    }

    public String getDepartment() {
        return department;
    }
}
