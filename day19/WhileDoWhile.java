package com.days.day19;

public class WhileDoWhile {


    public static void main(String[] args) {
 // A while loop executes statements repeatedly while the condition is true.
        // the while loop is the first indefinete loop we will study.
        //syntax for the while loop is
        //while(loop-continuation-condition -- boolean expression){
        // loop body- if the boolean exp. is true , perform these statements
        //statement(s); (infinite loop) because there is no increment or decrement exp.
        //}

        int number1=5;
        while(number1<10){
            System.out.println ( "number1 = " + number1 );
            number1++;//decrement increment opt.

        }
    for(int i =1; i<10 ;i++){
        System.out.println ( "i = " + i );
    }


    int sum=0,i=1;
    while(i<10){
        sum=sum+i;
       i++; // increment decrement ops. should come after the inside while loop statements.
    }
        System.out.println ( "sum = " + sum );

    int count=0;
    while(count<15){
        System.out.println ("Inside loop first line " + (count<15));

        System.out.println ("Welcome to Java!");
        count++;
        System.out.println ("Inside loop last line "+ (count<15));
    }
        System.out.println ("Outside of loop " + (count<15));

    // bu ornegin sonucunu okursan , while in nasil calistigini gosteriyor!!

        int x =1000;
        while(x>0){ //this condition is always true. so it will reach the int limit but infinite.
            x++;
        }
        System.out.println ("x: " + x); // output is x:-2147483648 ,en buyuk negatif integer!


        byte num2=126;
        while(num2>0){
            System.out.println ("num2 = " + num2);
            num2++; // num2++  =num2+1 this calc return error because of type (explicit)casting!
        }
        System.out.println ("OUT OF byte LOOP, num2: "+ num2);




    }

}
