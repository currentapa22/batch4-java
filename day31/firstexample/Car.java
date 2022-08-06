//class icinde class olusturduk ,Hic yaygin degil ama hoca gosterdi!. Ilk ders!

package com.days.day31.firstexample;

public class Car {

    int year;
    String color;

    public void moving(){

        System.out.println ("car is moving");
    }

public class Electricty{ // inner class

        boolean isElectric;
        int price;

        public static void main(String[] args) {
            Car myCar= new Car();//creating an object from outer class.
            myCar.color="Black";
            myCar.moving ();
            Electricty electric = myCar.new Electricty ();//we had to use first object to reach .
            //via outer class object i can create
            // an object in inner class.
            electric.price=2000;


        }

    public void moving() {

        System.out.println ("bought a new electric car");
    }

    }





}
