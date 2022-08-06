package com.days.day19;

public class dowhile3class {


    public static void main(String[] args) {

         //A do-while loop is the same as a while loop except that it executes the loop
        //body first and then checks the loop continuation condition

        //syntax:
        // do{
         //loop-body-this body runs at least 1 time regardless of condition
        //statement(s)
        //} while ( loop -continuation-condition/boolean);

        //when you call do while loop on compiler, it would work always on first time!!!.

        //02:08:40

        do{
            System.out.println ("Inside loop!!!");
        }while(false); //dont forget semicolon ; here !!!!!


        //lets do examples
        //where to decrement or increment ops going??

        int num1=3;
        do{
            System.out.println ("num1 = " +  num1);
            num1--;// increment decrement ops here

        }while(num1>0);
        System.out.println ("GO");

        int num2=3;
        do{
            System.out.println ("num2 = " +  num2);
            num2--;// increment decrement ops here

        }while(num2>4);// even the condition is false, at least one time this code will work.
        System.out.println ("GO");



        int numa=3;   // we want to print 3 2 1 gooooo(separately)
        do{
            System.out.println (numa);
            numa--;
            if(numa<1)System.out.println ("Goooooo"); //how we can make this line print only once, instead of 3 times?
        }while(numa>0);                     //do while loop is usuable, but there might be some times that u should not do that!
                                            //bil ama her zaman kullanman gerekmez
        // soruyu kendin cozdun tebrik ediyorum hocam!


        int b=10;
        do{
            System.out.println (b);
            b--;
        }while(b>1); // if b was 1 , we only see 1 on the command line!

        //slaytlari okumak gerek guzel bilgiler var sonlara dogru!



        int number1=2;
        int number2=1;

       System.out.println ("METHOD-1");


       while(number2>number1) {
            System.out.println ( "METHOD-1" );
        }


        do{
            System.out.println ( "METHOD-1" );
        }while(number2>number1);

















































    }
}
