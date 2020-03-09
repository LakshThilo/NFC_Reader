package com.lak.uni.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList {
	
	List<Student> stList;

	public StudentList() {
		
		//String stId, String name, String course, String batch
		stList = new ArrayList<>(Arrays.asList(
				 new Student("B6829B2B","1","lak","Software ENGINEERING","19/20"),
				 new Student("D604B22B","2","Prab","Software ENGINEERING","19/20"),
				 new Student("C3CF5340","3","Thi","Software ENGINEERING","19/20"),
				 new Student("6510A82A","4","David","Software ENGINEERING","19/20"),
				 new Student("B3BADA40","4","David","Software ENGINEERING","19/20")
				 ));
	}

	public List<Student> getStList() {
		return stList;
	}

	public void setStList(List<Student> stList) {
		this.stList = stList;
	}
	
	

}
