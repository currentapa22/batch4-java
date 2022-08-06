package com.days.day52.ilk_ornek;

public class Student {

    int age;//instance variable      Student student1=new Student();   student1.age =20;     student1 is 20 years old.
            //properties is future of objects,its telling us something about object.
    String name;//instance variable student1.name="Burak"
    static String city="Munich";//will be created only 1 time .this city will not change from object to object.
    int studentNumber;

    static int totalStudentNumber;

    public Student(String name){
        studentNumber++;
        this.name=name;
        totalStudentNumber++;
        studentNumber=totalStudentNumber;//static variableyi non static variableye bagladik o yuzden, totalStudentNumber gibi output verir.!

    }

    public void playing(String game){       //methods gives us actions. Method shows behaviour of the objects!!!
        System.out.println ();
    }
public void sleeping(){

}
    void studying(){}

}
