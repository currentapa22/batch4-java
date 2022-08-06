package com.days.day25;

public class thirdMethodOverloading {
    public static void main(String[] args) { //return type is not in the method's signature .
                                            //depending on parameter types , java will know which method we meant.
                                           // sometimes kullanicidan veri almamiz gerekiyor ayni islem icin , double olabilir integer olabilir ,
                                          // boylece veri turu ne olursa olsun bizim ona uygun bir methodumuz var ve java bunu kendi secicek.!
        System.out.println ( sum ( 1, 2 ) );
        System.out.println ( sum ( 1.2, 1.5 ) );           //click on sum here ,it will show which method java using!!
    }                           //bazen veri type belli olsa da kac tane oldugunu bilmiyoruz
                                //2 int olabilir ,3 int olabilir ,4 int olabilir.Biz bunlarin hepsini olustururuz ve gelen veriye gore java kendi secer hangi methoda gidecegini.



public static int sum(int num1,int num2){
    return num1+num2;
    }
public static double sum(double num1, double num2){
        return num1+num2;
    }

  //  public static void main(int[] args){ //String yerine int yazinca, bu methoddan compile edemezsin, String pre-defined method!

   // }



}

//Applying Acces Modifiers;
//1.private=Only accessible within the same class
//2.default(package private) access= private and other classes in the same package
//3.protected= The method can only be called from classes in the same package or subclassses.
//4.public=The method can be called from any class.
