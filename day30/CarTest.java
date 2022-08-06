package com.days.day30;

public class CarTest {
    public static void main(String[] args) {
        car myCar= new car(); // i can reach instance variables and instance methods inside car class.
        myCar.model="Corolla";
        myCar.year=2010;
        myCar.color="White";
        myCar.plateNumber=123456;

        car yourCar= new car();
        yourCar.model="Rav4";
        yourCar.year=2020;
        yourCar.color="Black";
        yourCar.plateNumber=654322;

        myCar.carInfo ();
        yourCar.carInfo ();

    }
}
