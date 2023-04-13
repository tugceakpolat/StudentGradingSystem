package com.example.studentgradingsystem;

public class Main {
    public static void main(String[] args) {
         Teacher teacher = new Teacher("John Sir","PHS" );
         Teacher teacher2= new Teacher("William St.","HST");
         Teacher teacher3= new Teacher("Alicia K.","MTH");
         Course phys = new Course("Pyhsic", "01", "PHS");
         phys.addTeacher(teacher);
         Course history = new Course("History", "02", "HST");
         Course math = new Course("Maths","03", "MTH" );


         Student student = new Student("100","Jack D.", "4", phys,math,history);
         student.addBulkExam(30,82,74);
         student.printNote();


    }
}
