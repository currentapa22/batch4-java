package com.days.day36;

import java.util.Scanner;

public class BirReverseString {
    public static void main(String[] args) {
        //how can we reverste the String Ali to ilA

        System.out.println ( 'A' + 'A' );// ascii A=65 , result expected =130
        System.out.println ( "" + 'A' + 'A' );// we added "" to create string, expected result AA
        String str = "London";
        //               012345
        str.length ();
        System.out.println ( "str.charAt ( 0 ) = " + str.charAt ( 0 ) );// L
        System.out.println ( "str.length () = " + str.length () );//6

       /* for(int i=0; i<str.length ();i++){
         //   System.out.println ( "str.charAt ( i ) = " + str.charAt ( i ) );
        }   */


        //String i reverse cevirmek icin

        str = "ISTANBUL";
        String reversed = "";

        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Please give me a string that you want to make reversed:" );

        str = scanner.next ();
        for (int i = str.length () - 1; i >= 0; i--) {

            reversed += str.charAt ( i ); //reversed degerleri reversed adli variablenin icine koyuyoruz demek bu ifade!
            System.out.println ( "str.charAt ( i ) = " + str.charAt ( i ) );
        }

        System.out.println ( "reversed = " + reversed );


        //lets call this method
        //because of this method is not static , we have to create an object from this class (BirReverseString).
        BirReverseString reverse = new BirReverseString ();
        reverse.reverseString ( "France" );
        reverse.reverseString ( "Barcelona" );
    }

    // Let's create a method for this reverse string.!

    public String reverseString(String str) {
    String reversed="";
        for (int i = str.length () - 1; i >= 0; i--) {

            reversed += str.charAt ( i );
        }
        System.out.println ( "reversed = " + reversed );
        return reversed;
    }

}
