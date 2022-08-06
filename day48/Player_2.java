package com.days.day48;
//before starting encapsulation lets remember something
public class Player_2 {
String name; //instance variable      called also properties of the class or fields
                                        //if they don't have static before them ,it belongs to object and will change for every object.
int age;// instance variable
String club; // instance variable


    Player_2(String nm){
        name=nm;
        System.out.println ("Obj created");
    //    age=20; //if we put in constructor means all object we have created and will create have age of 20.
        club= "Chelsea";
    }

    public void running(){

        System.out.println (name+" is running.");

    }

public void playing(){
    System.out.println (name+ " is playing ");
}

public void info(){
    System.out.println ( "name = " + name );
    System.out.println ( "age = " + age );
    System.out.println ( "club = " + club );
}





}
