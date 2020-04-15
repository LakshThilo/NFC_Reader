package com.lak.uni.controller;

import java.sql.SQLException;

import com.lak.uni.model.DatabaseService;
import com.lak.uni.model.StudenetList;
import com.lak.uni.model.Student;
import com.lak.uni.veiw.StudentRegistration;

import javax.swing.*;

public class CardDetails
{

	private String UID;
	private DatabaseService service;
	private StudenetList studenetList = new StudenetList();

	public CardDetails(String UID)
	{
		this.UID = UID;
		service = new DatabaseService();

	}

	public void getStudentDetails() {

		 Student student;
		try {

			student = service.getStudent(UID);
			studenetList.addStudents(student);
			if(student == null) {

				System.out.println("Record not found");
				 int n =  JOptionPane.showConfirmDialog(null, "Student is not registered\n Do you want register?","Record Error!",JOptionPane.YES_NO_OPTION);
				System.out.println(n);
				 switch (n)
				 {
					 case 0:
						 new StudentRegistration();
					 	break;
					 case 1:
						 break;
					 default:
					 	break;
				 }
			}else {


				new Controller(student);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


}
