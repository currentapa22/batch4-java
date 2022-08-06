package com.days.day47;

public class Student {

    public long studentId;      // instance variable
    String name;
    int age;
    boolean isActive;
    public static int totalStudent;   // global variable - class level var
    public Student(){
        totalStudent ++;
        System.out.println("Student.totalStudent = " + Student.totalStudent);
        this.isActive = true;
    }
    public Student(long studentId) {
        this();
        this.studentId = studentId;   // local variable
//        totalStudent ++;
//        System.out.println("Student.totalStudent = " + Student.totalStudent);
//        this.isActive = true;
    }
    public Student(long studentId, String name) {
        this(studentId);
        this.name = name;
//        totalStudent++;
//        System.out.println("Student.totalStudent = " + Student.totalStudent);
//        this.isActive = true;
    }
    public Student(String name) {
        this();
        this.name = name;
//        totalStudent++;
//        System.out.println("Student.totalStudent = " + Student.totalStudent);
//        this.isActive = true;
    }
    public Student(String name, int age) {
//        this();
//        this.name = name;
        this(name);
        this.age = age;
//        totalStudent++;
//        System.out.println("Student.totalStudent = " + Student.totalStudent);
//        this.isActive = true;
    }
    public Student(long studentId, String name, int age) {
//        this();
//        this.studentId = studentId;
//        this.name = name;
        this(studentId,name);
        this.age = age;
    }
    public static void main(String[] args) {
//        Student student1 = new Student();
//        Student student2 = new Student(1);
//        UPDATE Class Student according to these requests
        //1- If we need to create a student, we have to provide  id number or id  number+name!!
        //2- Please keep/count totalStudent number separately - dynamicly , print after each registration!!

                //3- After registration complete, please make sure this student is active!!
                Student student5 = new Student();
        Student student1 = new Student(1001);
        Student student2 = new Student(1002, "Henry");
        Student student3 = new Student(1003, "Nail");
        Student student4 = new Student(1004);
        // Review again Student class, use chaining, Try to reduce/delete redundant code

    }
}

