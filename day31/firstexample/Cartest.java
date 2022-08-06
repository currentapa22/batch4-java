package com.days.day31.firstexample;

public class Cartest {
    public static void main(String[] args) {

     Garage myCar= new Garage ();
     myCar.color=" Black";
     myCar.door=2;
     myCar.speed=100;
     myCar.year=2000;
     myCar.brand="Toyota";
     myCar.moving (); //null Car is moving its the output.Because we didn't assign a value to brand, so its null default.

     Garage yourCar= new Garage ();
     yourCar.color="Silver";
     yourCar.door=4;
     yourCar.speed=130;
     yourCar.year=2010;
     yourCar.brand="Honda";
     yourCar.moving ();








    }
}
