package com.days.day38;

public class alti_ReturnArray {
    public static void main(String[] args) {
        String[] nbaClubs = {"Chicago Bulls", "Miami Heat", "Golden State Warriors", "Orlando Magic" };
        for (String club : nbaClubs) {
            System.out.println ( "club = " + club );
        }
        System.out.println ( "nbaClubs[0].substring ( 0,7 ) = " + nbaClubs[0].substring ( 0, 7 ) );
        System.out.println ( "nbaClubs[1].toUpperCase () = " + nbaClubs[1].toUpperCase () );

      String[] someThing=  theFirst3Letter ( nbaClubs );//keeps an array in it so  we can assign this line to an array.
        System.out.println ( "someThing[0] = " + someThing[0] );//Chi
        System.out.println ( "someThing[1] = " + someThing[1] );//Mia

        String[]fruits={"orange","melon","cherry","strawberry","lemon","apple"};
       String[] meyveler= theFirst3Letter ( fruits );
        System.out.println ( "meyveler[0] = " + meyveler[0] );
        System.out.println ( "meyveler[1] = " + meyveler[1] );
        System.out.println ( "meyveler[2] = " + meyveler[2] );
        System.out.println ( "meyveler[3] = " + meyveler[3] );
        System.out.println ( "meyveler[4] = " + meyveler[4] );
        System.out.println ( "meyveler[5] = " + meyveler[5] );


    }
//how to return an array from a method ?
//we will get a string array and will return a new string array with each of 3 letter.

    public static String[] theFirst3Letter(String[] arr) {
        String[] first3 = new String[arr.length];//Creating new array,because we want to put first 3 letter of every element.
        for (int i = 0; i < arr.length; i++) {
          first3[i]= arr[i].substring ( 0, 3 ) ;//reaches firts 3 letter of each element.and assigning it to first3 also, arr==firts3.
        }
        return first3;//returns string array.It can be save in string array in main method to call the method!.
    }


}
