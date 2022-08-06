package com.days.day48.exercise;

public class Student_Test {
    public static void main(String[] args) {

        Student student1=new Student ( "Burak", 12 );
        Student student2=new Student ( "Halil", 10 );

        System.out.println ( "student1.getName () = " + student1.getName () );
        System.out.println ( "student1.getClassNum () = " + student1.getClassNum () );
        System.out.println ( "student1.schoolName = " + student1.schoolName );
        String name1=student1.getName ();
        int class1=student1.getClassNum ();

        System.out.println ( "student2.getName () = " + student2.getName () );
        System.out.println ( "student2.getClassNum () = " + student2.getClassNum () );
        System.out.println ( "student2.schoolName = " + student2.schoolName );
        String name2=student2.getName ();
        int class2=student2.getClassNum ();

       Student student3=new Student ( "Ismet", 9 );
      /*   System.out.println ( "student1.schoolNumber = " + student1.schoolNumber );
        System.out.println ( "student2.schoolNumber = " + student2.schoolNumber ); // cant reach anymore because school number turned private!!!!!!!!!! i need method getSchoolNumber()
        System.out.println ( "student3.schoolNumber = " + student3.schoolNumber );

        student1.schoolNumber=25;//I dont want user to change schoolnumber after we created it , it may cause a problem in work environment
        System.out.println ( "student1.schoolNumber = " + student1.schoolNumber );  */

        student1.getSchoolNumber () ;
        student2.getSchoolNumber () ;
        student3.getSchoolNumber () ;

        Student student4=new Student ( "Ronaldo", 31 );
        student4.getSchoolNumber ();


    }
}
