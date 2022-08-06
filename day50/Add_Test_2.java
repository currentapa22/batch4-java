package com.days.day50;

public class Add_Test_2 {
    public static void main(String[] args) {
        Add_1 operation=new Add_1 ();
        Add_1 operation1=new Add_1 ();
        operation.getSum ( 10,40 );
        operation1.getSum1 ( 1,2,3,4,5,6,7,8,9,10 );

        Person per1=new Person ("David",1990);  // object name should remind me the class name
        Person per2=new Person ("Benzeme","Real");
        Person per3=new Person ("Ronaldinho","The Legend");  //Person () is actually constructor. When we are creating an object, constructor is being executed .
        Person per4=new Person ("Halil","Simsek");

        per1.name="David"; // after i assign this name i can reach and change it anytime.
        per2.name="Ronaldo";
        per3.name="Ahmet";

        per1.printName ();
        per2.printName ();
        per3.printName ();
        per4.printName ();

        per1.calculateAg (); // calculateAg method is located in person class. But in that method there is an object refers a method from Add_1 java.Yani 3 class var birbiri ile baglantili olan.
        int per1Age=per1.getBirthYear ();// gives me int value
        System.out.println ( "per1Age = " + per1Age );

      //  System.out.println ( "per1.city = " + per1.city );
      //  System.out.println ( "per2.city = " + per2.city );

      //  per1.city="Berlin";
       // System.out.println ( "per1.city = " + per1.city );
        per1.getCity ();

        Teacher teacher1=new Teacher (per1);
        System.out.println ( "teacher1.name = " + teacher1.name );

        teacher1.printName ( per1 );


    }
}
