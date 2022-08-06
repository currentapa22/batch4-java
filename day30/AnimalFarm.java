package com.days.day30;

public class AnimalFarm {

    String breed;
    String color;
    int weight;
    int feetnumber;
    boolean hasWing;
    boolean isRunning;
    static int animalNumber;
    AnimalFarm(){     //constructor is  being executed when object is created.This AnimalFarm(){} is already here if we dont put but we just dont see it.
                    //when we are creating an object we are calling(invoking) the constructor.
    animalNumber++;
        System.out.println ("animal number is " + animalNumber);
    }


    static String location="the zoo";

public void infoAnimal(){
    System.out.println (breed+ " have "+ color+ " color, also has "+feetnumber+" feet ,weight is approximately"+weight );


}
public void destination(){

    System.out.println ("This animal is goint to "+ location);
}

public void moving(){
    if(hasWing){
        System.out.println (breed+" is flying");
    }else if(isRunning){
        System.out.println (breed+" is running");
    }else{
        System.out.println (breed+ " walking");
    }
}
}
