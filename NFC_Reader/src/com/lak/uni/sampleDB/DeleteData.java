package com.lak.uni.sampleDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
	
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

			rowsAffected = st.executeUpdate("DELETE FROM students WHERE st_UID ='B3BADA40'");



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
