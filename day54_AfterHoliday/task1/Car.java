package com.days.day54_AfterHoliday.task1;

public class Car extends Vehicle {
    //if we extending vehicle class, means that compiler will go vehicle class first and there is constructor method says "vehicle cons!!!" and then comes back
    //here and Car class's consructor will compile.!

    public Car(){
        System.out.println ("Car constructorrr!");
    }

    int tiresSize;

    String brand;

    int doorNumber;


    public void honk(){

    }

    public void handBreak(){

    }

    public void openTrunk(){

    }

}
