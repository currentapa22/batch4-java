package com.days.day41;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_Review_Week11 {
    public static void main(String[] args) {

       // String[] test={}; //only this is not a coding block.This is for keeping our values.
       // String[] test={"1,2,34",6};//uygun data vermen gerek.

        String[] arabalar={"Volvo","BMW","Ford","Mazda"};
        System.out.println ( "arabalar[3] = " + arabalar[3] );
        //index number starts 0.
        arabalar[3]="Mercedes";
        System.out.println ( "arabalar[3] = " + arabalar[3] );

        String[] oldCars={"ABC","Ford","DEF"};
        arabalar=oldCars;//it didn't give an error. //We are not updating the data, we are changing the address reference! heap and stack memory gibi dusun
        //baska bir seye assign edince , eski data artik garbage memoryinin isi .

        System.out.println ( "Arrays.toString (arabalar) = " + Arrays.toString ( arabalar ) );


        System.out.println ("////////////////");

        //short key "itar" gives this code!.

        for (int i = 0; i < oldCars.length; i++) {
            String oldCar = oldCars[i];

        }

        //iter keyword  // will create auto for each loop for given data container.
        for (String s : arabalar) {

        }
    int arr[]={50,60,70,80};
        for(int i =0;i<arr.length;i++){
            System.out.println (arr[i]);
        }





    }


//return Arrays in methods
    public static int[] testArray(int[] numbers){
        int[] test={1,2,3};

        return test ;
       // return {1,2,3}; DO NOT return value statement without complete declaration and initializing.
    }


}
