package com.days.day39;

import java.lang.reflect.Array;
import java.util.Arrays;

public class onbir_Clubs {
    public static void main(String[] args) {
        //1. try to get only city names from this array
        String[] actualClubs={"Real Madrid","Hertha Berlin","Sporting Lisbon", "Sparta Prague", "Spartak Moskova"};
        //2.check the array you got with this array for whether they are equal.
        String[]cities={"Madrid","Berlin","Lisbon","Prague","Moskova"};//expected data.
        //3. try to make it dynamic.!

        //Hepsinde ortak olan nedir? hepsinde white space var, o yuzden split metod kullanmak mantikli!

       String club="Werder Bremen";
       System.out.println ( "Arrays.toString =" + Arrays.toString ( club.split ( " " ) ) );

    /*   for(int i=0; i<actualClubs.length; i++){
            System.out.println (   actualClubs[i].split ( " " )[1].equals ( cities[i]) );
        }
    1.yol bu*/

        String[] sehir= new String[actualClubs.length];
        for (int i = 0; i < actualClubs.length; i++) {
            String[] s=actualClubs[i].split ( " " );  //split method returns another string array .
            sehir[i]=s[1];//index 1 lazim cunku ikinci kelimeyi almak istiyoruz.
        }
        System.out.println ( Arrays.toString ( sehir ) );
        System.out.println ( "Arrays.equals ( sehir,cities ) = " + Arrays.equals ( sehir, cities ) );
 //2. yol bu !!!
    }
}
