package com.days.day21;

import jdk.swing.interop.SwingInterOpUtils;

public class Paramete4ders {
    public static void main(String[] args) {
        System.out.println ("Main method");
       String person="Ronaldo";
    //6.hello(String name) , string dedigimiz icin hello methodunun main method icinde cagirirken bu stringe deger vermek zorundayim!!!!
    hello ("Burak"); // 7.hello(name: "Burak") parentez icine value yazicaz and we will pass to value in method asagidaki!
    hello ( "Ali" );   //8.also parameter and data type should compileable.String=2 xxx
    personAge(person,37);//we can assign a value , outside of its method as you can see
        //we can't assign an integer for personAge because asagida onu string olarak tanimladik zaten
    personAge ( "michael",50 );
        System.out.println ("End of main method");
//1.in general method names starts with small letter.
    }
//2.if we want to declare a variable and reach that from outside of the class we declare it in hello()
    //3.so declaring a variable in hello() parenthesis would allows us to get value from outside the method.
   // 4.we didn't assign any value to this variable, we will  get the value from outside sources.
   //5.we didn't put = or ; in the parenthesis
    public static void hello(String name ){
      // String name;
        System.out.println (name);

        System.out.println ("Hello " + name);

        //9. what is the difference declaring String name in hello() or doing it in the {}?
        //if we declare in {} we can't get any value from outside ,if we want to get value from outside we have to create it in the parenthesis

    }
    public static void personAge(String a,int age){ //10.yukarida parentez ici icin person yi tanimladik ama burada String a yaziyor
        //11. String burada data type, as long as data type is same, "a" onemli degil. a = Ronaldo , yukarida tanimladik, degeri a variablesine pass ediyoruz!!!
        System.out.println (a);
        System.out.println ("Person age");
        System.out.println ( a+" is  "+ age+" years old. ");
        //12.public static void personAge(String a,int age){} parentez icine birden fazla ve farkli turde variable tanimlayabilirsin ama
        //bunu yaptigin zaman main methodun icindeki personAge yi de buna uygun duzenlemen gerekiyor
        //personAge(person,age: 37);
    }




}
