package com.days.day39;

import java.util.Arrays;

public class Bes_Split {
    public static void main(String[] args) {
        //when we start automating web pages with selenium we will use this syntax a lot!.


        String text="Hello java again";
        //split() method will return us an array!
        String[] s=text.split (" ");//it will split whereever there is a space!.Will turn an element after every space.

        //there is a class ve use name is 'Arrays'
        System.out.println ( "Arrays.toString(s) = " + Arrays.toString ( s ) );

        //this method is for String arrays.

        String nbaClub= "Toronto Raptors";
        String[]os=nbaClub.split ( "o" );
        System.out.println ( "Arrays.toString ( os ) = " + Arrays.toString ( os ) );

        System.out.println ( "nbaClub.split ( \"\" )[1] = " + nbaClub.split ( " " )[1] );//Raptors

    }
}
