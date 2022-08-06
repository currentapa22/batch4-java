package com.days.day28;

public class dortmethods {
    public static void main(String[] args) {

        printHelloJava ();
        dortmethods.printHelloJava ();//future of static
        printName("World");//this arguments goes to the parameter String name on line 15.
        printName ( "Ali" );

        String str="Ronaldo";
        printName (str);
        callMethod ();
        callMethod ("Messi");
    }

    public static void printHelloJava(){
        System.out.println ("hello java");

    }
    public static void printName(String name){

        System.out.println ( "name = " + name );


    }

    public static void callMethod(){
        printHelloJava ();
    }
    public static void callMethod(String str){ //overloading here.
        //number of the parameters or
        //type of the parameters or
        //sequence of the parameters should be different for overloading.
      printName (str);   //baska bir methoda bu methodun argumanini verebiliyoruz!

    }




}
