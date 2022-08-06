package com.days.day23;

public class altinciders {
//fibonacci numbers ile alakali
    public static void main(String[] args) {

   //fibonacci
   //0 1 1 2 3 5 8 13 21 34 55

  //prime numbers only divided by 1 and itself without remaining.
  //2 3 5 7 11 13 17 23 29 31 37

  //will give a number and find whether this is prime or not.

  //47
  //47/2 47/3 47/4 47/5 47/6 47/7 47/8 47/9
        int count = 0;
        //6%2  6%3 =0; not prime number
        // 7%2 7%3 7%4 7%5 7%6 !=0 so seven is prime number! 7 %7=0
        for (int i = 2; i < 47; i++) {

            if ( 47 % i != 0 ) {
                count++;

            }
        }
        System.out.println ("count = "+ count);
        if(count==45){// en kucuk asal sayi 2 oldugundan 47-2 diye yazdik buraya 0- 1 i cikarttik.
            System.out.println ("Prime number");
        }else{
            System.out.println ("Not prime number");
        }
            ///bu prime number bulma koduna bir bak ve method icine koyup dene .ders calisirken!!!!!!!!!!!!!


    }
}
