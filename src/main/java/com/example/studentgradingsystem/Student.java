package com.example.studentgradingsystem;

public class Student {
    Course course;
    Course course2;
    Course course3;
    String studentName;
    String studentNumber;
    String classes;
    private double avarage;
    boolean isPass;

    Student(String studentNumber, String studentName, String classes, Course course, Course course2, Course course3){
        this.studentName=studentName;
        this.studentNumber=studentNumber;
        this.classes= classes;
        this.course = course;
        this.course2= course2;
        this.course3= course3;
        this.setAvarage(0.0);
        isPass = false;

    }

    void addBulkExam(int note1, int note2, int note3){

        if(note1 >= 0 && note1 <=100){
            course.note = note1;
        }
        if(note2 >= 0 && note2 <=100){
            course2.note = note2;
        }
        if(note3 >= 0 && note3 <=100){
            course3.note = note3;
        }


    }
    void isPass() {

        this.setAvarage(((this.course.note + this.course2.note + this.course3.note) / 3.0));
        if(this.getAvarage() >=55){
            System.out.println("You passed.");
            this.isPass = true;
        }
        else{
            System.out.println("You failed the class.");
        }

        printNote();
    }


    void printNote(){
        System.out.println(course.name + " Note : " + course.note);
        System.out.println(course2.name + " Note : " + course2.note);
        System.out.println(course3.name + " Note : " + course3.note);
        System.out.println("Your Avarage : " + this.getAvarage());



    }

    public double getAvarage() {
        return avarage;
    }

    public void setAvarage(double avarage) {
        this.avarage = avarage;
    }
}
