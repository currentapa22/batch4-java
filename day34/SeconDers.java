package com.days.day34;

import java.util.Random;
import java.util.Scanner;

//slayttaki 11.sayfadaki ornegi cozuyoruz.
public class SeconDers {
    public static void main(String[] args) {
pcGuessGame ();
    }


public static void pcGuessGame(){

        Scanner scanner= new Scanner(System.in);
        Random random= new Random();

    System.out.println ("Please enter min(included) value: ");
    int low=scanner.nextInt ();
    int high;
    do {
        System.out.println ( "Please ener max( included) value: " );
        high = scanner.nextInt () + 1;

    if(high<low) {
        System.out.println ("Wrong Value!! Please type a max value bigger then low value!!");

    }
    }while(high<low);

    //hocanin cozumu !
    /*
    do{
        System.out.println ("Please enter max(inc) value:  ");
        high=scanner.nextInt ()+1;
        if ( high < low ) {
            System.out.println ("Wrong value !! Please type a maax value bigger then low value!!");
        }else{
            break;
        }
    }while(true);
*/
    int luckyNumber= random.nextInt (high-low)+ low;

    int counter=0;
    int randomValue;
    scanner.close();

    do{

        randomValue=random.nextInt (high-low)+ low;
        counter++;
        if(counter==6){
            System.out.println ("You FAILED PC boy!!"+ "You didn't guess the number in the 5 times!");
            System.out.println ("Lucky number was "+ luckyNumber);
            System.exit ( 0 );//Stops the execution.It will stop JVM stop!
        }
        System.out.println ("Next number: " + randomValue);



    }while(randomValue != luckyNumber);

    System.out.println ("Bravoo you got the lucky number in "+ counter+ " times.");






    }





}
