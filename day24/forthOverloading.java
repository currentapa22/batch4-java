package com.days.day24;

public class forthOverloading {
    public static void main(String[] args) {
     //create 3 methods, get the average of the numbers
     //3 arguments types int , 3 arguments types double , 3 arguments types long
     //return the averages of the numbers
     //call from main method
     //also print.
    int num1=23;
    int num2=45;
    int num3=51;
    double num4=241.2;
    double num5=318.3;
    double num6=23.1;
    long num7=21;
    long num8=42;
    long num9=63;
    averageNum ( num1,num2,num3 );
    averageNum ( num4,num5,num6 );
    averageNum ( num7,num8,num9 );


    }
    public static int averageNum(int a , int b , int c ){
        int ortalamaNum=0;
        ortalamaNum=(a+b+c) / 3;
        System.out.println ("integer deger= "+ ortalamaNum);
        return ortalamaNum;
    }

    public static double averageNum(double a ,double b,double c){
        double ortalamaNum=0;
        ortalamaNum=(a+b+c)/3;
        System.out.println ("double deger = "+ortalamaNum );
        return ortalamaNum;

    }
    public static long averageNum(long a, long b ,long c){
        long ortalamaNum;
        ortalamaNum=(a+b+c)/3;
        System.out.println ("long deger= "+ortalamaNum);
        return ortalamaNum;
    }





}
