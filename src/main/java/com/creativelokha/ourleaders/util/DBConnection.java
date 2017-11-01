package com.creativelokha.ourleaders.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

/**
 * Created by Guru on 10/11/2017.
 */
public class DBConnection {
	final static Logger LOGGER = Logger.getLogger(DBConnection.class);
	final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String HOST = "182.50.133.89";
	final static String PORT = "3306";
	final static String DATABASE = "CLS_DB";
	final static String USERNAME = "tooladmin";
	final static String PASSWORD = "test@123";
	private Connection connection = null;
	
	public DBConnection(){
		createConnection();
	}

	private void createConnection() {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE, USERNAME, PASSWORD);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean closeConnection(Connection con){
		try {
			if(con != null){
				con.close();
			}	
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Connection getConnection() {
		return connection;
	}	
	
}