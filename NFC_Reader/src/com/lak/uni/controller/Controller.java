package com.lak.uni.controller;

import com.lak.uni.veiw.WelcomePage2;

public class Controller {
	
	private Student student;
	
	
    public Controller(Student student) {
		
    	this.student = student;
    	new WelcomePage2(student);
    	print();
    	
	} 
    
    public void print() {
    	
    	System.out.println("Controller: "+student.toString());
    }
}
