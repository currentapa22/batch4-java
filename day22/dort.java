package com.days.day22;

public class dort {

    public static void main(String[] args) {
        int number = 15;
        int numara = 25;
        lasttwo ( number, numara );
        int ucuncunumber=100;
        int dorduncunumber=20;
       // checkLastDigit(ucuncunumber,dorduncunumber);//what type of value this line has?
        //this line carries boolean value,methoda bakarak ordan return type gorebilirsin.
        System.out.println ( checkLastDigit(ucuncunumber,dorduncunumber)); //true olarak donut verir.
        //return type is boolean so prints boolean variables result as output which is true!

        //2.bir yolu daha var methodu variableye baglamanin
        boolean result=checkLastDigit ( 12,13 );
        System.out.println ( "result = " + result );


    }

//we will write a code,checks last digits of 2 numbers.if last digit is same return true,else false.


    public static void lasttwo(int a, int b) {
        boolean result = true;
        if ( a % 10 == b % 10 ) {
            result = true;
        } else {
            result = false;
        }
        System.out.println ( "result = " + result );


    }

    public static boolean checkLastDigit(int a, int b) {
        boolean value;
        if ( a % 10 == b % 10 ) {
            value = true;
        } else {
            value = false;
        }
        return value;//returns true,

    }


}