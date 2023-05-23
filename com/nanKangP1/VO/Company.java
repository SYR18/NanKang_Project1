package com.nanKangP1.VO;

public class Company {
    private int companyID;
    private String companyCode;
    private String companyName;
    private String companyAddress;
    private int companyFax;
    private boolean companyValid;

    public Company(String companyCode, String companyName, String companyAddress, int companyFax, boolean companyValid) {
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyFax = companyFax;
        this.companyValid = companyValid;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public int getCompanyFax() {
        return companyFax;
    }

    public boolean isCompanyValid() {
        return companyValid;
    }
}
