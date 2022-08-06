package com.days.day34;

public class ThirdMathClass {
    /*
    java.lang.Math
    One of most useful classes is Math.It includes predefined mathematical constants and a large number of common
    mathematical functions.
    No need to create object, all math methods static call directly;
    Maths.methodname();
     */

// --------------------------

/*There are some methods we use with math class. Slayt Sayfa 15-16.Genellikle matematiksel hesaplamalar yapiliyor.
ceil , floor,max and min ,pow( power general exponentiation[uslu sayi])
*/

    public static void main(String[] args) {
        System.out.println ( "Math.max(2,1) = " + Math.max ( 2, 1 ) );
        System.out.println ( "Math.PI = " + Math.PI );

        System.out.println ( "Math.ceil(2.1) = " + Math.ceil ( 2.1 ) );
        System.out.println ( "Math.floor ( 2.9 ) = " + Math.floor ( 2.9 ) );
        System.out.println ( "Math.round ( 2.51 ) = " + Math.round ( 2.51 ) );//double returns long.
        System.out.println ( "Math.round ( 2.1f ) = " + Math.round ( 2.1f ) );//returns integer!

        System.out.println ( "Math.pow ( 3,7 ) = " + Math.pow ( 3, 7 ) );




    }
}
