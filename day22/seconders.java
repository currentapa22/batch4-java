package com.days.day22;

public class seconders { // local variableler ve ayni ismi tasiyan variablelerin declare edildigi yere gore farkli degerler alaabilmesine baktik
    //local variable adinin olmasi buradan kaynaklaniyor.

    public static void main(String[] args) {
    int a =20;
    numbers(a);
    numbers2();
    int number=1;
        System.out.println ("number in the main method = "+ number);


    }
    public static void numbers(int a){
        System.out.println ( "a = " + a );
        int number=100;
        System.out.println ("Number in the numbers method " + number);
    }
    public static void numbers2(){
        int number=500;
        System.out.println ("number in second method " + number);
    }

    //if we declare a variable in 'public static void numbers2(here)' or in body braces that variable
    //belongs to that method!!!
    //only available in that method , local variable.!
    //local methodun icindeki local variable ile main methodun icindeki ayni isimli variable bile ayni degildir!.
    //birbilerinden farklilar!




}
