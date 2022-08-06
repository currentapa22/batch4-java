package com.days.day22;

public class altinciders {
    public static void main(String[] args) {
        //if i want to get sum between 1-100

       int sum=0;
        for( int i =0; i<=100; i++){

            sum+=i;//sum= sum+i;

        }
        System.out.println ( "sum = " +sum);
        int startingPoint=23;
        int endingPoint=47;
        System.out.println (getSum(startingPoint,endingPoint));//what if we want to get values from user?

    }

    //lets create a method to get sum

    public static int getSum(int a, int b){
    int total=0;
        for(int i=a; i <=b; i++){
            total +=i;
    }
        System.out.println ( "total = " + total );
        return total;

    }

    //ONEMLI ORNEKLER BUNLAR!!!!!!!!!!!!!!!!!!!!!!
    //HOCANIN COZUMUNE BAKALIM


















}
