package com.nanKangP1.VO;

public class Department {
    private int departmentID;
    private String departmentCode;
    private String departmentName;
    private String companyName;
    private boolean departmentValid;

    public Department(String departmentCode, String departmentName, String companyName, boolean departmentValid) {
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.companyName = companyName;
        this.departmentValid = departmentValid;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public boolean isDepartmentValid() {
        return departmentValid;
    }
}
