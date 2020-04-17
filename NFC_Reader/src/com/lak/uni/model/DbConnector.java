package com.lak.uni.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DbConnector {
	
	private static final String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String user = "C##DB";
	private static final String pass = "admin";
	private static Connection con = null;
	
	public static Connection getDbConnector() {
		
		
		try {
			
			con = DriverManager.getConnection(dbUrl,user,pass);
			System.out.println("Connection Successeful");
			//JOptionPane.showMessageDialog(null, "Connection Successeful");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
			return null;
		}
		
		
	}

}
