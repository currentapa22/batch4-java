package com.days.day11;

public class reviewCasting {

    public static void main(String[] args) {

        String number= "1";

        int number2 = 3;

        System.out.println(number + 2);
        System.out.println(number2/2); //1.5 -->1

        double rate1= 20;
        System.out.println("rate1 = " + rate1); // 20.0


        byte num1=100; //byte range is cover this value so can handle implicitly.

        System.out.println("num1= " + 100);

        System.out.println(num1);



        //expilicit

        int num2= (int) 128.0;
        int num3= (byte) 128.0;
        int num4= (short) 128.0;
        // int num5= (long) 128.0;// error!!
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        // cast operators are unary operators.Top priority in operator precedence.

        double myDouble= 9.78;
        int myInt=(int)myDouble; //java wouldn't store .78 anymore

        System.out.println(myDouble);//9.78
        System.out.println(myInt);//9

        //Type Promotion in Expressions

        byte b1=2;
        short s1=3;
        short s2= 2 + 3; // why no error here.Java directly can see the value,and they are also in short range.No problem!

        // short s3=b1+s1; // why there is an error ?mixture of byte,short, int ,values always int.

        //so we have to type there short.

        short s3= (short)(b1 +s1);


    }
}
