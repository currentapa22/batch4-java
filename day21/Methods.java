package com.days.day21;

public class Methods {

    //hoca java icindeki en onemli konulardan biri oldugunu soyluyor!
    //zor olmadigini ama cok onemli oldugunu soyluyor!
    public static void main(String[] args) {
        //find the addition of numbers between 10-50
      int sum = 0;
        int i;
        for (i = 10; i < 50; i++) {
            sum += i ;
        }
        System.out.println ( sum );

        //bu sadece bir denemeydi ama bazen bu kodu yazip onlarca yuzlerce kez kullanmamiz gerekebilir
        //methodlarda collection of statements grouped together to perform an operation.
        //Methods= can be used to define reusable code, organise and simplify coding.
        //methods allow us to reuse the code without retyping the code!

        //In the class we will create our methods.
    burak();// main methodun icinden cagirmak icin yapabilirsin.
    burak();    //if we want to reach this method from in other classses ,we can put class name and put . so you can see both main method or burak method you created.
       //Methods.burak (); after the main method in different classes we can put this and reach this method from different classes!
        //bu featureyi static keyword sagliyor!
    }
    //main method ile class bracetslerinin arasini bilerek actik!
    // our methods will be in the class!
    //we will not write our method in the main methods!
    //kisaca method ,class in icinde ama main method un disinda olacak!

    // public and static are both called Method Modifiers!But ozellikle public called 'access modifier'
    //so it will give us who can reach the method .Public keyword u silersen ,disardan erisim saglanamaz!

    // void is the return type of the method.We can change it to int,String,double,boolean.This method will return a value.
    //if method doesn't return any value , we would put void in it.

    //method name'e istedigin adi verebilirsin.
    // from main method(up) , we can call this method just putting hello();
    //but if we delete static keyword from there we can't reach the method outside of the method.
     ;
    //syntax of method!
    //at first we will write public
    //method a isim verirken , variable isimlerinde olan kurallar gecerli!

    public static void burak(){  //betweend the curly braces this is the body of the method.
        System.out.println ("Hello World"); // yukaridaki main methodtan baslarsa compile a bu sonuc cikmaz.
                                            //method u cagirmadan/invoke yapmadan method calismaz so oncelikle cagirman gerek!
                                            //to call the method , you will put the name of the method in the main method
                                            //burak();
                                            //if we call the method , the name of the method would be highlighted.
                                            //main methodu compile eder gibi calistirsin, bu 2.methodda calisir.
                                            //i can call this method more than 1 times and we would get hello world as many times i want.
                                            //but if we  delete the burak(); in main method we wont see any result after compile.
    }






}










