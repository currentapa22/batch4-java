package com.days.day24;

public class sixthFindMin {
    public static void main(String[] args) {
        find ( 100,200 );
        find ( 500,300 );




// return(a<=b)? a : b;

    }
    //create 4 methods name of min
    //get 2 argument int ,double, long ,float
    //return the smaller one
    //call from main method
    public static int max(int a ,int b){
        int num;
        if(a>b){
            num=a;
        }else{
            num=b;
        }
        System.out.println (b+"is the bigger number");
        return num;
    }

    public static void find(int a , int b ) {
        min ( a, b );
        max ( a, b );
    }

    public static long min(long a,long b){
        long result=0;
        if(a<b){
            result=a;
        }else{
            result=b;
        }
        return result;

    }

public static int min(int a,int b){
        int result=0;
        if(a<b){
            result=a;
        }else{
            result=b;
        }
    return result;
    }




}








