package com.days.day30;

public class cake {
    String cakeMaker;
    int slices;
    boolean isChoclate;
    boolean isEgg;
    int weight;
    static int  cakeSlicess=10;

    public void eating(){
        slices--;//belongs to object // Will change up to the object
        System.out.println (cakeMaker+ " 's slices = " + slices );
        cakeSlicess--;// belongs to class! // will not change up to the object.
        System.out.println ( "cakeSlicess = " + cakeSlicess );
        //Ahmet and murat are both were getting slices from cakeSlicess(class variable)(common variable)
        /*
        Ahmet 's slices = 9, its personel.
        cakeSlicess = 9 !! //static , belongs to class ,its common
        Ahmet 's slices = 8, its personel.
        cakeSlicess = 8 // static . belongs to class, its common
        Murat 's slices = 19 , its personal.
        cakeSlicess = 7  //static , belongs to class,its common
         */

    }
}
//methods are class's behaviour .