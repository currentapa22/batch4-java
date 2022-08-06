package com.days.day48.exercise;

public class Student {
   private String name;

    private int classNum;          //right click + generate+ getter method + select private fields!!!   SHORTCUT!
  static  String schoolName="Turkmen High school";

 static int studentCount;

private int schoolNumber;

    Student(String name, int classNum){
        studentCount++;
        this.name=name;
        this.classNum=classNum;
        schoolNumber=studentCount;
        System.out.println ("Obj is created");
        System.out.println ( "Student number is: " + studentCount );
    }

    public String getName(){
        return name;
    }
public int getClassNum(){
        return  classNum;
}


public int getSchoolNumber(){
    System.out.println ( "schoolNumber of = "+ name +" "+ schoolNumber );
    return schoolNumber;
}

}
