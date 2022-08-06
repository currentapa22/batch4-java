package com.days.day48;

public class Person_4 {
  private  String name;
    String surname;
    int birthYear;
    char gender;
   private int age;
    boolean university;
    String country;

     /*when we creating object, its okay user to assign the name of the object but sometimes we don't want user to change properties.(no accessibility )
    / on backend java hide something .Even tho we don't see any modifiers before class variable names mean String name; (from Person_4).
    Before string we don't see anything but there is default acces modifiers for all properties.
    if we put private String name ; means its not accessible anywhere else but the class its belong
   user can reach the name only 1 time , when creating an object via constructor method. After  create , user can't reach the name again.
   But there should be some ways to reach 'name' property from out of the class ?

   make the property private and don't allow to change the value from out of the class means encapsulation.
   We can create a method in this class. We don't have any problem to reach name from here.
   So we have authorization about that value either user can change it or not.
    */


    Person_4(String nm){
    this.name=nm;   //this keyword represents the object name.
    }

    Person_4(String name,int birthYear){
    age=2022-birthYear;
    }


public void eating(){

    System.out.println (name+ " is eating ");

}

public void reading(){

}

public String getName(){

    System.out.println ( "name = " + name );
return name;
    }

    public int getAge(){

        System.out.println ( "age = " + age );

        return age;
    }

}
