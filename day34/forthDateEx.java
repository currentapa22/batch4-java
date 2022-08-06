package com.days.day34;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class forthDateEx {

    public static void main(String[] args) {

        Date date= new Date();

        System.out.println ( "date = " + date );

        System.out.println ( "date.getTime () = " + date.getTime () ); //Returns the number of milliseconds since
        //January 1 ,1970 00:00:00 GMT represented by this Date object.

        //We talked extra classes related with date.sayfa 22 and example page 23.
        //Page 24, display current time!.

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println( DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm", Locale.ENGLISH).format(ldt));
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
    }
}
