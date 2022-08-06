package com.days.day37;

import java.util.Locale;

public class String_Review_2 {
    //when we start working %80-90 times we will interact with strings.
    //String is an object that represents a sequence of char values.
    //There are 2 ways to create an String ; 1.By String literal   2.By 'new' keyword.

    public static void main(String[] args) {
        String name= new String();
        name="Hello";
        String num="Hello";
        System.out.println ( "name==num = " + (name == num) );

        //length() method space i de karakter olarak sayiyor.1'den baslar
        //charAt() the index value that we pass in this method should be between 0 and (length of string-1)

        char a ='A';
        int numa=a;
        System.out.println ((int)a);//or
        System.out.println ( numa );


        String str1 = "bla";
        String str2="lala";
        String str3=str1.concat ( str2 ); // or str1+str2

        //containts() method

        //indexOf()  --returns the index within the calling String of the first occurence of the specified value.
        //string.indexOf(String str, int fromIndex)

    //replace() method IMPORTANT!, won't change the original value. if you assign new value to a variable it can change.

        String str4="           Test bla bla Cool";

        System.out.println ( "str4.replace ( \"bla\",\"really\" ) = " + str4.replace ( "bla", "really" ) );
        System.out.println ( "str4 = " + str4 ); // original wont change.
        //but if we assign it to a variable and print it , it will.
        str4=str4.replace ( "bla", "really" );
        System.out.println ( "str4 = " + str4 );//simdi degisicek cunku degisikligi ayni variable icinde sakladim.

        //equals() method accepts a string parameter, compares the two given string based on the content of the string.

        //substring(startIndex)

        //str4.substring ()

        //toLowerCase(), toUpperCase()
        System.out.println ( "str4.toUpperCase () = " + str4.toUpperCase () );
        System.out.println ( "str4 = " + str4 );
        System.out.println ( "str4.toLowerCase() = " + str4.toLowerCase () );
        System.out.println ( "str4 = " + str4 );


        //trim() , bastaki ve sondaki spaceleri siler.

        System.out.println ( "str4.trim () = " + str4.trim () );
        System.out.println ( "str4 = " + str4 );

        str3="  Hello  ";
        str4="Hello";

        System.out.println ( str3.equals ( str4 ) );//should be false.
        System.out.println ( str3.trim ().equals ( str4 ) );// should be true now, we trimmed it.


        // 1-48 of 264 results for    .. page numbers and result numbers is dynamic . "of" and "results for" static.
        //Return me result count.

        String str= "1-48 of 26 results for";
        int startCount= str.indexOf ( "f" )+2;
        int endCount=str.indexOf("r")-1;
        String counter= str.substring ( startCount,endCount );
        System.out.println ("sub =" +counter);



        // "I told BAD words"    //BAD when you see BAD delete it! how we can create a code.

        String mybad= "I said lots of BAD BAD BAD BAD words and they are really BAD";
       mybad= mybad.replace ( "BAD","nice" );
        System.out.println ( mybad );




        //"1234 Test.invoce"     , "test_12355500.csv"   , "T123466_test.txt"
        //according to this 3 type of data return me numbers as a String.
        //in inputs, alph charc can change.
        //ie: "1234 Test.invoce"  -> "1234_Testt.invoce"     char part might change, return only numbers.
        //There will be no any number in file name beside data/time stamp!!
        //input:"test_12355500.csv"
        //expected output:12355500

        //StackOverFlow: Use this code numberOnly will contain your desired output.
        //
        //   String str="sdfvsdf68fsdfsf8999fsdf09";
        //   String numberOnly= str.replaceAll("[^0-9]", "");





    }
}
