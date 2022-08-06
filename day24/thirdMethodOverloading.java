package com.days.day24;

public class thirdMethodOverloading {
    public static void main(String[] args) {
        //slaytlarda yazan notlari geciriyorum, pdf yuklenmemis sisteme daha.
        //what is method overloading?
        //1. method overloading allows a class to define multiple methods with the same name , but different signatures.
        //what we mean by signature? methods name and parameters is signatures of that method.

        //method overloading allows two or more methods can have the same name inside the same class if they accept different arguments.
        //method isimleri ayni ise compiler nasil anliyor hangisini calistirmak istedigmizi ? cevap; vermis oldugumuz parametrelerden anliyor.
        //parameter sayisi ,
        //parametrenin turu
        //ve paremetrenin yazilma sirasi yani (int a ,string b) ile (string b, int a) ayni degil!.

        //methoddan static keyword u silsende methodoverloading acisindan bir onem arz etmiyor.
        //only important part is signature(method name and the parameters)
        //method overloading gives us flexibility, same name many methods!

        //Different ways of method overloading
        //1.by changing the number of arguments
        //2.by changing to data type of arguments
        //3. by changing the sequence of arguments
        //BUT!!
        //1.Changing the return type of method DOES NOT matter for overloading.

        //for overloading ,first of all method names must be same
        //also parameter types can be different.
        //parameters counts can be different
        //sequence of the parameters can be different.

        //return type in farkli olmasi java icin onemli degil ,java only care signature!

        sumOfNumbers (10,20); //integer method
        sumOfNumbers (10.0,20.0);//double method
        age ( 12,"Burak" );
        age ( "Burak ",66 );
        sumOfNumbers (9,48,53);
    }
    public static void sumOfNumbers(int a ){ //signature is just int a

    }
    public static void sumOfNumbers(){ // signature is empty so its different then other two


    }
   public static void sumOfNumbers(int a, int b){//
       System.out.println (a+b);

   }
   public static void sumOfNumbers(int a, int b, int c){
    //3 parameterli , overloading!
       System.out.println (a+b+c);

   }
   public static void sumOfNumbers(double a, double b){
       System.out.println (a+b);

   }


   public static void age(int num,String name){   //even the body is same ,parametrelerin dizilisi farkli oldugu icin bu ve asagidaki method farklI!!!!
       System.out.println (name+" "+num+" years old.");

   }
    public static void age(String name,int num){
        System.out.println (name+num+" years old.");
    }



}
