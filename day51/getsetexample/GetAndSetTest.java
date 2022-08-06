package com.days.day51.getsetexample;

public class GetAndSetTest {
    public static void main(String[] args) {
        GetandSet obj1=new GetandSet ();
       // obj1. yazinca i can reach all the properties from getandset class.(if they are not private)
        //if i want to reach private properties i need get and set method

        obj1.setA ( 10 );
        System.out.println ( "obj1.getA () = " + obj1.getA () );

    }
}
