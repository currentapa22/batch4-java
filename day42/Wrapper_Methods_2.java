package com.days.day42;
 /*Wrapper Class Constants;

         -Each numeric wrapper class has the constants of MAX_VALUE and MIN_VALUE
        MAX_VALUE represents the maximum value of the corresponding primitive data type.
        MIN_VALUE represent the minimum value of the corresponding primitive data type.*/

import javax.print.DocFlavor;

public class Wrapper_Methods_2 {
    public static void main(String[] args) {

        Byte b1= Byte.MIN_VALUE;// i didn't create an object MIN_VALUE IS static.

        System.out.println ( "b1 = " + b1 );

        System.out.println ( "Integer.MAX_VALUE = " + (Integer.MAX_VALUE+1) );//gives -2147483648.
        System.out.println ( "Byte.MAX_VALUE = " + (Byte.MAX_VALUE+1) );
        b1=(byte)(Byte.MAX_VALUE+1);//we casted here so turn negative side.
        System.out.println ( "b1 = " + b1 );


        Character C3='A';
        System.out.println ( "C3 = " + C3 );// A
        System.out.println ( "(C3+C3) = " + (C3 + C3) );//turns integer 130
        System.out.println (C3+C3+C3+" C3+C3 = " );//195 C3+C3 =


        System.out.println ("\n//////////////////////////////////////////////\n");
        /*Wrapper Class Methods
          Character.isAlphabetic('a')    determines if the specified character is an alphabet
          Character.isLetter('j')       determines if the specified character is an letter.
          Character.isDigit('5')         determines if the specified character is a digit.


         */


        System.out.println ( "Character.isAlphabetic ( 'A' ) = " + Character.isAlphabetic ( 'A' ) );//true
        System.out.println ( "Character.isAlphabetic ( 65 ) = " + Character.isAlphabetic ( 65 ) );//true
        System.out.println ( "Character.isAlphabetic ( 43 ) = " + Character.isAlphabetic ( 43 ) );//false , 43 is + , not in alphabet.

        System.out.println ( "Character.isDigit ( 48 ) = " + Character.isDigit ( 48 ) );//false
        System.out.println ( "Character.isDigit ( '0' ) = " + Character.isDigit ( '0' ) );//true
        System.out.println ( "Character.isDigit ( 48 ) = " + Character.isDigit ( 65 ) );//false

        System.out.println ( "Character.isLetter (  65) = " + Character.isLetter ( 65 ) );//true




        /*CONVERSION METHODS
        Convert Primitive Types to Wrapper Objects.
        -We can use the valueOf() method to convert primitive types into corresponding wrapper objects as well.
        int a =5;                                                   double b=5.65;
        Integer aObj=Integer.valueOf(a);                            Double bObj=Double.valueof(b);

        -instanceof operator can be used to check whether the generated objects belong to specified class or not.
        aObj instanceof Integer

         */
        System.out.println ("\n///////////////////////////////////////\n");
        Integer i1 = Integer.valueOf ( "1" );//valueof() method return an object
        System.out.println ( "(i1 instanceof Integer) = " + (i1 instanceof Integer) );

        Wrapper_Methods_2  obj=new Wrapper_Methods_2 ();//true because we initialize it.

        System.out.println ( "(obj instanceof Wrapper_Methods_2) = " + (obj instanceof Wrapper_Methods_2) );




    }
}
