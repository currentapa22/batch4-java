package com.days.day22;

public class ders8 {
    public static void main(String[] args) {


        calculationbyWhileLoop (10,20);
    }



    public static int calculationbyWhileLoop(int a,int b){
    int sum=0;
        while(a<b){
            sum+=a;
            a++;
        }
        System.out.println (sum);
        return sum; //return sum eklemek istiyorsan , yukaridaki void i --> int e donusturmen gerek.



    }



}
