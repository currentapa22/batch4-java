package com.days.day52.ikinci_ornek;

public class Pizza {

    int pizzaSlices; // it will be personel each member of family will have different pizza
    static int familyPizzaSlices=20;



    public void eating(){ //everytime someone eat pizza we need to decrease slices value.
                         //we can call static variables in non static methods.
        pizzaSlices--;
        familyPizzaSlices--;

    }








}
