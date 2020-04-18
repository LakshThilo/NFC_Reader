package com.lak.uni.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DbConnector {
	
	private static final String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String user = "C##DB";
	private static final String pass = "admin";
	private static Connection con = null;
	private static Statement st;
	
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
	
	public static void deleteDBdata() {
		
		try {
			st = con.createStatement();
			st.execute("DELETE FROM Attendance");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
