package com.days.day36;

import java.util.Locale;

public class dort_Examples {
    public static void main(String[] args) {
        //su ana kadar gordugumuz methodlar
        //lenght, chartAt, substring, indexof, lastindexof,contains, concat,lowercase-uppercase

        String news="Manchester City is the champion of the premier league";

        System.out.println ( "news.length () = " + news.length () );
        System.out.println ( "news.charAt ( news.length ()-1 ) = " + news.charAt ( news.length () - 1 ) );
        System.out.println ( "news.contains ( \"Bayern Munich\" ) = " + news.contains ( "Bayern Munich" ) );//if there is bayern munich or not
        System.out.println ( "news.contains ( \"premier\" ) = " + news.contains ( "premier" ) );//true.
        System.out.println ( "news.indexOf ( \"premier\" ) = " + news.indexOf ( "premier" ) );//39
        System.out.println ( "news.substring (39  ) = " + news.substring ( 39 ) );//premier league expected result.
        System.out.println ( "news.substring ( 10,36 ) = " + news.substring ( 10, 36 ) );
        System.out.println ( "news.toLowerCase() = " + news.toLowerCase () );
        System.out.println ( "news.toUpperCase () = " + news.toUpperCase () );

        String champion="Manchester City";

        String newCreated=news.concat ( champion );

        System.out.println ( "newCreated.indexOf ( champion ) = " + newCreated.indexOf ( champion ) );

    //trim(); method
        //String trim() method accepts no parameter.
        //String trim () method returns string with whitespaces removed from both ends of it.(not between words)
        String text2="     HELLO         Java       Hello ";
        String mystr="           Hello     World!          ";
        String trim= mystr.trim ();
        System.out.println ( trim ); // white spaces are removed.
        System.out.println ( "mystr = " + mystr );

       // mystr.replace (first target, replacement  ) , replace() method will switch replacement with target
        System.out.println ( "mystr.replace(\"Hello\", \"Hi\") = " + mystr.replace ( "Hello", "Hi" ) );

        System.out.println ( "mystr = " + mystr );// variable still same!

        System.out.println ( "mystr.equals ( text2 ) = " + mystr.equals ( text2 ) );//expecting false!

        System.out.println ( "mystr.equalsIgnoreCase ( text2 ) = " + mystr.equalsIgnoreCase ( text2 ) );


    }
}
