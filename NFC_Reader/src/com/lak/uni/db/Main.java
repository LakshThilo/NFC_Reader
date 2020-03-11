package com.lak.uni.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException
	{

		String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "C##DB";
		String pass = "admin";
	
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
			
		
		  try { Class.forName("oracle.jdbc.driver.OracleDriver"); } catch
		  (ClassNotFoundException e1) { // TODO Auto-generated catch block
		  e1.printStackTrace(); }
		  
		 
			try {
				
				con = DriverManager.getConnection(dbUrl,user,pass);
				System.out.println("Connection successful "+dbUrl + "  user "+ user +"  pass "+ pass);
				
				st = con.createStatement();
				
				rs = st.executeQuery("select * from students");
				
				while (rs.next()) {
					System.out.println("valuse");
					System.out.println(rs.getString("st_Name"));
					
				}
				
			} catch (SQLException e) {
				System.out.println("Connection Fail");
				e.printStackTrace();
			
			}finally {
				
				rs.close();
				st.close();
				con.close();
				
				
			}
			

		

	}

}
