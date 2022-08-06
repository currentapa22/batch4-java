package com.days.day45;

import java.util.ArrayList;

public class ThirdReview {
    public static void main(String[] args) {

        //Review about Wrapper Classes.
        //Primitive types in the stack memory , wrapper class is in the heap.
        // We can't use primitive types for wrapper classes.
        // you can pass objects to wrapper class.
        //Class name always start with capital letter.

        Integer number= new Integer ( "3" );
        Integer number2=new Integer('A');

        for(int ch='A'; ch<'Z' ; ch++){
            System.out.print (ch+ " ");
        }




        for(char ch='A'; ch<'z' ; ch++){
            System.out.print (ch+ " \n");


        }
        System.out.println ( "Integer.MAX_VALUE = " + Integer.MAX_VALUE );
        System.out.println ( "Integer.MIN_VALUE = " + Integer.MIN_VALUE );
        Integer numberr= new Integer ( "50" );
        int num=numberr;
        System.out.println ( "num = " + num );

        ArrayList<Integer>listOfNumbers= new ArrayList<> ();
        System.out.println ( listOfNumbers.add ( num ) );

        String text= new String ("123456");//Bu methodu calisirken kullanicaz unutma!
        int textNumber= Integer.valueOf ( text );
        System.out.println ( "textNumber = " + textNumber );
        int number3=Integer.parseInt ( text );
        System.out.println ( "number3 = " + number3 );


    }
}
