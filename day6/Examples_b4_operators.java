package com.days.day6;

public class Examples_b4_operators {

    public static void main(String[] args) {
//unless you initialize(to assign first value up to their data types.) the variable you will not be able to use it.
        //(for local variables tho)
        int first=30;
    String hello= "Helloworld";
    double sum_of_data=2.122;
        System.out.println(first);
        System.out.println(hello);
        System.out.println(sum_of_data);

        System.out.println("Hello World");
    //There are three types of errors in java //Compile-time errors.//Run time errors.//logical errors.
        System.out.println("Hello World");
        //most common error that you may encounter  #
        //missing semicolong
        //missing braces
        //missing quotes

     //           \/
     //          \\//
     //         \\\///
     //         ///\\\
     //          //\\
     //           /\
    // to make this
        System.out.println("\"\""); //bazi karakterleri mesela backslash gibileri tek basina yazamazsin println icinde.O yuzden we will backslash at the end and in front of it  so it would print.
        System.out.println("/"); // we dont need backslash for forwaard slash.


        System.out.println(1);
        System.out.println(11);
        System.out.println(111);
        System.out.println(11111);         //what if we want to create 20 triangles with different numbers
                                            // should i change the numbers manually or what can i do? we should create variable!!!!!!

        int a =0;
        System.out.println(a);
        System.out.println(""+a);
        System.out.println(""+a+a);
        System.out.println(""+a+a+a);

        a=2;
        System.out.println(a);
        System.out.println(""+a);
        System.out.println(""+a+a);
        System.out.println(""+a+a+a);
        //you dont need to revalue the variable again and again .You can just do this.

        System.out.println(a+a);  // yukaridaki line da da ekledik birbirine ama toplamadi.Burada topladi.+ is addition operation
        // yukaridaki "" makes entire line a string.It turns the integer to string.Bu yuzden toplamadi yan yana ifade etti , string olarak gordugu icin.


        int toplama, cikarma, bolme,carpma;
        int ilk=40;
        int ikinci=5;
        toplama=(ilk+ikinci);
        System.out.println ( "toplama = " + toplama );

        cikarma=(ilk-ikinci);
        System.out.println ( "cikarma = " + cikarma );

        bolme=(ilk/ikinci);
        System.out.println ( "bolme = " + bolme );

        carpma=(ilk*ikinci);
        System.out.println ( "carpma = " + carpma );


        double celcius=40;
        double fahrenheit=(celcius *9)/5+32;
        System.out.println ( "40 celcius equals to= " + fahrenheit );

        double miles=34;
        double kilometers=1.6*miles;
        System.out.println ("34 miles equals to " + kilometers +" kilometers.");

        int num1=94;
        int num2=51;
        int num3= 77;
        double sum=(num1+num2+num3)/ 3;
        System.out.println ( "sum = " + sum );


        //START //////////////Aritmetik Operatorler/////////////////////






    }




}
