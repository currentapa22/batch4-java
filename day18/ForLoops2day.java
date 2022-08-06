package com.days.day18;

public class ForLoops2day {

    public static void main(String[] args) {
        //for(starting value; ending condition; increasing or decreasing the value){
        // statements();
        // }

        for( int i =0;   i<5;   i++){
            System.out.println ("Hello Again!");
        }

        //or we can do this
        int a=0;
        for (;a<=5;a++){                //we can create and initialize the variable before the loop.
            System.out.println ("Merhaba");
        } //closing curly braces, end of body!
        System.out.println ( "a = " + a );
        //a=6 here!


        //is it possible to use integer a again that we used above ?
        a=0;
        //we cant declare again but we can assign a different value!
        //for(int a=a;a<5;a++){}
        for(; a<5;a++){

            System.out.println ( "Hello eurotech!" );
        }
        int b=0;
        for(b=0; b<3;b++){
            System.out.println ("Sise!");
        }
        //b yi for loop un disinda kullanamazsin cunku for loopta tanimlanmis bir deger sadece {} icinde gecerli!!!
        //if we want to use b after loop , we should declare it BEFORE LOOP!!!!!
        //variableyi if statement in icinde olusturursak, o variable {} icinde gecerli!




        //we will find numbers between 1-100
        //divided by 5 without remaining.(en son update ile degistirdik yapisini !)
        //how many numbers are there ? we can add new variable and ++ ile loop sayisinca artar ve goruruz.!
        int count=0;
        int lastPoint=200;
        int divident=7;
        for( int t=1 ; t<=lastPoint; t++) {
            if ( t % divident == 0 ){
                count++;
                System.out.println (t+" can be divided by"+ divident+"without remaning");
            }
           // count++; //buraya koyarsak yukaridakinin yerine sonuc ne olur ?? 200! cunku for loop un icinde!
        }
        System.out.println ( "count = " + count );  //28 , toplamda 28 tane sayi-cumle-loop var.















    }
}
