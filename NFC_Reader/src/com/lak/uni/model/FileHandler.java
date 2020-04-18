package com.lak.uni.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

	private static ArrayList<Student> students;
	
	public FileHandler() {
		
		//writeToFile();
		
	}
	
	
	public static void writeToFile() {
	
		
		try {
			
			students = DatabaseService.readAllDataFromAttendance();
			BufferedWriter myWriter = new BufferedWriter(new FileWriter("students.txt"));
			for (Student student : students) {
				myWriter.write(student.getUID()+" ");
				myWriter.write(student.getStId()+" ");
				myWriter.write(student.getName()+" ");
				myWriter.write(student.getBatch()+" ");
				myWriter.write(student.getCourse()+" ");
				myWriter.newLine();
				myWriter.flush();
				
			}
			
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public static void readFromFile() {
		
		   try {
			      File myObj = new File("students.txt");
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(data);
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		
	}

}
