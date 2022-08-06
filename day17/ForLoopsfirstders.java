package com.days.day17;

public class ForLoopsfirstders {


    public static void main(String[] args) {
        System.out.println ( "Hello World!" );
        System.out.println ( "Hello World!" );
        System.out.println ( "Hello World!" );
        System.out.println ( "Hello World!" );
        System.out.println ( "Hello World!" );
        System.out.println (5>=10);

        //if i want to print number 1-100 how we do ?
        //we do that with loop.

        //The java for loop is used to iterate a part of the program several times.Java for loop is used to run a block
        //code for a certain number of times

        // java provides a powerful construct called a loop that controls how many times an operation or
        //a sequence of operations is performed in succession.

        //There are 3 types of loops in Java
        //1.For loops 2.While loops 3. Do while Loops 4.For each loops

        // syntax for loops:
        // for(Starting Value; Ending Condition; increasing or decreasing the value){
        // }
        //for example: for(initial-action;loop-continuation-condition; action-after-each-iteration){
        //loop body ;
        //Statements;
        //}


        // for(int i =0; i<20; i++){
        //System.out.println ("Java Fire!!!);
        //}

        System.out.println ("Before loop!");
          //1.initialization        2.condition part  3.we will increase or decrease
        for(int i=0                ; i<5           ; i++                         ){
            System.out.println ("Hello World!!!");
            //code, statements come here.. between the curly parantez.
            System.out.println ("Hello eurotech");
        }
        System.out.println ("After loop!");
        //we create and give values to variables in for paranthesis. As you can see in initialization part.
        //we usually use a letter for variable name!
        //Hello World!!!
        //Hello eurotech
        //Hello World!!!
        //Hello eurotech
        //Hello World!!!
        //Hello eurotech     seklinde cikiyor cunku her seferinde loop yaparken {} icini bitirip en bastan tekrar basliyor.


        //for loop bir defa basladiktan sonra i nin degeri +1 olduktan sonra icerideki islemler yapilir } geldigi anda loop tekrar baslar
        // ama javanin dondugu yer 2.condition part a doner . 1. initialization kismina donmez!!!












    }


}
