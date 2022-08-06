package com.days.day22;

public class ders9 {
    public static void main(String[] args) {

//*
//**
//***
//****
//*****


        for (int i = 0; i < 5; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print ( "^" );  //print ln yerine print kullandik
            }
            System.out.println ();//bunu da bir sonraki satira gecis icin kullandik.

        }

        //                   *
        //                  **
        //                 ***
        //                ****   //outer loop would define the rows.
        //               *****  //calisiyor!!!
        for (int i = 0; i < 5; i++) {//outer loop
            for (int n = 4; n > i; n--) {//inner loop1
                System.out.print ( " " );
            }
            for (int k = 0; k <= i; k++) {//inner loop2
                System.out.print ( "*" );

            }
            System.out.println ();


        }
    }
}