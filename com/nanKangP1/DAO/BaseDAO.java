package com.nanKangP1.DAO;


import com.nanKangP1.DAO.JDBC.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


abstract class BaseDAO {
    int executeUpdate(String sql, Object...o) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = JDBCUtils.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for(int i=1;i<o.length;i++){
            preparedStatement.setObject(i,o[i-1]);
        }

        return preparedStatement.executeUpdate();
    }


}
