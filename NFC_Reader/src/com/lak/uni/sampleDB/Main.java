package com.lak.uni.sampleDB;

import java.sql.SQLException;

public class Main {
	
	
	public static void main(String[] args) throws SQLException {
		
		Student student = new Student("B6829B2B","1","lak","Software ENGINEERING","19/20");
		Student student2 = new Student("D604B22B","2","Prab","Software ENGINEERING","19/20");
		
		DatabaseService service = new DatabaseService();
		
		
		//service.insertData(student);
		//service.insertData(student2);
		
		Student student3 = new Student("D604B22B","2","Prabath","Mobile Dev","19/20");
		Student student4 = new Student("C3CF5340","3","Thi","Software ENGINEERING","19/20");
		Student student5 = new Student("6510A82A","4","Darshi","Software ENGINEERING","19/20");
		
		//service.insertData(student4);
		//service.insertData(student5);
		
		//service.updateData("D604B22B", student3);
		service.readAllData().toString();
		//System.out.println(service.readAllData().toString());
		
		service.deleteData("B6829B2B");
		service.deleteData("B6829B2B");
		service.deleteData("D604B22B");
		service.deleteData("C3CF5340");
		service.deleteData("6510A82A");
		
	}

}
