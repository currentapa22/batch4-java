package com.days.day20;

public class sonders {

    public static void main(String[] args) {
        //slayt 8.sayfa

        int balance=10;
        while(true){
            if (balance<9)
                break;
            balance=balance-9;
        }
        System.out.println ("Balance is " + balance); //balance is 1


        int balance2 = 10;
        while (true) {
            if ( balance2 < 9 )
                continue;
            balance2 = balance2 - 9;
            System.out.println ( "balance2 = " + balance2 );
        }



        // converting loops for to while
        //labelled statements slaytlari okuduk.

        //   int     num1=1;
          //  int    num4=2;


        //outer:
      //  do{
          // label2:
          //  while(num4>num1){
            //    MuratsLoop:
              //  while(num1>num4){
                //     while (num4>num1){
                  //       if(2>1){
                    //         break MuratsLoop;
                    //     }
                     //}
                //}
            //}
        //}while(true);


        //14.sayfada the return statement var.Ona da bak



















    }


}
