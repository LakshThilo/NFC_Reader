package com.lak.uni.controller;

public class Student {
	
	private String stId;
	private String stUID;
	private String name;
	private String course;
	private String batch;
	
	
	
	public Student() {
		
	}

	public Student(String UID, String stId, String name, String course, String batch) {
		super();
		this.stUID = UID;
		this.stId = stId;
		this.name = name;
		this.course = course;
		this.batch = batch;
	}
	
	public String getUID() {
		return stUID;
	}

	public void setUID(String uID) {
		stUID = uID;
	}

	public String getStId() {
		return stId;
	}

	public void setStId(String stId) {
		this.stId = stId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Student [stId=" + stId + ", name=" + name + ", course=" + course + ", batch=" + batch + "]";
	}
	
	

}
