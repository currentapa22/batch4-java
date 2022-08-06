package com.days.day45;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Review11week {
    public static void main(String[] args) {

        ArrayList<String> scores=new ArrayList<> ();
        scores.add("Chicago-Orlando : 110-70");
        scores.add("Miami-Toronto : 120-105");
        scores.add("LA Lakers-LA Clippers : 107-85");
        scores.add("Houston Rockets-Washington Wizards : 130-135");

        //how to get numbers from this arraylist
        //and put them in another arraylist but not string , as a Integer.!
     //   String[] split = scores.get ( 0 ).split ( "-" );

        ArrayList<Integer> resultsNumbers= new ArrayList<> ();
        String[] split = scores.get ( 0 ).split ( "-" );
        int secondNumber=Integer.valueOf(split[split.length - 1]);
        resultsNumbers.add(secondNumber);
        System.out.println ( "split[split.length-1] = " + split[split.length - 1] );
        System.out.println ( "split[split.length-2] = " + split[split.length - 2] );
        System.out.println (split[split.length - 2].split ( ":" )[1] ); // and we need to turn string to int
        String s = split[split.length - 2].split ( ": " )[1];
       int b =Integer.valueOf ( s );
       int i= Integer.parseInt ( s );
        System.out.println ( "b = " + b );
        System.out.println ( "i = " + i );
        resultsNumbers.add(i);
        System.out.println ( "resultsNumbers = " + resultsNumbers );




        for(int n=0; n<scores.size ();n++){
            String[] split1 = scores.get ( n ).split ( "-" );
            int secondNumber1=Integer.valueOf(split1[split.length - 1]);
            resultsNumbers.add(secondNumber1);
          String s1=  split1[split1.length - 2].split ( ": " )[1];
            int i1= Integer.parseInt ( s1 );
            resultsNumbers.add(i1);

        }
        System.out.println ( "resultsNumbers = " + resultsNumbers );




    }
}
