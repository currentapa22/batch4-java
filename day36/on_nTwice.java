package com.days.day36;

public class on_nTwice {
    public static void main(String[] args) {
        /*
        Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.


nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
         */

        String str="Chocolate";
        int n =3;
        String subs1 = str.substring ( 0, n );
        String subs2 = str.substring ( str.length () - n );
        String concat= subs1.concat(subs2);
        System.out.println ( "concat = " + concat );


    }
}
