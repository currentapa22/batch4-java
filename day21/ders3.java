package com.days.day21;

public class ders3 {

    public static void main(String[] args) {
        System.out.println ("I am in the main method");
        method3();
        //  I am in the main method
        //Method3
        //Method2
        //method1
    }
    public static void method1(){
        method2(); //bunu yazdigin satir onemli cunku islemleri satir onceligine gore yapiyor.
         // after method2(); method1 in islemleri bitmedigi icin geri donecek buraya ve Method1 i de printout yapacak!
        System.out.println ("Method1");
    }
    public static void method2(){
        System.out.println ("Method2");

    }
    public static void method3(){ // in this method we can call method1 again
        System.out.println ("Method3");
        method1 ();
    }
//method un icine baska bir methodu koyup ilk methodu cagirarark ikincisini de aktif hale getirebiliriz
    //compiler sirasiyla komutlari yerine getirir.!


}
