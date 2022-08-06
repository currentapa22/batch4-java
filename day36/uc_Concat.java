package com.days.day36;

import java.util.Locale;

public class uc_Concat {
    public static void main(String[] args) {
        String player= "Michael Jordan";
        String club="Chicago Bulls Bulls";
        String player2="michael Jordan";
        //           0123456789012345678
        //+ operator combine 2 strings
        System.out.println ( "player+club = " + player + club );

        //there is another method  Stringname.concat(string that you want to combine)
        String concat = player.concat ( club );
        System.out.println ( "concat = " + concat );

        String concat1=player.concat ( club ).concat ( "played" );// bir satirda 2 method kullandik
        System.out.println ( concat1 );

        //indexOf methed , will return integer number.

        System.out.println ( "club.indexOf (\"Bulls\") = " + club.indexOf ( "Bulls" ) );
        System.out.println ( "player.indexOf ( 2 ) = " + player.indexOf ( "M" ) );
        System.out.println ( "club.indexOf ( \"Bulls\" ) = " + club.indexOf ( "Bulls" ) );//first Bulls starts at index 8
         System.out.println ( club.lastIndexOf ( "Bulls" ) );//last bulls start index

        //There is a method for == but instead of comparing the addresses , it compares the actual values.
        //return a boolean value.

        System.out.println ( "player.equals ( club ) = " + player.equals ( club ) );
        System.out.println ( "player2.equals ( player ) = " + player2.equals ( player ) );//should be false , java is case sensetive!!

        //there is another method to check equality but ignores if the letters capital or not!! .equalsIgnoreCase() method

        System.out.println ( "player.equalsIgnoreCase ( player2 ) = " + player.equalsIgnoreCase ( player2 ) );

        //.toLowerCase() and /.toUpperCase()
        System.out.println ( player.toLowerCase () );//converts all the letters to lower case
        System.out.println ( player.toUpperCase () );//converts all the letter to upper case.

        System.out.println (player);//upper and lowercase methods don't effect the original value.

        String club2="Newyork Knicks";
        System.out.println ( club2.indexOf ( "New" ) );//it will give first index if the word exist.
        System.out.println ( "club2.contains ( \"New\" ) = " + club2.contains ( "New" ) );//it will search for this word.

    }
}
