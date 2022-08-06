package com.days.day23;

public class seconders {
    public static void main(String[] args) {
        //lets get sum of the numbers between 0-100
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum = sum + i; //or sum+=i;
        }
        System.out.println ( "Ilk method = " + sum );

        int ilknum=49;
        int sonnum=120;
        sumNum ( ilknum,sonnum );
        sumNum ( 12,47 );
        sumNum ( 1,74 );
        int sum1=sumNum ( 50,100 );
        int sum2=sumNum ( 200,300 );

        System.out.println (sum1>sum2);
    }

    public static int sumNum(int a,int b ) {
        int sum = 0;
        for (int i=a; i < b; i++) {
            sum+=i; //or sum+=i;
        }
        System.out.println ( "ikinci method= " + sum );

        return sum;


    }





}