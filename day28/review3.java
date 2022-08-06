package com.days.day28;

public class review3 {
    //day 26 nin dosyasi bos cunku sadece pdfleri okuduk ve basit egzersizler yaptik!
    public static void main(String[] args) {
        //initialization  condition   increment or decrement
        for(int i =0;i<10;i++){
            System.out.println ( "i = " + i );
        }

        int a=10;
        while(a<15){
            System.out.println ( "a = " + a );

            a++;
        }
        System.out.println ("out of while loop");
        ////////////////////////////////
        int b =10;
        while(b>0){

            System.out.println ( "b = " + b );
            b--;
        }
        System.out.println ("out of second while loop baby");
        int c=5;
        do {
            System.out.println ("do while loop denemesi");
            c++;
        }while(c<10);
        System.out.println (c);


        int d=0;
        while(d<60){
            System.out.println ("before if"+ d);
            d=d+3;
         if(d>51){
             break;
         }
            System.out.println ("after continue"+d);
        }





    }
}
