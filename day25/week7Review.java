package com.days.day25;

public class week7Review {

    public static void main(String[] args) {
        //this int ve double variablelerde aslinda main methodun icinde bulunan local variableler diyebiliriz.!
        int number = 5;
        double number2 =5.0;
        //methodlari konusmak ile basliyoruz, Methods-1 slaytini konusuyoruz.
        //method names should be clear and makes sense.
        //object names should be clear and makes sense.
        //variable name rules apply to methods as well.
        //compiler starts compile from main method.
        //in main method we can reach other methods in the class here.
        // method olusturdugunda 2 parametre veriyorsan mesela , main methodda methodu cagirirken o iki parametreyi\
        //turlerine uygun olarak kullanman deger vermen gerekiyor!.

        //when you are in interwiev you should say "well structured","enhance the readability","reuse","memory efficiency'
        System.out.println ( "Before method" );
        printHello ();
        doublePrintHello ();
        System.out.println ( "after method" );
        printXtimeHello ( number );
        //explicitly casting yaparak method cagirma
        printXtimeHello ( (int)number2 );
        printXtimeValue ( number, "Power of dynamic method!!!" );
    }

    public static void doublePrintHello() {
        System.out.println ( "Beginning of double print method" );
        printHello ();
        System.out.println ( "Middle of double print method" );
        printHello ();
        System.out.println ( "End of double print method" );

    }


    public static void printHello() {
        System.out.println ( "Hello hello hello" );
        int localvariable; //bu local variable only declared and valid in this method and only exist
        //when we call the method from main method!
    }

    public static void printXtimeHello(int x) {

        for (int i = 0; i < x; i++) {
            System.out.println ( "Hello" );
        }

    }

    public static void printXtimeValue(int x, String value) {
        for (int i = 0; i < x; i++) {
            System.out.println ( value );
        }


    }


}