package com.days.day24;

public class firstday23questions {

    public static void main(String[] args) {
        //dunun sorularini cozucez, ikinci derste method overloading e bakacagiz!

        int count = 0;
        //6%2  6%3 =0; not prime number
        //
        for (int i = 2; i < 7; i++) {

            if ( 7 % i != 0 ) { // 7%2 7%3 7%4 7%5 7%6 !=0 so seven is prime number! 7 %7=0
                count++;//how many times loop executed?

            }
        }
        System.out.println ( "count = " + count );
        if ( count == 5 ) {
            System.out.println ( "Prime number" );
        } else {
            System.out.println ( "Not prime number" );
        }

        //lets find whole numbers
        //yukaridaki kodu kopyalayip burada ki loopun icine koyduk,degisiklik yaptik.
        //int k yi disaridan almak istiyoruz.
        System.out.println ( "-------------------------------------------");
            ;
        for (int k = 2; k < 100; k++) {     //outer loop

            for (int i = 2; i < k; i++) {//inner loop

                if ( k % i != 0 ) {
                    count++;

                }
            }

            if ( count == k-2 ) {
                System.out.println ( k+"Prime number" ); //we only need prime numbers.
       //     } else {
         //       System.out.println ( "Not prime number" );
            }
            count=0;
        }
    }
}
