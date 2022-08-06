package com.days.day35;

public class DortMethods {
    public static void main(String[] args) {
        String str="Hello Java"; //create a string way 1
        String city= new String ("London");//way 2
        String club=new String();// way 3 with 2 steps.
        club="Manchester United";

        //If i want to reach the method i need to create an object because this methods are not static.
        str.length (); //length() method is not static you can alt+click on it and see. If they are not static i need to
        //create an object (str) and use that object to call method.!
        //lenght(); returns integer type of value so we can assign it to a variable
        int lengthVar= str.length ();
        System.out.println ( "lengthVar = " + lengthVar );
        System.out.println (city.length ());

        //  String.length();//error!//Non- static method length() can not be referenced from a static contex

       // city.length ();//city object
       // club.length ();//club object
        // space (bosluk ) karakteri de bir karakter olarak sayiliyor.



        //There is another method  ,we will get a char .method name is  charAt(int index);
        //index start from zero, first letter 0, second letter 1, third letterd 2 gibi...
        //str="Hello Java";
        System.out.println ( "str.charAt (1) = " + str.charAt ( 1 ) );
        System.out.println ( "str.charAt ( 4 ) = " + str.charAt ( 4 ) );


        System.out.println ( "club.charAt ( 0 ) = " + club.charAt ( 0 ) );//Manchester United,expecting letter M

        //If i want to reach last letter of the string what should i do ? 02.27.43 video

        String example= "Ankara";
        System.out.println ( "example.length () = " + example.length () );
        System.out.println ( "example.charAt ( 0 ) = " + example.charAt ( 0 ) );//expected result is A
        System.out.println ( "example.charAt ( 1 ) = " + example.charAt ( 1 ) );//expected result is n

        //how we can print last letter? we need to use charAt() and length() methods

        String basketClub= "GoldenWarriors";

        System.out.println ( "basketClub.length () = " + basketClub.length () );//14
        //Because charAt starts from 0 , length starts from 1.
        //so lenght is 14 , means last letter is at 13
        //(length-1) is will give last letter. always. ornek yaziyorum altina simdi(basketClub.charAt(basketClub.length ()-1);

        System.out.println ( "basketClub.charAt ( basketClub.length ()-1 ) = " + basketClub.charAt ( basketClub.length () - 1 ) );




    }
}
