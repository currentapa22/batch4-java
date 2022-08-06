package com.days.day7;

public class review1and2week {

    public static void main(String[] args) {
        System.out.println("test" + 3 + 2  +1 ); //test string and 3 is number.
        // + ile concatenation olur test ile 3 birlesir.Hala string oldugu icin tek tek 2 ve 1 de birlesir.
        //test321

        System.out.println("test"+4/2*3); //islem onceligi oldugu icin 4/2 first and then 2*3 and then + operator concatenate test with 6(test6)

        System.out.println(4/2.0 *3); //int/double turns double result. and then multiply 3 turns 6.0 as a double!!!\
        // iki tane integer bolme isleminde ise sonuc her zaman tam sayi olur , virgullu kismi atilir.Cunku integer , floating point tasimiyor.

        double lenght = 4, width = 12, height = 7;
        System.out.println(lenght);
        System.out.println(width);
        System.out.println(height);
        double Volume= height * width *lenght;
        System.out.println(Volume);

















    }


}
