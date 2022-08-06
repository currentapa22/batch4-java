package com.days.day28;

public class yedinciteensum {

    public static void main(String[] args) {
        //6.ve 7 . ders coding batteki sorularin cozumleri.
        //ekran goruntusunu aldim old35 icin!
  /*
  Given 2 ints, a and b, return their sum. However, "teen" values in the range
  13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.


teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
  */


    int result= teenSum ( 10,13 );
        System.out.println (result );




    }
public static int teenSum(int a , int b){
        if((a>12&&a<20)||(b>12&&b<20)){
            return 19;
        }else{
            return a+b;
        }
}

}
