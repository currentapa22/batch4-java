package com.days.day44;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_2 {
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<> ();

        numbers.add(10);//index num 0
       // numbers.add(5,20);// can we add index number 5 without assigning index 1-2-3-4 ?  NO ! IndexOutOfBoundsException
        System.out.println ( "numbers = " + numbers );


        ArrayList<String>listOne=new ArrayList<> ( Arrays.asList ("a","b","c","d","e")); // bu da bir baska sekli arraylist olusturmanin! not common use.
        String[]words={"Hello","world"};
        ArrayList<String>list=new ArrayList<> ( Arrays.asList (words));// we also use string array as a parameter.

        char[]characters={'h','e','l','l','o'};
        String fromArray=new String(characters);// string also sequence of chars.!

        System.out.println ( "fromArray = " + fromArray ); //hello output.


    }
}
