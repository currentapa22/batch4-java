package com.days.day21;

public class methods2ders {

    public static void main(String[] args) {
        //compiler's first destination is main method!
        System.out.println ("I am in the main method");
    method1 (); // this is how we call the method.  syntax is methodName ();
    method1 (); // istedigimiz kadar bu kodu calistirabirliriz , tekrar tekrar compile edebiliriz.!
         //java  method1 i compile ettikten sonra ,method1 (); a gelecek tekrar,ardindan buradan compile etmeye devam edecek!!
    method2();
    method3 ();
        System.out.println ("After the method is called");
    }
   //public is access modifier
   // if we put static we can reach it from main method
  //any returning type of value we would put void
    public static void method1(){
        System.out.println ("Method 1 is called");

        //to see this method in the result we need to call this IN MAIN METHOD
        //method1 (); is how we do it!
        //without calling the method , its useless!

    }

    //lets create another method!

    public static void method2(){

        System.out.println ("Method 2 is called");

    }

    public static void method3(){

        System.out.println ("Method 3 is called");
    }

}
