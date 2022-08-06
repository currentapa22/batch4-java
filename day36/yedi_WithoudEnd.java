package com.days.day36;

public class yedi_WithoudEnd {
    public static void main(String[] args) {
        /*

Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"

        */
String str="Hello";
//          01234   lenght is 5
        System.out.println ( "str.substring ( 1,4 ) = " + str.substring ( 1, 4 ) );//not dynamic
        System.out.println ( "str.substring (1, str.length ()-1 ) = " + str.substring ( 1, str.length () - 1 ) );//dynamic code


    }
}
