package com.lak.uni.sampleDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadAll {

	public static void main(String[] args) throws SQLException {
		
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "C##DB";
		String pass = "admin";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;	
	//	int rowsAffected = 0 ;

		try {

			con = DriverManager.getConnection(dbUrl,user,pass);
			System.out.println("Connection successful "+dbUrl + "  user "+ user +"  pass "+ pass);

			st = con.createStatement();
			
			rs = st.executeQuery("select * from students");
			
			while (rs.next()) {
				
				System.out.println("Student ID:"+rs.getString("st_ID")+"   Name:"+rs.getString("st_Name")+"   Course:"+rs.getString("st_course")+"   Batch:"+rs.getString("st_batch"));
				
			}



		} catch (SQLException e) {
			System.out.println("Connection Fail");
			e.printStackTrace();

		}finally {

			st.close();
			con.close();


		}

		
	}

}
