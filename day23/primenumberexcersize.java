package com.days.day23;

public class primenumberexcersize {

    public static void main(String[] args) {

   primeNumberOrNot ( 120 );
   primeNumberOrNot ( 19 );
   primeNumberOrNot ( 30 );
   primeNumberOrNot ( 7 );
   primeNumberOrNot ( 63 );


    }
 public static void primeNumberOrNot(int num){

        int count=0;
        for(int i=2;i<num; i ++){

            if(num %i !=0){
                count++;
            }
        }
     System.out.println ( "count = " + count );
        if(count == num-2){
            System.out.println (num+" prime numer");
        }else{
            System.out.println (num+" Not prime number");
        }
 }




}
