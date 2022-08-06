package com.days.day9;

public class relationalOperators {

    public static void main(String[] args) {

        int num = 20;
        int num1 =25;
        System.out.println(num==num1); //whether num is equal to num1 or not.
                                      // as  a result java gives boolean value.
                                     //After relational ops, java gives us a boolean results.
 // == used for primitive types , dont use it for strings.
        // even though same value string are not the same because they occupy different places in the memory.
        //cause of that we cant use == on String.There are different methods for String.

        boolean result= true;
        boolean result2= false;
        System.out.println(result == result2);

        double num3 = 5.5;
        double num4 = 6.6;
        System.out.println("num3==num4 = " + (num3 == num4));// string oldugu icin bu parantez icinde ,biz num3==num4 u parantez icine aldik ki java hepsini string yapmaya calismasin

        System.out.println(num3 !=num4); //we are asking to java num3 and num4 not equal ? result true, they are not equal.

        System.out.println("result!=result2 = " + (result != result2)); // we should see true because they are not equal.

        System.out.println("num>num1 = " + (num > num1)); // we are asking num is greater than num1. so result is false
        System.out.println("num<num1 = " + (num < num1));
        // <= or >= or != as you can see = sign is always on the right

        int value = 100;
        int value2= 100;
        System.out.println("value>=value2 = " + (value >= value2));

        int num5= 600;
        System.out.println("value<=num5 = " + (value <= num5));


    }


}
