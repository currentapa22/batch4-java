package com.days.day4;

import java.sql.SQLOutput;

public class VariableSamples {

    public static void main(String[] args) {

        //DECLARATION!!
        byte hour;

        short schoolNumber;

        int phoneNumber;

        long cardNumber;

        char dot;

        boolean isItTrue;

        //How to ASSIGN a value to Variable

        int numberOfStudent = 10; //we declared a Variable(data type= int,name= numberOfStudent)
        //then we assigned 10 to this integer type  variable!!
        System.out.println("Number of students is " + numberOfStudent);
        numberOfStudent = 20;
        //reassigned the first value!!
        System.out.println("Number of students is 10");
        //Static way to express.
        System.out.println("Number of students is 20");
        //Dynamic way to express.
        System.out.println("Number of students is " + numberOfStudent);

        double pi;
        double conversionRate;
        double temprature;
        // this is easier way if they are same variable type. -> double pi , conversionRate , temprature;


        byte test = 127;
        System.out.println(test);
        int Test = 128;
        System.out.println(Test);


        // Default Values
        System.out.println(10); //java assumes this is an integer number
        System.out.println(10.0); // this is not an integer, . oldugu icin java dilinde bu bir double.(java assumes this is double as default.)


       // float floatValue = 10.0; //eventhoug this is a double, we can force this line to become a float if we put letter f after the value.Like i did in next line
        float floatVaLue = 10.0f; //forced to be float instead of double.

        double task2 = 1.0;
        double task3 = 12.4;
        int task4 = -100;
        double task5 = 15.5;

        double num1 = 1.0;
        num1 = -100;  // num1 double olmasina ragmen burada -100 (integer degeri verdik)
        // .Double is bigger then integer.64 byte>32 byte.kucuk olan buyuk olana donusuyor
        // .Ama -100 yazmamiza ragmen doubleye dondugu icin -100.0 olarak java output veriyor.(implicitly = dolayli olarak donusum.)
        System.out.println(num1);

        long longValue = 1234_5678;
        long longVaLue = 12345678L;//variable type a long dememize ragmen bu deger aslinda integer.so if we put l or L at the end of the value it would turn to long.
        // Kucuk olan buyuk olana donusuyour yukarida floatta oldugu gibi.

        int number1= 10;
        int number2 = number1;

        number1= 15;
        System.out.println(number2); //output will be 10 because second declaration to number1 wont affect number 2 .
        //java reads line by line

        double speed = 100;
        double time = 5;
        double distance = speed * time;
        System.out.println("Distance is " + distance);

        //end of the class.




    }


}
