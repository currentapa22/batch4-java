package com.days.day53;

public class SchoolTest_3 {

    public static void main(String[] args) {

        JavaSchool_2 student1=new JavaSchool_2 ("Junior Deep","test@tt.com", "Baba Murat");   //Student

        //Act as parent
        System.out.println ( "student1.getStudentId() = " + student1.getStudentId () );
        student1.setStudentId ( "parent", 111 );
        student1.parentEmailAddress= "newEmail@test.com";
        System.out.println ( "student1.parentEmailAddress = " + student1.parentEmailAddress );
        System.out.println ( "student1.getAbsentDay () = " + student1.getAbsentDay () );
        student1.setParentFullName ( "Mrs. BABA",true );
        System.out.println ( "student1.getParentFullName () = " + student1.getParentFullName () );

        //Act as a system admin

        student1.setStudentId ( "admin", 101 );
        System.out.println ( "student1.getStudentId () = " + student1.getStudentId () );

        JavaSchool_2 student2=new JavaSchool_2 ("Johny Cash","test2@tt.com", "Baba Cash");
        System.out.println ( "student2.getStudentId () = " + student2.getStudentId () );

    }
}
