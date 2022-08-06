package com.days.day13;

public class NestedIf {

    public static void main(String[] args) {

                int num =78;
                //lets print num can divided to 6. means 2-3 divided.
                //while checking this req , also print if number is even and also not multiply by3.
                if (num %2==0) {
                    System.out.println("Number is EVEN!!");
                    if (num % 3 == 0) {
                        System.out.println("Number can divided by 6!");
                    } else {
                        System.out.println("Number is Not divided by 6!");
                    }
                }else  {
                    System.out.println("Number is ODD");
                }

                int a =10;
                if (a>=8) {
                    System.out.println ( "First condition is true!" );
                    if ( a < 15 ) {
                        System.out.println ( "Second condition is true as well!" );
                    }if ( a < 12 ) {
                            System.out.println ( "Third condition is true " );
                        }

                }
                else{
                        System.out.println ("All of them is wrong!");
                    }



    String not="";
    int score=78;
                if(score>=90)
                    not="a";
                else if(score >=80)
                    not="b";
                else if(score>=60)
                    not ="c";
                else if(score<=49)
                    System.out.println ("fail");
        System.out.println ("Your score is "+ not);



















            }



    }

















































































