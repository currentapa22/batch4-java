package com.days.day6;

public class OperatorsinJava {
    public static void main(String[] args) {  //CTRL+D duplicates the line!!!!!!!!!!
        System.out.println(100 + 20);
        System.out.println(2100 + 270);
        System.out.println(1500 + 9820);

        int num;
        num = 500;
        int num2 = num;
        System.out.println("num2 = " + num2);
        System.out.println(num + num2);


        int sum = num + num2;
        System.out.println("sum = " + sum);

        int no = 900;
        int sum2 = num + no; //ctrl+alt+l formats the page
        System.out.println("sum2 = " + sum2);
        System.out.println(sum2);
        System.out.println(900-200);
        System.out.println(sum2-sum);
        int result=sum2-sum;
        System.out.println("result = " + result);
        System.out.println(sum-num);


        System.out.println(100 / 5);
        int five=1000/5;
        System.out.println("five = " + five);


        ////////%%%%%%Modulus%%%%%%%\\\\\\\
        //bolme isleminden kalani veriyor bize.Divides two values and returns the remain.
        System.out.println(100/3);
        System.out.println(100%3);


        System.out.println(100/6); //16*6=96 100-96=4
        System.out.println(100%6); // remain is 4.

        int six= 100%6;
        System.out.println("six = " + six);

        int three = 120 % 3;//alt+enter assigns value to local variable
        System.out.println("three = " + three);

        System.out.println(100/6);
        System.out.println(100/3);
        System.out.println(33*3);


        double sevenD=100/7;//integer division on floating point context
        System.out.println("sevenD = " + sevenD); // result is not exact.
        double eight =100.0/8;
        System.out.println("eight = " + eight); // if one of the operant is decimal , result would be exact result.

        System.out.println(100/8.0);//double
        System.out.println(100/7.0);//double
        System.out.println(100/7); //integer



    }
}
