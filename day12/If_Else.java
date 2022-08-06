package com.days.day12;

public class If_Else {

    public static void main(String[] args) {

        //TWO WAY IF-ELSE STATEMENTS
        //     if(boolean-expression){
        //  statements for the true case;
        //  }
        //     else{
        //  statements for the false case;
        //}

        //example
        int user = 17;
        if (user<=18){
            System.out.println("User is under 18");
        }
        else{
            System.out.println("User is 18 or older.");
        }


        int radius=10;
        double area ;
        final double PI= 3.14;
        if(radius >=0){
            area= radius * (radius * PI);
            System.out.println("The area for the circle of radius is  " + area);
        }
        else{
            System.out.println("Negative Input");
        }

        double userData=-5.5;
        if(userData<0) {
            System.out.println("Number is negative");
        }
        if(userData==0.0){
            System.out.println("Number is zero now");
        }
        if(userData>0){
                System.out.println("Number is positive");
            }
        }
            //////////////////////////////////










}

































