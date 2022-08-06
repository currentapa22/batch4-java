package com.days.day52.ilk_ornek;

public class Student_List_2 {
    public static void main(String[] args) {

        Student student1=new Student ("Curry");
        System.out.println ( "student1.name = " + student1.name );
        Student student2=new Student ("Benzema");
        System.out.println ( "student2.name = " + student2.name );

        // classname. yaptigin zaman static variableleri gorursun.Unutma static variable belongs to the class not to the object!
        System.out.println ( "Student.city = " + Student.city );
        System.out.println ( "Student.totalStudentNumber = " + Student.totalStudentNumber );

        Student student3=new Student ( "Murat" );

        System.out.println ( "Student.totalStudentNumber = " + Student.totalStudentNumber );  //static variable we increased in constructor. totalStudentNumber = 3 as expected.
        System.out.println ( "student1.studentNumber = " + student1.studentNumber );//instance variable .
        System.out.println ( "student2.studentNumber = " + student2.studentNumber );//what will we see different between totalStudentNumber and studentNumber.
        System.out.println ( "student3.studentNumber = " + student3.studentNumber );
        //studentNumber=1 cikti neden ? cunku default value of studentnumber is 0 . everytime we create object  variable is 0+1 =1 oluyor(for each object)
        // Static olmadigi icin her obje icin farkli!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // totalStudentNumber ise static , obje ile alakali degil class ile alakali!

    }
}
