package com.days.day37;


import java.util.Random;

public class first_Review {
    //we started talking about day 34, java class libraries.
    //Random class, date class, math class.
    //if you are going to import more than one class , you should be checking the source.Read it!

    public static void main(String[] args) {

        Random random = new Random();

        int randomInt=  random.nextInt ();
        System.out.println ( "randomInt = " + randomInt );

        System.out.println ( "random.nextInt (11) = " + random.nextInt ( 11 ) ); //(dahil)0<=x<11(dahil degil)


        System.out.println ( "random.nextDouble () = " + random.nextDouble () );

        double mydouble=(random.nextDouble ())*-1;
        System.out.println ( "mydouble = " + mydouble );

        //generate max 20 digit int number randomly, and return it as string
        System.out.println ( "random: " + (Math.abs(random.nextInt ())* 4)+ ""+(Math.abs(random.nextInt ()* 4)));    // EKLEDIGIMIZ +"" integeri string e donusturuyor.
            //math.abs mutlak degeri veriyor , sayi negatif se pozitif oluyor.



    }

public static void generate3uniqueNo() {
    //Create  3 unique - dynamic studentId value 5 digit: 10000-100000 arasinda
    //random.nextInt(high-min)+min    //high exclusive
    Random random = new Random ();
    int num1 = random.nextInt ( 90000 ) + 10000;
    int num2;
    int num3;

 //  do {

 //   }while(num2==num1);

    do {
        num2 = random.nextInt ( 90000 ) + 10000;
        num3 = random.nextInt ( 90000 ) + 10000;
    }while(num2==num1||num2==num3 ||num1==num3);

    System.out.println ( "num1 = " + num1 );
    System.out.println ( "num2 = " + num2 );
    System.out.println ( "num3 = " + num3 );

}
//Math class ta en cok kullanilan metodlar:       Math.abs() -- Math.ceil()  -- Math.floor() --   Math.round()




}



