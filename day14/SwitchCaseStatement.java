package com.days.day14;

import jdk.swing.interop.SwingInterOpUtils;

public class SwitchCaseStatement {

    public static void main(String[] args) {
    if(10>5){
        System.out.println (".......");
    }

    //on switch case , we will check the value whether equal or not
    //

    int dayNumber= 3;
    switch (dayNumber){  //we are checking daynumber values, if the value matched ,matched one would execute.
        case 1:
            System.out.println ("today is monday");//if the values matched with this, this line would run.
            break;
        case 2:
            System.out.println ("today is tuesday");
            break;
        case 3:
            System.out.println ("Today is wednesday");
            break; //burada break; vardi , kaldirdik tekrar bakiyoruz aradaki fark ne olacak diye!
        case 4:   //yukaridaki break i kaldirinca hem ustteki lane yi hem de sonraki break 'e kadar olan kismi compile edicek.!
            System.out.println ("Today is thursday");
            break;
        case 5:  //use : not ;.
            System.out.println ("today is friday");
            break;
        case 6:
            System.out.println ("Today is saturday");
            break;
        case 7:
            System.out.println ("Today is sunday");
            break;
        default:
            System.out.println ("none of the values matched.");
//everything between the {}!!!!
            //also case numbers are not in order, you can give the random.Ayni numarayi farkli caseler icin kullanamazsin.!

    }
        System.out.println ("after switch");

        System.out.println ("\n");
        System.out.println ("\n");
        System.out.println ("\n");

        int gun=7;
        String dayType="";

        switch (gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
         dayType="weekdays";
         break;
            case 6:
            case 7:
         dayType="weekend";
        }
        System.out.println ("Bu gun "+dayType);



        String day="";
    // we can use switch in if.
        if(dayNumber>0 && dayNumber<8){
            switch (dayNumber){
                case 1:
                    day ="Monday";
                    break;
                case 2:
                    day="Tuesday";
                    break;
                case 3:
                    day="Wednesday";
                    break;
                case 4:
                    day="Thursday";
                    break;
                default:
                    System.out.println ("no matching");
            }

            System.out.println ( "day = " + day );

        }


        //mola vakti!

        dayNumber=9;
    switch (dayNumber){
        case 1: case 2 : case 3 : case 4: case 5:
            System.out.println ("Weekdays");
            break;
        case 6: case 7:
            System.out.println ("Happy Weekend");
            break;
        default:
            System.out.println ("impossible data");

    }

    dayNumber=4;
    switch (dayNumber) {
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println ( "happy thursday" );
            break;
        default:
            System.out.println ("different data");
    }


    char grade= 'B';

    switch (grade){
        case 'E':
            System.out.println ("fail");
            break;

        case 'D':
            System.out.println ("fail");
            break;

        case 'C':
            System.out.println ("fail");
            break;
        case 'B':
            System.out.println ("fail");
            break;
        case 'A':
            System.out.println ("success");

        break;
        default:
            System.out.println ("unknown data");
    }


    //kisa yoldan

        char gradee= 'Z';     //CDE FAIL AB SUCCESS // WORKS!!!!!!
        boolean resultt = true;
        switch (gradee) {
            case 'E': case 'D' : case 'C' :
                System.out.println ( "fail" );
                resultt = false;
                break;
            case 'B': case 'A':
                System.out.println ("success!!");
                resultt = true;
                break;
            default:
                System.out.println ( "unknown data" );
        }

        //LETS MAKE AN EXAMPLE WITH STRING

        String capital="Paris";
        String country ="";
        //london ankara roma madrid paris    //case sensitive.Be careful about it.
        switch(capital){
            case "Ankara":
                country="Turkiye";
                System.out.println ("Ankara " +country +" 'nin baskentidir");
                break;
            case "Roma":
                country="Italya";
                System.out.println ("Roma  "+country +" 'nin baskentidir");
                break;
            case "Madrid":
                country="Ispanya";
                System.out.println ("Madrid  "+country +" 'nin baskentidir");
                break;
            case "Paris":
                country="Fransa";
                System.out.println ("Paris  "+country +" 'nin baskentidir");
                break;
            case "London":
                country="Ingiltere";
                System.out.println ("You've found the one and only capital London!");
            break;

        }
        System.out.println (capital + " is capital of "+ country);


        System.out.println ("////////////////////////////" );


        int monthRow= 12;
        String ay= "";
        switch (monthRow) {
            case 1:
                ay = "Ocak 1.";
                break;
            case 2:
                ay = "Subat 2.";
                break;
            case 3:
                ay = "Mart 3.";
                break;
            case 4:
                ay = "Nisan 4.";
                break;
            case 5:
                ay = "Mayis 5.";
                break;
            case 6:
                ay = "Haziran 6.";
                break;
            case 7:
                ay = "Temmuz 7.";
                break;
            case 8:
                ay = "Agustos 8.";
                break;
            case 9:
                ay = "Eylul 9.";
                break;
            case 10:
                ay = "Ekim 10.";
                break;
            case 11:
                ay = "Kasim 11.";
                break;
            case 12:
                ay = "Aralik 12.";
                break;
        }
                System.out.println ("Aylardan " +ay+" 'dir");

        switch (monthRow){
            case 11:
                case 12:
                    case 2:
                        case 1:
                            System.out.println ("season is winter");
                            break;
            case 3:
                case 4:
                    case 5:
                System.out.println ("season is spring");
                break;
            default :
                System.out.println ("not matching with any data");
        }

        //lets try with boolean

         //boolean b = false;
        // switch (b){                       //incompatible types for switch cases
                                            //suitable for only byte, short, char,integer , string .
























    }
}
