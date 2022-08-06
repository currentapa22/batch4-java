package com.days.day50;

public class Person {

    String name;
    private int birthYear; // to reach i need to write a getter method
    int age;
    char gender;
    String surname;
    Add_1 ad=new Add_1 ();
   private String city="Munich";

    Person(){ // person sari renkli cunku add_test2 class ta Person class object created . if we didn't do that it wouldn't be yellow.
        System.out.println (" an object created from Person class");
    }


    public String getCity() {
        System.out.println ( "city = " + city );
        return city;
    }

    public int getBirthYear() { // getter method for birthyear
        return birthYear;
    }

    Person(String name, String surname){  // constructor overloading means there is 2 options creating object from Person() class. one of them default constructor , one of them with parameter.
        this.name=name;
        this.surname=surname;
    }
    Person(String n,int dogumyili){
        this.name=n;
        this.birthYear=2022-dogumyili;
    }
    public void printName(){
        System.out.println ( name+ " "+ surname );
    }
public void calculateAg(){
        // i want to call Add_1 java daki calculateAge() method iki yol var.
    //1. yol create a method from Add_1 class
    age=ad.calculateAge (  birthYear);
}
//2. yol
public void print(){
        ad.getSum ( 20,30 );
}

}
