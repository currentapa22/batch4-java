package com.days.day10;

public class questionslogicalops {

    public static void main(String[] args) {

        //Write a program to calculate the digits of a 5 digit.(76543)
        //first digit will be 3
        //second 4
        //third will be 5
        //you should create 5 int.
        //we need to use dividing and module ope.
        //76543
        int number =76543;
        int digit1,digit2,digit3,digit4,digit5;
        digit5=number/10000;
        System.out.println("digit5 = " + digit5); //7
        // we need to continue without 7 so ,
        number = number%10000; // or number&=10000
        System.out.println("number = " + number); //6543

        digit4=number/1000;
        System.out.println("digit4 = " + digit4);//6

        number%=1000;//number will be 543
        digit3=number/100;
        number%=100; // number is 43 now
        digit2=number/10;
        System.out.println("number = " + number);
        digit1= number%10; // will get 3
        System.out.println("digit1 = " + digit1);
        System.out.println("digit2 = " + digit2);
        System.out.println("digit3 = " + digit3);
        System.out.println("digit4 = " + digit4);
        System.out.println("digit5 = " + digit5);

        //this is a dynamic code , so en yukaridaki numberi farkli bir sayi yaparsan her  sey degisir ona gore
        //tekrar bak!!!

        //Write a program to reverse a 3-digit number. E.g.-Number : 987 to 789.
        int ornek=987;
        int satir1= (ornek%10);
        int satir2= (ornek/10)%10;
        int satir3 = (ornek/100)%10;
        System.out.println("satir1 = " + satir1);
        System.out.println("satir2 = " + satir2);
        System.out.println("satir3 = " + satir3);

        int newsayi= (satir1*100) + (satir2*10) + (satir3);
        System.out.println("newsayi = " + newsayi);

        //https://codingbat.com/java pratik yapmak icin!!!!

        //write a program to reverse 531 to 135

        int sayi=531;
        int line1=(sayi)%10;
        int line2=(sayi/10)%10;
        int line3=(sayi/100)%10;
        System.out.println ( "line1 = " + line1 );
        System.out.println ( "line2 = " + line2 );
        System.out.println ( "line3 = " + line3 );
        int yeniSayi=(line1*100)+ (line2*10) + (line3*1);
        System.out.println ( "yeniSayi = " + yeniSayi );



        int numara=8561; //turns to 1658
        int ilk=(numara)%10;
        int ikinci=(numara/10)%10;
        int ucuncu=(numara/100)%10;
        int dorduncu=(numara/1000)%10;
        System.out.println ( "ilk = " + ilk );
        System.out.println ( "ikinci = " + ikinci );
        System.out.println ( "ucuncu = " + ucuncu );
        System.out.println ( "dorduncu = " + dorduncu );
        int suankisayi=(ilk*1000)+ (ikinci*100) + (ucuncu*10) + (dorduncu);
        System.out.println ( "suankisayi = " + suankisayi );


    }
}
