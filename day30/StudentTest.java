package com.days.day30;

public class StudentTest {
    public static void main(String[] args) {
//how to create an object;
// 1.put template class name(Student)
// 2.give object a name (student1)
// 3.assign with new keyword and classname();   new Student();

        Student student1= new Student();
        student1.name="Ronaldo";        //static variables belong the student class o yuzden okul ismi olan variableyi goremezsin burada!!
        student1.number=7;
        student1.surname="Pele";
        student1.birthyear=2000;



        Student student2=new Student ();
        student2.name="Stephen";
        student2.number=10;
        student2.surname="Curry.";
        student2.birthyear=1990;

        // student1.name.soutv asagidakini verir.
        System.out.println ( "student1.name = " + student1.name );
        System.out.println ( "student2.name = " + student2.name );
        student1.studying ();
        student2.studying ();
        //student1.studentSport olmuyor cunku o static method!!
        //we can't neither reach static String schoolName nor static method!!
        student1.studentInfo ();
        student2.studentInfo ();


    }


}
