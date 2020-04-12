package com.lak.uni.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lak.uni.veiw.StudentDetail;
import com.lak.uni.model.DatabaseService;
import com.lak.uni.model.Student;
import com.lak.uni.veiw.Connect;

public class CardDetails
{
	//private StudentList studentList;
	private String UID;
	private DatabaseService service;
	
	
	

	public CardDetails(String UID)
	{
		this.UID = UID;
		//studentList = new StudentList();
		service = new DatabaseService();
			
		
	}
	
	public void getStudentDetails() {
		//String stId, String name, String course, String batch
		//List<Student> students = studentList.getStList();
		 ArrayList<Student> students;
		try {
			
			students = service.readAllData();
			
			for (Student student : students) {
				
				if(student.getUID().equals(UID)) {
					
					System.out.println(student.toString());
					new Controller(student);
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
