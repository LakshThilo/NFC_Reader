package com.lak.uni.model;

import java.util.List;

import com.lak.uni.controller.Controller;
import com.lak.uni.controller.Student;
import com.lak.uni.controller.StudentList;
import com.lak.uni.veiw.StudentDetail;
import com.lak.uni.veiw.Connect;

public class CardDetails
{
	private StudentList studentList;
	private String UID;

	
	

	public CardDetails(String UID)
	{
		this.UID = UID;
		studentList = new StudentList();
			
		
	}
	
	public void getStudentDetails() {
		//String stId, String name, String course, String batch
		List<Student> students = studentList.getStList();
		
		for (Student student : students) {
			
			if(student.getUID().equals(UID)) {
				
				System.out.println(student.toString());
				new Controller(student);
				
			}
		}
	}
	

}
