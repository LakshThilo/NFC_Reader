package com.lak.uni.controller;

import com.lak.uni.veiw.StudentDetail;

public class Controller {
	
	private Student student;
	
	
    public Controller(Student student) {
		
    	this.student = student;
    	new StudentDetail(student);
    	print();
    	
	} 
    
    public void print() {
    	
    	System.out.println("Controller: "+student.toString());
    }
}
