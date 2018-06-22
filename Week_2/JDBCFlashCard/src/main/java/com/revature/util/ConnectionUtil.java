package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	
	private static ConnectionUtil cu = null;
	private static Boolean build = true;
	
	private ConnectionUtil(){
		
		super();
		
	}
	
	public synchronized static ConnectionUtil getInstance(){
		
		if(build){
			
			cu = new ConnectionUtil();
			build = false;
			
		}
		
		return cu;
		
	}
	
	public Connection getConnection() throws SQLException{
		
		Properties prop = new Properties();
		Connection conn = null;
		try {
			prop.load(new FileReader("src/main/resources/database.properties"));
			String url = prop.getProperty("url");
			String username = prop.getProperty("usr");
			String password = prop.getProperty("pwd");
			conn = DriverManager.getConnection(url, username, password);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	
	}

}
