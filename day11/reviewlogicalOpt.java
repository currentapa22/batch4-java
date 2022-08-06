package com.days.day11;

public class reviewlogicalOpt {

    public static void main(String[] args) {

                        //1.door   //2.door
        System.out.println(true && true); // true
        System.out.println(true&& false);//false
        System.out.println(false&& true);//false
        // when java reads the code and after the first data if its false , java wouldn't go to second one.

        int a = 10;
        int b = 8;
        int c = 10;
        int d = 1;
        int e = 33;
        int f = 8;

        boolean check= (a >= b) && (c == d) || (e != f); // result of this expression would be boolean.
        System.out.println("check = " + check);

        // && ile || arasinda islem onceligi olarak && once yapilir ondan sonra || a bakilir.
        
        boolean isThereValidDate= false;
        System.out.println("!isThereValidDate = " + !isThereValidDate);

        int burak = 10;
        burak +=2;
        System.out.println("burak = " + burak);


    }

}
