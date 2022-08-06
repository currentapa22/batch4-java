package com.days.day17;

public class forloopsecondders {

    public static void main(String[] args) {

        //will print "Hello world!" 3 times using for loop
        // i = 0  first cycle
        // i = 1  second cycle
        // i =2   third cycle

            //no.1      no.2    no3.
        for(int i=0 ; i < 3 ; i++){

           //no.4
            System.out.println ("Hello World!");

        }
        System.out.println ("after loop");
        //first destination of compiler is no1 i =0
        //second destination of compiler is no2 if the condition is true
        //third destination is no4 after block is executed.
        //forth step is no3   , i will be 1
        //fifth step is no 2 , condition is still true
        //                                   ->> will print hello world.
        //                                   no3 i++ --> i will be 2
        //                                   no2 if the condition is true
        //                                  no 4 print hello wolrd
        //                                   no3 i++ -->i will be 3
        //                                  no2 i is 3 condition is false , will terminate the loop.

        //note 1= no1 yani initialization part works only on time,once it started to compile there is no turn back that.
        for(int a=0; a<4; a++){
            System.out.println ("Merhaba");
            System.out.println ("Nasilsin?");
        }


        for(int b= 5; b<10;b++){
            System.out.println ("Hello again");



        }
        for(int i=0; i <3; i++){

            System.out.println ( "i = " + i );
        }


        for(int j=0; j <=3; j++){     // i<3   !=     i<=3    karistirma kucuk esittir ,buyuk esittir oldugunda.

            System.out.println ( "j = " + j );
        }




        //baska bir ornek yaptik

        for(int q= 10; q<21 ;q++){
            System.out.println ( "q = " + q );
        }
        //10 ile 20 arasindaki sayilari yazmak istiyorsak q<21 olmali ya da q <=20
        //!!!!!!


        for(int i =0; i<10; i+=2){   //arttirma faktorunu degistirdik, ikiser ikiser artiyor.!!
            System.out.println (i);
        }

        for(int j = 0 ; j < 100 ; j +=5){
            System.out.println ( "j = " + j );
        }

        for(int f=0 ; f<10; f++){
            System.out.print ( " f = " + f );   //what will i do , if i want to print all values on 1 line
        }                                        //we should delete ln from println.

        System.out.println ("bos lane");
        for(int z =10; z>=0; z--){
            System.out.print ( " z = " + z );

        }


        for (int ten=10; ten<=50; ten++){
            System.out.println ( "ten = " + ten );
        }

        //sum of the numbers between 0-50 addition.
        int sum = 0 ;
        for( int a = 1; a<=50 ; a++ ){
         sum    = sum   +   a;
                // System.out.println ( "sum = " + sum ); icine yazarsan her sonucu ayri ayri cikartirsin.
        }
        System.out.println ( "sum = " + sum );
        // another example.
        int result=0;
        int lastPoint=50;
        for(int y = 1;y<lastPoint; y++) {

            result= result+y;
        }
        System.out.println ( "result = " + result );

        //Remainings

        //numbers can be divided by 5 without remainings between 0-100.

        for(int five=0; five<101 ; five ++){

            if(five % 5 ==0){
                System.out.println (five);
            }
        }

        for(int num=5; num<101; num+= 5){
            System.out.println ( "num = " + num );
        }
        //yukaridaki kodun bir baska sekilde yazilmis hali







    }
}
