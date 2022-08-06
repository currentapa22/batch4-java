package com.days.day31.secondstudentexample;

public class Student {
    String name;
    int number;
    int classYear; //default value is 0
    int birthYear;
    double mathGrade;
    double scienceGrade;
    double literature;

    int numbers;//instance
   static int studentsCount;//static
   // how many student are there in a school?

    //01:25:17   when we construct and object, constructor method being executed by compiler directly.There is a constructor method whether we see it or not.
    //constructor place inside the class
    //constructor has same name with the class
    Student(){ // this is a special method.
        studentsCount++; // static variable
        numbers++;//instance variable
         //studentsCount ile numbers in tek farki studentsCount is static and will increase every time we create an object, its class's variable.
        // But numbers is not static so it won't increase by calling the method again.
        System.out.println (" a student was registered ");
        System.out.println ( "School has  " + studentsCount+ " student." );
        System.out.println ( "numbers = " + numbers );
    }



    public void studentInfo(){

        System.out.println (name+" is attending year "+classYear + " "+name +" 's number is =" + number );

    }
    public void gradeAverage(){
        double average=(mathGrade+scienceGrade+literature)/3;
        System.out.println (name + "grade average is  "+ average);

    }


}
