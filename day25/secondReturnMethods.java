package com.days.day25;

public class secondReturnMethods {

    public static void main(String[] args) {

        System.out.println ( sum ( 5, 4 ) );


        double sum = sum ( 5, 4 );   //sum(5,4) yazdiktan sonra alt+enter yaaprsan kendisi declare ediyor!!!!
        System.out.println ( "sum = " + sum );

    }


public static double sum(double num1,double num2){
    //  double sum=num1+num2;  //bu ilk iki satir bad practice
   // return sum;
    return num1+num2; //good practice!!!!!

    }

}
