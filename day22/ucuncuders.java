package com.days.day22;

public class ucuncuders {

    public static void main(String[] args) {
    int num=30;
    int number=50;
    PrintSum ( 10, 20 );
  int result=  returnSum ( num,number );//value is now 80,
        // we can assign this value to another variable!
        System.out.println ( "integere baglanmis return variable= " + result );
    }

    public static void PrintSum(int a, int b) {
        int total = a + b;
        System.out.println ( a + b );
        System.out.println ( "total = " + total );

    }

    public static int returnSum(int a, int b) { //when a method doesnt return any value we put void
        int total = a + b;//30+50=80           //but when methods return a value, we put that value type in to method description
        //total is 80
        return total;
    }


}
