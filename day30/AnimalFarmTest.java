package com.days.day30;

public class AnimalFarmTest {
    public static void main(String[] args) {


        AnimalFarm animal1 = new AnimalFarm ();
        animal1.breed = "Bird";
        animal1.color="Blue";
        animal1.weight=22;
        animal1.feetnumber=2;
        animal1.hasWing=true;
        animal1.isRunning=false;

        AnimalFarm animal2= new AnimalFarm ();
        animal2.breed="Cat";
        animal2.color="White";
        animal2.weight=40;
        animal2.feetnumber=4;
        animal2.hasWing=false;
        animal2.isRunning=true;

        animal1.infoAnimal ();
        animal1.destination ();
        animal1.moving ();

        animal2.infoAnimal ();
        animal2.destination ();
        animal2.moving();

    }
}