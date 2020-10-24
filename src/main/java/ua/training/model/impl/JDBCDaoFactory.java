package ua.training.model.impl;


import javax.sql.DataSource;

import ua.training.model.mapper.DaoFactory;
import ua.training.model.mapper.UserDao;

import java.sql.Connection;

import java.sql.SQLException;

public class JDBCDaoFactory extends DaoFactory {

    private DataSource dataSource = ConnectionPool.getDataSource();

    @Override
    public UserDao createUserDao() {
        return new JDBCUserDao(getConnection());
    }
   

    private Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
