package com.days.day44;

import java.util.ArrayList;

public class ArrayList_4 {
    public static void main(String[] args) {

        ArrayList<String> clubs= new ArrayList<> ();
        clubs.add("Manchester City");
        clubs.add("Bayern Munich");
        clubs.add("Barcelona");
        clubs.add("Sporting Lisbon");
        clubs.add("Lyon");

        System.out.println ( "clubs.get(0) = " + clubs.get ( 0 ) );
        System.out.println ( "clubs.get( clubs.size () -1) = " + clubs.get ( clubs.size () - 1 ) );// how to reach last element!!

        //object is member of the class.
        //each element of this arraylist is an object!
        //in this arraylist each element is member of String Class.!

        ArrayList<String> cities=new ArrayList<> (); // all the objects from cities array list is member of String Class but we can
        ArrayList<ArrayList_3>listFromMyClass=new ArrayList<> ();//all the object from day44,Arraylist_2 member.

        //how to create an object from my arraylist_2 class ?
        ArrayList_3 anyname= new ArrayList_3 ();//we are creating an object from ArrayList_3 class
        // also i can reach methods in the arraylist_3 class but those methods are static, hoca sadece aciklamak icin bu ornegi verdi!

        listFromMyClass.add(anyname);
        //listFromMyClass.get(0)     . koyup metodlara bakarsan Arraylist_3 methodlarini gorursun.listFromMyClass object is member of Arraylist_3
        listFromMyClass.get(0).training ();//training is method i created at arraylist_3 , i can reach it!





    }
}
