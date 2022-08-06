package com.days.day13;

public class nestedifsecondpart {

    public static void main(String[] args) {


        //1-24 if hours outside of this range --print invalid data
        //1-5: early morning
        //6-11 :morning
        //12-14 :nood
        //15-17:afternoon
        //18-19: evening
        //20-24: night
        int hours = 24;
        if (hours < 1 || hours > 24) {
            System.out.println( "INVALID Data" );
        } else if (hours <= 5){
            System.out.println( "early morning" );
        } else if (hours <= 11){
            System.out.println( "morning" );
        } else if ( hours<=14){
            System.out.println( "noon" );
        } else if ( hours<=17 ){
            System.out.println ("afternoon");
        } else if ( hours<=19) {
            System.out.println ("evening");
        } else{
            System.out.println ("night");

        }


            //sout yapmaktansa her satirda , stringe baglamak okuma acisindan daha kolay.
        String message="";
        int hourz = 2;
        if (hourz < 1 || hourz > 24) {
            message="INVALID Data";
        } else if (hourz <= 5){
            message="early morning";
        } else if (hourz<= 11){
            message="morning" ;
        } else if ( hourz<=14){
            message = "noon";
        } else if ( hourz<=17 ){
            message="afternoon";
        } else if ( hourz<=19) {
            message="evening";
        } else{
            message="night";

        }

        System.out.println ( "message = " + message );
        //not degerlendirme ve harf verme kodu
        //100-90=A
        //89-80=B
        //79-70=C
        //69-60=D
        //60-00=F
  //UZUN YOLDAN YAPIMII
      //  int note = 99;
        //String oto="Your score is= ";
        //if(note>100 || note<0 ){
          //  oto="Impossible note you got here ";
        //} else if (note<=100 && note >=90 ){
          //  oto="You got an A";
       // } else if (note <=89 && note>=80 ) {
         //   oto= "You got a B";
       // } else if (note <=79 && note>=70 ) {
           // oto="You got a C";
       // }else if  (note<=69 &&note>=60){
         //   oto="You got a D";
        //}else {
          //  oto="You got a F";
        //}
        //System.out.println ( "my score is  " + oto );

// KISA YOLDAN YAPIMI
        int note = 71;
        String oto="Your score is= ";
        if(note>100 || note<0 ){
            oto="Impossible note you got here ";
        } else if (note >=90 ){
            oto="You got an A";
        } else if (note>=80 ) {
            oto= "You got a B";
        } else if (note>=70 ) {
            oto="You got a C";
        }else if  (note>=60){
            oto="You got a D";
        }else {
            oto="You got a F";
        }
        System.out.println ( "my score is  " + oto );

        //dogru yaptim kendi basima!!!!!
        int dayNumber=1;
        String day=" ";
        if(dayNumber<0 || dayNumber>8) {
        }else if(dayNumber<=1){
            day="Monday";

        }else if(dayNumber <=2){
            day="Tuesday";
        }else if(dayNumber<=3){
            day="Wednesday";
        }else if(dayNumber<=4){
            day="Thursday";
        } else if (dayNumber<=5 ) {
            day="Friday";
        }else if(dayNumber<=6){
            day="Saturday";
        }else if(dayNumber<=7 ){
            day="Sunday";
        }
        System.out.println ( "day = " + day );


        int x=2,y=2;   //x=3 y=2 oldugunda hicbir output vermiyor. slayt 8. sayfa ornek!
                       // if x=3 , y=4 z=7
                        // x and y =2 olunca cevap x is 2.
        if(x>2){
            if(y>2){
                int z =x+y;
                System.out.println ("z is " +z);
            }
        }
        else{
            System.out.println ("x is "+x);
        }




        int a =20;
        int b=10;
        if(a>10){            /// only A would print ,else faktorunden dolayi ussteki line dogru ise asagi gitmiyor.
             // ama sadece if olursa abc yi de gorururz.
            System.out.println ("a is bigger than 10");//a
        }else if(b>5){
            System.out.println ("b is bigger than 10");//b
        } else if (b<20 ) {
            System.out.println ("b is smaller than 20 ");//c
        }else{
            System.out.println ("There is no answer!!!!!"); //d
        }


    }


}

    

























