package com.example.studentgradingsystem;

public class Teacher {

    String name;
    String branch;

    Teacher(String name, String branch){
        this.name = name;
        this.branch = branch;

    }

    void print(){
        System.out.println("Teacher name : " + this.name );
        System.out.println("Teacher branch : " + this.branch );
    }
}
