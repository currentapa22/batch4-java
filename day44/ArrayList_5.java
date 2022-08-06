package com.days.day44;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_5 {
    public static void main(String[] args) {

        ArrayList<Integer>numbers= new ArrayList<> ();

        for(int i=0;i<101;i+=2){
            numbers.add(i);

        }
        System.out.println ( "numbers = " + numbers );
        //how we can print numbers bigger than 40. get the numbers from first arraylist
        //create another ArrayList and put these numbers in that arraylist
        //i will check the element of numbers arraylist







        ArrayList<Integer> newOne= new ArrayList<> ();
        for(int i=0;i<numbers.size();i++){
            if ( numbers.get(i)>40){
                newOne.add (numbers.get(i));
            }

            }
        System.out.println ( "newOne = " + newOne );
        Collections.sort ( newOne ); // to sort an arraylist. We will learn Collections class.

        Collections.reverse ( newOne );
        System.out.println ( "newOne = " + newOne );// to reverse!

        for (Integer num:newOne) { // foreach loop for print al elements individually.
            System.out.println ( "num = " + num );
        }

        newOne.forEach ( System.out::println ); // bu da baska bir yolu!



    }
}
