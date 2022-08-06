package com.days.day51;
// interviewlerde soruyorlarmis bu sorulari !!!!!
public class Fibonnacci_2_ders {
    public static void main(String[] args) {
        // 0  1  1  2  3  5  8  13  21  34  55        we are adding numbers to each other.


int n=9;
        System.out.println ( "fib(n) = " + fib ( n ) );
fiboNumber ( 10 );
    }
static int fib(int n){
        int f[] = new int [n+2];
        int i;

        f[0]=0;
        f[1]=1;

        for (i=2; i<=n; i++){
            f[i]=f[i-1]+f[i-2];
        }
return f[n];
    }





//hocanin methodu

public static long fiboNumber(int num){
        int a =1;
        int b=1;
        long c =0;

        for(int i=0; i<num-2;i++ ){
            c=a+b;
            a=b;
            b=(int) c;

        }
    System.out.println ( "c = " + c );
        return c;
}
}
