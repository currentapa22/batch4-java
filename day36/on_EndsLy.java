package com.days.day36;

public class on_EndsLy {
    public static void main(String[] args) {
        /*
        Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
         */

  String str="oddly";

        System.out.println ( "str.substring ( str.length ()-2 ) = " + str.substring ( str.length () - 2 ) );
        String subs = str.substring ( str.length () - 2 );
       boolean result=false;
        if(subs.equals ( "ly" )){
            result=true;
            System.out.println (true);
        }else{
            System.out.println (false);
        }
        System.out.println ( "result = " + result );


    }
}
