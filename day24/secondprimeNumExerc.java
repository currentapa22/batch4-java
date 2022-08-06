package com.days.day24;

public class secondprimeNumExerc {
    public static void main(String[] args) {
    /*  int count=0;
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
        }*/
        primeNumbers (50,100);
        primeNumbers (100,200);
        primeNumbers (12,43);


    }//main methods ends
    //public keyword bizi disaridan bu package ye erismemizi ve bu pakeetten de disariya erismemizi sagliyor!
    //public provides method or variable ,to be reached from outside of the class.
    //right now we are using this in class so it doesnt matter.
    public static void primeNumbers(int firstNumber,int lastPoint){ //prime numbers 50-100
        int count=0;
        for (int k = firstNumber; k < lastPoint; k++) {     //outer loop

            for (int i = 2; i < k; i++) {//inner loop //divider comes from here

                if ( k % i != 0 ) {
                    count++;
                }
            }

            if ( count == k-2 ) {
                System.out.println ( k+"= Prime number" ); //we only need prime numbers.
                //     } else {
                //       System.out.println ( "Not prime number" );
            }
            count=0;
            //System.out.println ( "k= "+ k );
        }
    }






}
