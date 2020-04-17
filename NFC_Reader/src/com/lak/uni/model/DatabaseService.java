package com.lak.uni.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseService {

	private Student student;
	private ArrayList<Student> studentList;
	private static final String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String user = "C##DB";
	private static final String pass = "admin";

	private static Connection con = null;
	private static PreparedStatement st = null;
	private static int rowsAffected = 0 ;
	private static ResultSet rs = null;
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public Student getStudent(String id) throws SQLException {

		int numberOfRowAffected = 0;
		/*String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "C##DB";
		String pass = "admin";*/

	/*	Connection con = null;
		PreparedStatement st = null;
		int rowsAffected = 0 ;
		ResultSet rs = null;*/

		try {

			con = DriverManager.getConnection(dbUrl,user,pass);
			//System.out.println("Connection successful "+dbUrl + "  user "+ user +"  pass "+ pass);

			st = con.prepareStatement("Select * FROM students WHERE st_UID = ?");
			st.setString(1, id);


			rs = st.executeQuery();

			while (rs.next()) {

				if(rs.getString("st_UID").equals(id)) {

					System.out.println("Student UID: " + rs.getString("st_UID") + " Student ID:" + rs.getString("st_ID") + "   Name:" + rs.getString("st_Name") + "   Course:" + rs.getString("st_course") + "   Batch:" + rs.getString("st_batch"));
					student = new Student(rs.getString("st_UID"), rs.getString("st_ID"), rs.getString("st_Name"), rs.getString("st_course"), rs.getString("st_batch"));
					return student;
				}

			}


		} catch (SQLException e) {
			System.out.println("Connection Fail");
			e.printStackTrace();

		}finally {

			st.close();
			con.close();
		}

	return 	null;
	}

	public int insertData(Student student) throws SQLException {
		
		int numberOfRowAffected = 0;
		/*String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "C##DB";
		String pass = "admin";*/

		/*Connection con = null;
		PreparedStatement st = null;
		int rowsAffected = 0 ;*/

		try {

			con = DriverManager.getConnection(dbUrl,user,pass);
			//System.out.println("Connection successful "+dbUrl + "  user "+ user +"  pass "+ pass);

			st = con.prepareStatement("INSERT INTO Students(st_UID,st_Id,st_Name,st_course,st_batch) VALUES (?, ?, ?, ?, ?)");
			st.setString(1, student.getUID());
			st.setString(2, student.getStId());
			st.setString(3, student.getName());
			st.setString(4, student.getCourse());
			st.setString(5, student.getBatch());
			
			rowsAffected = st.executeUpdate();

			/*
			 * rowsAffected = st.
			 * executeUpdate("INSERT INTO Students(st_UID,st_Id,st_Name,st_course,st_batch)\r\n"
			 * + "VALUES ('C3CF5340','2','Thilo','Nurshing','19/20')");
			 * 
			 * rowsAffected = st.
			 * executeUpdate("INSERT INTO Students(st_UID,st_Id,st_Name,st_course,st_batch)\r\n"
			 * + "VALUES ('D604B22B','3','david','network','19/20')");
			 * 
			 * rowsAffected = st.
			 * executeUpdate("INSERT INTO Students(st_UID,st_Id,st_Name,st_course,st_batch)\r\n"
			 * + "VALUES ('B3BADA40','4','Darshi','Helth Care','19/20')");
			 */


			System.out.println("Rows Inserted: "+rowsAffected);



		} catch (SQLException e) {
			System.out.println("Connection Fail");
			e.printStackTrace();

		}finally {

			st.close();
			con.close();


		}
		
		
		return numberOfRowAffected;
	}
	
	//////////////////////////////////////
	public int insertDataToAttendance(Student student) throws SQLException {
		
		int numberOfRowAffected = 0;
		
		try {

			con = DriverManager.getConnection(dbUrl,user,pass);
		
			st = con.prepareStatement("INSERT INTO Attendance(st_UID,st_Id,st_Name,st_course,st_batch) VALUES (?, ?, ?, ?, ?)");
			st.setString(1, student.getUID());
			st.setString(2, student.getStId());
			st.setString(3, student.getName());
			st.setString(4, student.getCourse());
			st.setString(5, student.getBatch());
			
			rowsAffected = st.executeUpdate();

			System.out.println("Rows Inserted: "+rowsAffected);



		} catch (SQLException e) {
			System.out.println("Connection Fail");
			e.printStackTrace();

		}finally {

			st.close();
			con.close();


		}
		
		
		return numberOfRowAffected;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int updateData(String id, Student student) throws SQLException {
		
		int numberOfRowAffected = 0;
	/*	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "C##DB";
		String pass = "admin";
*/
		/*Connection con = null;
		PreparedStatement st = null;	*/


		try {

			con = DriverManager.getConnection(dbUrl,user,pass);
			//System.out.println("Connection successful "+dbUrl + "  user "+ user +"  pass "+ pass);

			st = con.prepareStatement("UPDATE Students SET st_name = ?, st_course = ? WHERE st_UID = ?");
			st.setString(1, student.getName());
			st.setString(2, student.getCourse());
			st.setString(3, student.getUID());
			
			numberOfRowAffected = st.executeUpdate();
			
			//numberOfRowAffected = st.executeUpdate("UPDATE Students SET st_name = 'Praba', st_course = 'Mobile Dev' WHERE st_UID = 'D604B22B'");
			
			System.out.println("Row Updated Successuful:"+numberOfRowAffected);


		} catch (SQLException e) {
			System.out.println("Connection Fail");
			e.printStackTrace();

		}finally {

			st.close();
			con.close();


		}

		
		
		return numberOfRowAffected;
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int deleteData(String id) throws SQLException {
	
		int numberOfRowAffected = 0;
	/*	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "C##DB";
		String pass = "admin";*/

	/*	Connection con = null;
		PreparedStatement st = null;*/


		try {

			con = DriverManager.getConnection(dbUrl,user,pass);
			//System.out.println("Connection successful "+dbUrl + "  user "+ user +"  pass "+ pass);

			st = con.prepareStatement("DELETE FROM students WHERE st_UID = ?");
			st.setString(1, id);
			
			numberOfRowAffected = st.executeUpdate();

			System.out.println("Rows Affected: "+numberOfRowAffected);



		} catch (SQLException e) {
			System.out.println("Connection Fail");
			e.printStackTrace();

		}finally {

			st.close();
			con.close();


		}
	
	
		return numberOfRowAffected;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public ArrayList<Student> readAllData() throws SQLException{
		
		studentList = new ArrayList<Student>();
		/*String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "C##DB";
		String pass = "admin";*/

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;


		try {

			con = DriverManager.getConnection(dbUrl,user,pass);
			//System.out.println("Connection successful "+dbUrl + "  user "+ user +"  pass "+ pass);

			st = con.createStatement();
			
			rs = st.executeQuery("select * from students");
			
			while (rs.next()) {
				
				//System.out.println("Student UID: "+ rs.getString("st_UID")+" Student ID:"+rs.getString("st_ID")+"   Name:"+rs.getString("st_Name")+"   Course:"+rs.getString("st_course")+"   Batch:"+rs.getString("st_batch"));
				student = new Student(rs.getString("st_UID"),rs.getString("st_ID"),rs.getString("st_Name"),rs.getString("st_course"),rs.getString("st_batch"));
				studentList.add(student);
				
			}



		} catch (SQLException e) {
			System.out.println("Connection Fail");
			e.printStackTrace();

		}finally {

			st.close();
			con.close();

		}		
		
		return studentList;
	}

}
