package com.days.day51;

import java.util.Scanner;

public class Car_4_ders {

    String model;
  private  int door;
    String color;
 private int year;
 int speed;
 int gear;
 int value;

 Car_4_ders(int age,int value){ //constructor
    this.year=age;
    this.value=value;
 }
 public void setDoor(int d){             //By using set method i will be able to change value of the private properties.
    if(d>4 || d<2){                     //if condition ekleyerek, assign edilebilecek valueleri ben kontrol edebiliyorum.
        System.out.println ("There is no car with the "+ d + " doors.Assign it again please");
        System.out.println (" the value has not being assigned");
    }else{
        this.door=d;
    }

 }

 public void setYear(int year){
     if(year>2022 || year<2000){
         Scanner scan= new Scanner (System.in);
         System.out.println ("Invalid value try again pls");
         System.out.println ("Send a new year and pls try to be logical");
         setYear (  scan.nextInt ());

     }else{

         this.year=year;
     }

 }
 public int getDoor(){
     return this.door;
 }



 public int getYear(){ // getter method
     return year;
 }
public void accelerate(){
     speed= speed+20;
     if(speed<20&&speed >10){
         gear=2;
     }else if(speed>=20&&speed<50){
         gear=3;
     }else if(speed>50){
         gear=4;
     }
}

    public void printInfo(){

        System.out.println ( "model = " + model );
        System.out.println ( "door = " + door );
        System.out.println (color );
        System.out.println ( "year = " + year );
    }
public void hasAccident(){
    System.out.println ( "At the time of accident the speed of the "+model+" was " + speed );
    value-=1000;
     speed=0;
     gear=0;


    }

}



