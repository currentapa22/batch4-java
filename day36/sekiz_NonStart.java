package com.days.day36;

public class sekiz_NonStart {
    public static void main(String[] args) {
        /*
        Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
         */

  String a="Hello";
  String b="There";

        System.out.println ( "a.substring ( 1 ) = " + a.substring ( 1 ) );
        System.out.println ( "b.substring ( 1 ) = " + b.substring ( 1 ) );
      String substring1=  a.substring ( 1 );
      String substring2=  b.substring ( 1 );

        System.out.println ( "substring1.concat ( substring2 ) = " + substring1.concat ( substring2 ) );


    }
}
