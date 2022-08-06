package com.days.day30;

public class car {
//what is the common properties for car?
//We will learn how can we use a class as a template and how can we assign value to properties
// We will learn what class contains.How to use class like as methods creating by objects.

//You should know that you can create classes and you can use this class as a template.
//You can create object from that class
//if you can see some common properties, like cars , books they all have common functions.all books have page number etc.
//we use abstract(soyut) class to create concrade(somut) objects.

 String color;
 String model;
 int year;
 int plateNumber;
 static String brand="Toyota"; //static oldugu icin, all the cars we will create has toyota brand!!
 //we can't reach this variable through objects.!! static cunku class'a ait.

 public void starts(){

  System.out.println ("The car is started.");
 }
 public void carInfo(){
  System.out.println (plateNumber+" "+color+" "+model+" "+year);
 }

 public void moving(){

 }
 public void breaks(){


 }
 public void stopping(){



 }
}
