package com.days.day23;

public class ucuncuders {

    public static void main(String[] args) {
        //lets create a method get 3 double numbers and try to find the biggest number, print and return it.
        double bir=3.0;
        double iki=9.0;
        double uc=7.0;
        uclunumber ( bir,iki,uc );


    }
    public static double uclunumber(double a, double b, double c){
       double biggest=0;
        if(a>b&&a>c){
            System.out.println ("a is the biggest");
            biggest=a;
        } else if ( b>a&& b>c ) {
            System.out.println ("b is the biggest");
            biggest=b;
        }else if(c>a &&c>b){
            System.out.println ("c is the biggest");
            biggest=c;
        }
        return biggest;

    }










}
