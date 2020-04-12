package com.lak.uni.sampleDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {


	public static void main(String[] args) throws SQLException {


		String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "C##DB";
		String pass = "admin";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;	
		int rowsAffected = 0 ;

		try {

			con = DriverManager.getConnection(dbUrl,user,pass);
			System.out.println("Connection successful "+dbUrl + "  user "+ user +"  pass "+ pass);

			st = con.createStatement();

			rowsAffected = st.executeUpdate("INSERT INTO Students(st_UID,st_Id,st_Name,st_course,st_batch)\r\n" + 
					"VALUES ('C3CF5340','2','Thilo','Nurshing','19/20')");
			
			rowsAffected = st.executeUpdate("INSERT INTO Students(st_UID,st_Id,st_Name,st_course,st_batch)\r\n" + 
					"VALUES ('D604B22B','3','david','network','19/20')");
			
			rowsAffected = st.executeUpdate("INSERT INTO Students(st_UID,st_Id,st_Name,st_course,st_batch)\r\n" + 
					"VALUES ('B3BADA40','4','Darshi','Helth Care','19/20')");


			System.out.println("Rows Affected: "+rowsAffected);



		} catch (SQLException e) {
			System.out.println("Connection Fail");
			e.printStackTrace();

		}finally {

			st.close();
			con.close();


		}
	}

}
