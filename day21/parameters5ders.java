package com.days.day21;

public class parameters5ders {
    public static void main(String[] args) {
        //we will create the method inside of the class but outside of the main method!
        // we will use public static void
        //if we want to pass values to variable from outside, we can create variables in method parenthesis!
    myMethod ( 49 );
    myMethod ( 24 );
    buyukSayi ( 42,1 );
    buyukSayi ( 10,99 );
   int number= findBiggerNumber ( 50,60 ); // a ve b zaten int olduklari icin , biz sonradan bunu int variablesine baglayabiliriz.
       System.out.println ( "number = " + number );
    }

    //you will create a method there will 1 integer parameter
    // inside the body you will print this integer value
    //you will call this method 2 times from main method

    public static void myMethod(int bir){
        System.out.println ("Bu parametere verdigim deger " + bir);



    }
    public static void buyukSayi(int num, int number){ //peki sayilardan buyuk olani println yaptirmak istiyorsak ??
        if(num>number){
            System.out.println (num+"is bigger");
        }else{
            System.out.println (number+ "is bigger");
        }

    }

    //how we can make methods will return a value ? if we want to reach bigger number?
        public static int findBiggerNumber(int a , int b ){
        int biggerNumber;
        if(a>b){
            biggerNumber=a;
        }else{
            biggerNumber=b;
        }
            System.out.println ( "biggerNumber = " + biggerNumber );
            return biggerNumber; //because of we put int instead of void, this method will return int value.
    }
}
