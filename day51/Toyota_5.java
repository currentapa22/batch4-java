package com.days.day51;



public class Toyota_5 {
    public static void main(String[] args) {


        Car_4_ders toyota=new Car_4_ders (2,10000);
        toyota.color="Black";
        toyota.model="Corolla";
       // toyota.door=4;


        Car_4_ders car2=new Car_4_ders (5,5000);
        car2.color="Blue";
        car2.model="Yaris";
      //  car2.door=2;

        toyota.printInfo ();
        car2.printInfo ();
        System.out.println ( "toyota.value = " + toyota.value );
        System.out.println ( "car2.value = " + car2.value );
        System.out.println ( "toyota.speed = " + toyota.speed );
        System.out.println ( "toyota.gear = " + toyota.gear );
        toyota.accelerate ();
        toyota.accelerate ();
        toyota.accelerate ();
        System.out.println ( "toyota.speed = " + toyota.speed );
        System.out.println ( "toyota.gear = " + toyota.gear );

        System.out.println ( "car2.speed = " + car2.speed );
        System.out.println ( "car2.gear = " + car2.gear );
        car2.accelerate ();
        System.out.println ( "car2.speed = " + car2.speed );
        System.out.println ( "car2.gear = " + car2.gear );

        System.out.println ( "toyota.speed = " + toyota.speed );
        System.out.println ( "toyota.gear = " + toyota.gear );
        toyota.hasAccident ();
        System.out.println ( "toyota.speed = " + toyota.speed );
        System.out.println ( "toyota.gear = " + toyota.gear );

        System.out.println ( "toyota.getYear () = " + toyota.getYear () ); // year field private but getter method ile erisebiliyoruz.
        System.out.println ( "car2.getYear () = " + car2.getYear () );

        toyota.setDoor ( 4 );
        System.out.println ( "car2.getDoor () = " + car2.getDoor () );
        System.out.println ( "toyota.getDoor () = " + toyota.getDoor () );
        car2.setDoor ( 2 );
        System.out.println ( "car2.getDoor () = " + car2.getDoor () );

        //with the get method you can reach value of the properties out of the class.
        //with the set method you can change value of the properties out of the class.

        toyota.setDoor ( 20 );
        System.out.println ( "toyota.getDoor () = " + toyota.getDoor () );

        car2.setYear ( 3000 );
        System.out.println ( "car2.getYear () = " + car2.getYear () );


    }
}
