package com.example.studentgradingsystem;

public class Main {
    public static void main(String[] args) {
         Teacher teacher = new Teacher("John Sir","PHS" );
         Teacher teacher2= new Teacher("William St.","HST");
         Teacher teacher3= new Teacher("Alicia K.","MTH");
         Course course = new Course("Pyhsic", "01", "PHS");
         Course course2 = new Course("Maths","03", "MTH" );
         Course course3 = new Course("History", "02", "HST");



         Student student = new Student("100","Jack D.", "4", course,course2,course3);
         student.addBulkExam(10,20,50);

         student.isPass();


    }
}
