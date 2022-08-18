package com.days.day54_AfterHoliday.task1;

public class test1 {
    public static void main(String[] args) {

        Car car1=new Car ();

        car1.name="Niro";   //we are keeping values separately in memory.
        car1.doorNumber=5;
        car1.weight=100;
        car1.brand="Kia";
        car1.tiresSize=16;
        System.out.println ( "car1.name = " + car1.name );
        car1.bigbossName="Multi level";
        System.out.println ( car1.bigbossName );// i can access bigboss's fields , multi level inheritence.!!!

        System.out.println ("\n////////////////////////////////\n");

        Car car2=new Car ();
        car2.name="CX30";
        car1.doorNumber=3;
        car1.weight=400;
        car1.brand="Kia";
        car1.tiresSize=18;



        Plane plane1=new Plane ();

        plane1.name="Boeing";
        plane1.doorNumber=2;




    }
}
