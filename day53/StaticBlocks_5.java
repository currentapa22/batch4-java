package com.days.day53;

/*
These are a block of codes with a static keyword.In general , these are used to initialize the static members.JVM executes static
blocks before the main method at the time of class loading.

Although we can initialize static variables directly during declaration, there are situations when we need to do the multiline processing.

Suppose we want to initialize a list object with some predefined values.

The static block in a program always executed first before any static method , non static method, main method

To create a static bloc in java we need to use the static and with the block




 */

public class StaticBlocks_5 {
    /*
    {                //these are called instant code block
                    // a non static block always run after the static blocks.
    }               // we need to declare an object in order to run this instance block.Just declare it and dont have to do anything else.
*/
    static int num;
    int insNumber;
    {
        System.out.println ("Instance block");     //instance block will run as many time as how many object we have .
        insNumber=10;
        System.out.println ( "insNumber = " + insNumber );
    }

    {
        System.out.println ("Instance block  2 ");

    }

    static { //called static block // will run before main method.          //Static blocks work only 1 time.
        num=5;
        System.out.println ("Static block");
        System.out.println ( "num in static = " + num );
    }
        static {

            System.out.println ("Static block 2");
        }


public StaticBlocks_5(){
    System.out.println ("Default constructor.");
}

    public static void main(String[] args) {
        StaticBlocks_5 obj=new StaticBlocks_5 ();
        System.out.println ( "MAIN METHOD-obj.insNumber = " + obj.insNumber );
        StaticBlocks_5 obj2=new StaticBlocks_5 ();

        System.out.println ("Start main method");
        num=6;
        System.out.println ( "num in main method = " + num );
        System.out.println ("End point method");
    }




    /* priority is : 1. static block
        2. instance block
        3. constructor --  after constructor whatever we have will work.
        4.main method

     */

}
