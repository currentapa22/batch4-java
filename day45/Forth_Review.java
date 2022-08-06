package com.days.day45;

import java.util.ArrayList;
import java.util.Collections;

public class Forth_Review {
    public static void main(String[] args) {

        ArrayList<Integer>cities= new ArrayList<> ();
        cities.size();// lenght of the arraylist
        cities.add(5);// to add an element to arraylist
        cities.add(10);
        cities.set(0,10);//we replace the value of an element.
        cities.add(0,20);// doesn't remove any value from list, just push index number +1
        cities.indexOf ( 10 );// gives first index of a value.
        cities.lastIndexOf ( 10 ); // gives last index of value
        cities.remove ( 2 );// removes an element from given index number.
        System.out.println ( "cities = " + cities );

        cities.get(0);// brings the element from given index number
        cities.forEach ( System.out::println );//will print all element
        Collections.sort(cities);
        System.out.println ( "cities = " + cities );
        Collections.reverse ( cities );
        System.out.println ( "cities = " + cities );
        cities.contains ( 98 );// return boolean result
        System.out.println ( "cities.contains ( 50 ) = " + cities.contains ( 50 ) );

        cities.clear();// clears all the elements
        System.out.println ( "cities = " + cities );

    }
}
