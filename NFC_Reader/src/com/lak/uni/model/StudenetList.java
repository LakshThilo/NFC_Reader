package com.lak.uni.model;

import java.util.ArrayList;

public class StudenetList {

    private ArrayList<Student> students;

    public StudenetList(){

        students = new ArrayList<>();
    }

    public void addStudents(Student s){

        students.add(s);
    }

    public ArrayList<Student> getAttends(){

        return students;
    }

}
