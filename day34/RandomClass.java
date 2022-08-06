package com.days.day34;

import java.util.Random;

public class RandomClass {
/*
java provides the Random class that we can generate random numbers.
Random class is part of the java.util package, it is read method , so just need an import statement to use it.
 import java.util.Random;
Then create an object to call ready methods
Random randomvalue= new Random ();
*/


    /*Useful Methods of Random objects
nextInt()     Random integer between -2 uzeri 31 and 2 uzeri 31-1                  these methods will return to us!
nextInt(max)  Random integer between 0 and (max-1) (nextInt() den farkli bu.) ( bu method parameter kabul ediyor.

nextDouble()  Random real number between 0.0 (inclusive) and 1.0 (exclusive)
nextBoolean() Random logical value of true or false.
*/
public static void main(String[] args) {

    Random random= new Random ();

    System.out.println ( random.nextInt ());// returned 480463056

    int randomValue = random.nextInt ();
    System.out.println ( "randomValue = " + randomValue ); //returned -1108790731.

//nextInt(max)
    int random100 = random.nextInt ( 101 );//last number-1 oldugu icin (0-100)(included 0 and 100)
    System.out.println ( "random100 = " + random100 );

//nextDouble() method. 1.0 is exclusive !!
    double randomDouble = random.nextDouble ();
    System.out.println ( "randomDouble = " + randomDouble );// should print a number between 0.0(inclusive) <=x< 1.0(exclusive)




    //create a number between (inclusive)0.0< number <1001.0(exclusive) Kendin yaptin helal olsun!!!

    int myNumber=random.nextInt (1002);

    double myDouble=(double) myNumber;

    System.out.println ( "myDouble = " + myDouble );

   /*
   Hocanin bu soruya cozumu
   double randomNew=(random.nextDouble())*(random.nextInt(bound:1002));
   System.out.println ( "randomNew = " + randomNew );

    */

    boolean randomBoolean = random.nextBoolean ();
    System.out.println ( "randomBoolean = " + randomBoolean );

//slaytta sayfa 7 de diger metodlar da yaziyor!
    /*
    we can use nextInt() and generate numbers not only 0-100 ,but however we want. lets say random numbers between 10-110.

  ****  How we can generate random values between two given numbers?? ***
    Random random= new Random();
    int low=1; // inclusive
    int high=100;// exclusive.
    int result= random.nextInt(high-low)+low;
     */

    int low=-10;
    int high=11;
    int example=random.nextInt (high-low)+low;
    System.out.println (example);

     randomOddM();


}



    public static int randomOddM() {
    Random random1= new Random ();
        int kucuk = 50;
        int buyuk = 100;
        int randomOdd = random1.nextInt ( buyuk - kucuk ) + kucuk;
        if ( randomOdd % 2 != 0 ) {
            System.out.println ( randomOdd );
        } return randomOdd;
    }
    //BURADAN ASAGISI HOCANIN randomOdd sorusuna verdigi farkli yontemlerle cozum sekilleri!
/*
 public static int oddRandomGenerator() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter min (inc) value: ");
        int low = scanner.nextInt();

        System.out.println("Please enter max (inc) value: ");
        int high = scanner.nextInt() + 1;
        int value;
        // 1. opt
        do {
            value = random.nextInt(high-low) + low;
        } while (value%2==0);

        // 2. opt:
//        while (true) {
//            value = (random.nextInt(high - low) + low);
//            if(value%2!=0){
//                break;
//            }
//        }


        //3. opt:
//         value= (random.nextInt(high - low) + low);;
//        while (value%2==0) {
//            value = (random.nextInt(high - low) + low);
//        }
 */

}
