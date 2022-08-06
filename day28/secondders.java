package com.days.day28;

public class secondders {
    public static void main(String[] args) {

        int i = 0;
        do {
            //i=i+3;
            i += 3;
            System.out.println ( i );
        } while (i < 50);

        for (int a = 0; a < 5; a++) {
            if ( a == 3 ) {
                continue;
            }
            System.out.println ( "a = " + a );
            for (int b = 0; b < 3; b++) {
                System.out.println ( "b" + b ); // yukaridaki loop 1 defa donerken asagidaki bu ikinci loop icinde oldugu icin , asagidakinin tamamlanmasi gerekiyor kac defa dongusu varsa.
                // 1 dongu for ilk loop + complete dongu (in this case b=0,b=1,b=2 iken 3 defa calisicak). a=0,a=1,a=2,a=4 iken 4 kez calisicak. ikinci loop bu yuzden 4*3 ten =12 kez calismis olacak.
            }

        }

        System.out.println ("aaaaaaaaaaaaaaaaaaaa");
        for (int b = 0; b < 5; b++) {
            System.out.println ( "b = " + b );
           if(b==2) {
               continue;//will effect rest of the code down!after code will be unreachable

           }
            System.out.println ("b = "+ b);
        }
        //break will terminate the for loop but continue will pass rest of the block




    }

}