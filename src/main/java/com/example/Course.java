package com.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseID;
    private List<Student> students;

    public Course(String courseName, String courseID) {
        // TODO: Initialize the attributes
        this.courseID=courseID;
        this.courseName=courseName;
        this.students=new ArrayList<Student>();

    }

    // TODO: Implement methods to enroll a student and drop a student
    public String getCourseName(){
        return this.courseName;
    }
    public String getCourseID(){
        return this.courseID;
    }
    public void enrollStudent(Student student) {
        this.students.add(student);
    }
    public void dropStudent(Student student) {
        this.students.remove(student);
    }
    public List<Student> getStudents() {
        return this.students;
    }
   
}


