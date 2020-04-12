package com.lak.uni.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.lak.uni.veiw.StudentDetail;
import com.lak.uni.veiw.StudentRegistration;
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
					new StudentDetail(student);
					
				}else {
					System.out.println("Details not recored");
					int n = JOptionPane.showConfirmDialog(null, "Student is not registered\n Do you want register?","Record Error!",JOptionPane.YES_NO_OPTION);
					System.out.println(n);
					
					switch (n) {
					case 0:
						new StudentRegistration();
						break;

					default:
						break;
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
