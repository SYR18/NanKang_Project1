package com.nanKangP1.DAO;

import com.nanKangP1.VO.Company;

import java.sql.SQLException;

public class CompanyDAO {
    static int insertCompany(String companyCode, String companyName, String companyAddress, int companyFax, boolean companyValid) throws SQLException, ClassNotFoundException {
        String sql = "";
        return BaseDAO.executeUpdate(sql, companyCode, companyName, companyAddress, companyFax, companyValid);
    }

    static int updateCompany(){
        return 0;
    }

    static int deleteCompany(int id) throws SQLException, ClassNotFoundException {
        String sql = "";
        return BaseDAO.executeUpdate(sql);
    }

    static Company queryCompany(){
        return null;
    }
}
