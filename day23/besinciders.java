package com.days.day23;

import java.sql.SQLOutput;

public class besinciders {
    //Ders adini breaks koyduk!

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println ( "Hello Break" );
            if ( i == 5 ) {
                break;
            }
            System.out.println ( "Hello" );
        }
        System.out.println ( "after loop" );


//Note;//if we put break "Hello Break" x1  // if we put continue "Hello Break"x10.
//           // System.out.println ("Helo"); //breakten sonra koydugun kod unreachable, so it will give error
//        }                                  //after return we cant write any code either.!

        for (int i = 0; i < 5; i++) {
            System.out.println ( "i= " + i );
            if ( i >= 3 ) {
                continue;
            }
            System.out.println ( "after continue!" );
        }


          //  i= 0
         //  after continue!
        //        i= 1
       // after continue!
        //       i= 2
        //after continue!
       //      i= 3
        // i= 4




    }

}