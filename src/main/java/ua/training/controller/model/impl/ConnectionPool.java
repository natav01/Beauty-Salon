package ua.training.controller.model.impl;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionPool {
	  private static volatile DataSource dataSource;
	    public static DataSource getDataSource(){

	        if (dataSource == null){
	            synchronized (ConnectionPool.class) {
	                if (dataSource == null) {
	                    BasicDataSource ds = new BasicDataSource();
	                    ds.setUrl("jdbc:mysql://localhost:3306/beauty?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false");
	                    ds.setUsername("root");
	                    ds.setPassword("12345");
	                    ds.setMinIdle(5);
	                    ds.setMaxIdle(10);
	                    ds.setMaxOpenPreparedStatements(100);
	                    dataSource = ds;
	                }
	            }
	        }
	        return dataSource;

	    }
}
