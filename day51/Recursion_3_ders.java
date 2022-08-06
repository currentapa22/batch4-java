package com.days.day51;

public class Recursion_3_ders {
    public static void main(String[] args) {


        System.out.println ( recursion ( 5 ) ); // instead of calling this method in main method i can call it in its own method body.its called recursion
        System.out.println ( fibo ( 5 ) );
    }

    public static int recursion(int endPoint){
       // System.out.println ("recursion");
     if(endPoint>0) {
                    //  5  + 4  +  3  + 2 + 1  // Recursion is the technique of making a function call itself.
         return endPoint + recursion ( endPoint-1 ); // if we don't put an end point it will be infinite loop!.
     }else{
         return 0;
     }
    }

//there is another solution for fibonnacci

    public static int fibo(int num){
        if (num==0){
            return 0;
        }else if(num==1){
            return 1;
        }else if(num>0){
            return fibo ( num -1)+(num-2);
        }
            return 0;
    }

}
