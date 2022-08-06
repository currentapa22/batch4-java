package com.days.day36;

public class Iki_Substring {
    public static void main(String[] args) {
        String player= "Ronaldo";
        //              0123456
        String city= new String("Oslo");
       int no=  player.length (); //we can assign this values to their uygun variables.
        char ch= player.charAt ( 0 );//R

        // a method static we can call it from  other class.
        // a method static we can't call this method through an object.

        System.out.println ( "no = " + no );
        System.out.println ( "ch = " + ch );
        System.out.println ( "city.length () = " + city.length () );

        System.out.println ( "player.substring ( 3 ) = " + player.substring ( 3 ) );//starting point 3 and will give the rest of the string;
        System.out.println ( player.substring ( 3, 5 ) );//expected result: al
        System.out.println ( "city.substring ( 2 ) = " + city.substring ( 2 ) );//lo expected result,

        System.out.println ( player.charAt ( player.length () - 1 ) );// to get to last letter
    }
}
