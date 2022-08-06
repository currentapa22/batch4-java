package com.days.day21;

public class ders6 {
    public static void main(String[] args) {
mod3 ( 100 );
mod3 ( 5 );
int number= returnMod3 ( 50 );
        System.out.println ("Number = "+number);

    }

    public static void mod3(int number) {
        System.out.println ( number % 3 );

    }

    public static int returnMod3(int num){

        int modThree = num %3;
        return modThree;
    }
}
