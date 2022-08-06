package com.days.day30;

public class CakeTest {
    public static void main(String[] args) {
        cake cake1= new cake();
        cake1.isChoclate=true;
        cake1.slices=10;
        cake1.isEgg=true;
        cake1.weight=2;
        cake1.cakeMaker="Ahmet";

        //2.object
        cake cake2=new cake();
        cake2.cakeMaker="Murat";
        cake2.slices=20;
        cake2.weight=1;
        cake2.isEgg=false;
        cake2.isChoclate=true;

        cake1.eating (); // -1 slice  9 slices
        cake1.eating ();//-1 slice 8 slices

        cake2.eating ();//-1 slice 19 slices
    }
}
