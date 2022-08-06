package com.days.day51;

public class Codingbat_fizzString_1_ders {
    public static void main(String[] args) {
        /*
        Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
         */
        System.out.println ( "fizzStr ( \"fig\" ) = " + fizzStr ( "fig" ) );
    }

public static String fizzStr(String str){
        boolean fizz= str.charAt ( 0 )== 'f';
        boolean buzz= str.charAt ( str.length ()-1 ) == 'b';

    if(fizz &&buzz ){
        return "FizzBuzz";
    }
    if(fizz){
        return "FizzBuzz";
    }
    if(buzz){
        return "Buzz";
    }
    return str;
    }


}
