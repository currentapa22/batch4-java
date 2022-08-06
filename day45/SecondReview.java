package com.days.day45;

import java.util.ArrayList;

public class SecondReview {


    public static void main(String[] args) {

        ArrayList<String> scores=new ArrayList<> ();
        scores.add("Chicago-Orlando : 10-70"); //common part of each element
        scores.add("Miami-Toronto : 20-105");
        scores.add("LA Lakers-LA Clippers : 07-85");
        scores.add("Houston Rockets-Washington Wizards : 30-13");

        getscores ( scores );
    }


    public static ArrayList<Integer> getscores(ArrayList<String>scores) {
    ArrayList<Integer> resultsNumbers=new ArrayList<> ();
        for(int n=0; n<scores.size ();n++){
            String[] sp = scores.get ( n ).split ( "-" );
            int secondNumber1=Integer.valueOf(sp[sp.length - 1]);
            resultsNumbers.add(secondNumber1);

            String s1=  sp[sp.length - 2].split ( ": " )[1];
            int i1= Integer.parseInt ( s1 );
            resultsNumbers.add(i1);

        }
        System.out.println ( "resultsNumbers = " + resultsNumbers );
        return resultsNumbers;




    }
}
