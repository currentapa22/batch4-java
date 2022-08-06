package com.days.day38;

public class iki_DoubleChar {
    public static void main(String[] args) {

        //Coding battan soru cozuyoruz./String-2 double char.
        /*
        Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"


         */

        String str="Hi-There";
        String res="";
        for(int i=0;i<str.length ();i++){
            res=res+str.charAt ( i )+ str.charAt ( i );
        }
        System.out.println ( "res = " + res );

    }



}
