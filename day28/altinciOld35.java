package com.days.day28;

public class altinciOld35 {
    public static void main(String[] args) {
       /*
       Return true if the given non-negative number is a multiple of 3 or 5,
       but not both. Use the % "mod" operator -- see Introduction to Mod

old35(3) → true
old35(10) → true
old35(15) → false
        */
     /*   int number = 15;
        if ( number % 3 == 0 && number % 5 == 0 ) {
            System.out.println ( false );
        }else if ( number % 3 == 0 || number % 5 == 0 ) {
                System.out.println ( true );
            }else{
            System.out.println (false);
        }
// working
*/
        System.out.println (old35(45));/// onemli yukaridaki kodu methoda donusturduk asagida!!!!

    } //main

public static boolean old35(int number){
    boolean result;

        if ( number % 3 == 0 && number % 5 == 0 ) {
        result=false;
    }else if ( number % 3 == 0 || number % 5 == 0 ) {
        result =true;
    }else{
        System.out.println (false);
        result =false;
    }
        return result;
}







}
