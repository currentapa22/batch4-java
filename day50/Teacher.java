package com.days.day50;

public class Teacher {

    String name;


    Teacher(Person person){
        this.name=person.name;

        System.out.println ("an object created from Teacher class.");
    }

public void printName(Person person){
    System.out.println ( "person.name = " + person.name );
    System.out.println ( "person.surname = " + person.surname );
}
}
