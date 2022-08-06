package com.days.day12;

import java.util.Scanner;

import static java.lang.Math.PI;

public class IfStatement {

    public static void main(String[] args) {
   //if(boolean-expression){     //this is the syntax of if statement.
        //  statement(s);                                      //ifden sonraki parantez in boolean ifadesi olmasi gerek.
        // }
    //if is pre-defined syntax in java.
      int number = 1;

      System.out.println("Before IF");

      if(number>0) { // IF exp. is true , then java can run inside curly bracets.

          System.out.println("INSIDE IF");
          System.out.println("Number " +number +" is a positive number ! ");
                                                                //statements
    }
      System.out.println("End of IF");


      // lets change the number with -1
        int numberr = -1;

        System.out.println("Before IF ");

        if( numberr > 0) { // IF exp. is true , then java can run inside curly bracets.

            System.out.println("INSIDE IF");
            System.out.println("Number " +numberr +" is a positive number ! ");
            //statements
        }
        System.out.println("End of IF");

        //if statement ile aslinda biz lane break yapiyoruz.Bazi laneleri skip ediyoruz ilk defa!

        ///lets make another example.
        System.out.println("Before IF");
        int numberInt = 100;
        System.out.println("Before IF");
        double numberDob= numberInt;
        if(numberInt==numberDob){ // If either operand is of type double, the other is converted to double.
            System.out.println("numberInt ==numberDob are equal");

        }
        System.out.println("End of IF");
        System.out.println(numberInt);


        System.out.println("//////////////////////    \n"); //bir satir bosluk birakmak icin

        System.out.println("Before IF");
        if(1==1)
            System.out.println("Inside IF");
        System.out.println("????");


        System.out.println("End of IF"); //curly bracets kullanmadan da yapilabilir
                                        // the block braces can be omitted if they enclose a single statement.

        System.out.println("//////////////////////    \n");// false if condition example.

        System.out.println("Before IF");
        if(1==0)
            System.out.println("1==0 demek");   //!!!!if the if statements is false, just first line after the statement we wouldn't see on the screen!!!!! not the rest all.
        System.out.println("1==0????");//will print


        System.out.println("ENd of IF");//will print.


        //new example
        double hours=39,salary=3500;

        if(hours> 38) {
            salary = salary * 1.5; // salary *=1.5;

        }
        System.out.println("salary = " + salary);

        //new example.
        int y=5;
        int x;
        if(y>0){
             x=1;
            System.out.println("y is greater than 0 so x= "+ x);

        }

        int score = 95;
        int maas= 2000;
        double artis= 0.03;
        if(score>90){
            maas+=maas*artis;
            System.out.println(" Zamli maas = " + maas);

        }

        int radius=-1;
        double area= radius*radius*PI;
        if(radius>0){
            System.out.println ("The are for the circle of radius"+radius+"is "+ area);
        }
        else{
            System.out.println ("Negative input!");
        }

        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Input Number:" );
        int input =scanner.nextInt ();
        if ( input > 0 ) {
            System.out.println ( "Number is positive!" );
        }
        if(input==0){
            System.out.println ("Number is zero!");
        }
        else{
            System.out.println ("Number is negative!");
        }

        int sayi=5;
        if(sayi %2==0){
            System.out.println ("This is an even number!");

        }
        else{
            System.out.println ( "This is an odd number!" );
        }









    }
















    }

