package com.example;

import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<String> courses;

    public Student(String name, int id) {
        // TODO: Initialize the attributes
        this.name = name;
        this.id=id;
        
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }


    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
