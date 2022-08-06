package com.days.day35;

public class SubString {
    //There is a another method we can use to find letters.
    public static void main(String[] args) {
        String city="Oslo";
        System.out.println ( "city.length () = " + city.length () );
        System.out.println ( "city.charAt ( 0 ) = " + city.charAt ( 0 ) );//first letter

        /*
        substring(first index(included), last index(excluded)); is a method to get certain letters between indexes.
         */

        System.out.println ( "city.substring ( 1,3 ) = " + city.substring ( 1, 3 ) ); //sl
        System.out.println ( "city.substring ( 1,3 ) = " + city.substring ( 0, 2 ) );//Os

        String nba="Toronto Raptors";
        System.out.println ( "nba.substring ( 8 ) = " + nba.substring ( 8 ) );// it will give Raptors(index num 8 till ends)

        System.out.println ( "nba.length () = " + nba.length () );
        System.out.println ( "nba.substring ( 8,15 ) = " + nba.substring ( 8, 15 ) );//15 isn't included.

        String team="Fenerbahce";
        System.out.println ( "team.length () = " + team.length () );
        System.out.println ( "team.substring ( 5,team.length ()) = " + team.substring ( 5, team.length ()  ) );

        //bu son dersti bugunun. ogrendigimiz seyler lenght() , charAt() , substring() methods.
        //These 3 methods is enough for us to reverse a string!!!!


    }

}
