package com.days.day38;

public class uc_Arrays {
    public static void main(String[] args) {

        String player="Ronaldo"; // if we want to store these 3 values, we have to create an String.
        String player1="Benzema";
        String player2="Pele";//what if we need to create 100 of these strings.

        int number=10;
        int number2=20;
        int number3=30;

        //We need a different kind of structure to store our values.
        //This where arrays come in play.
        //In arrays, we can store many data with the same type.
        //There are more than one way to create arrays, lets start with one of them.

        //Syntax;

        //String[] players = new String[(int number)];      int number olan yere literal bir sayi gelecek.Bu bize element sayisini yani array length (array elemen sayisini) verir.

        String[] players = new String[5]; // uzunlugunu 5 deger olarak belirledik.Bu 5 degere bir sey assign etmesen bile there is a default value for each of them.
        System.out.println ( "players[0] = " + players[0] );//null.Eventhough we didn't assign a value , null is default value.
        /*how we assign these 5 elements to this array:
        index starts from 0, first element index number is 0 and 1 2 3 4.

         */
        players[0]="Lewandoski";
        players[1]="Ronaldo";// players[1]=2; yazamazsin ,variable type ile data type compilable olmasi gerek..
        players[2]="Hazard";
        players[3]="Lukaku";
        players[4]="Moller";

        System.out.println ( "players[0] = " + players[0] );

        /*--------------------------------------------------------------------------------------------------------------------------*/
       // int[] numbers= new int[5]; we can do like this or
        int[] numbers={1,2,3,4,5,6,7,8,9,10};//1.We created an array, 2. We stored integer values in this array. ,
        // 3.Bu yolla array olusturdugunda otomatik olarak :a.We assign each values to elements, b.We declared the lenght of the array.!! (daha pratik gibi.)

        System.out.println ( "numbers[1] = " + numbers[1] );
        //if i want to change to this value;
        numbers[1]=10;
        System.out.println ( "numbers[1] = " + numbers[1] );

        //how to reach length of this array?

        System.out.println ( "numbers.length = " + numbers.length );
        System.out.println ( "players.length = " + players.length );


    }
}
