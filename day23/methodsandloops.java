package com.days.day23;

public class methodsandloops {

    public static void main(String[] args) {
      //print the even numbers between 0-100
   int i=0;
   int b=367;
   double d =20.5;
   evenChecker ( b );
   evenChecker ( 12 );
    evenChecker ( (int)d ); //explicitly casting
    evenTrue ( 22 );
  // for(i=0;i<=100;i++){
    //   if(i %2==0){
        //   System.out.println (i+"is even");
       }
    //lets create a method with 1 parameter(int) print whether this number is even or not.
    public static void evenChecker(int a){
        if(a %2==0){
            System.out.println (a+" is even number");
        }else
            System.out.println (a+" is not even number");
        }




    //if number is even number will return a boolean value.-true else false.
    public static boolean evenTrue(int a){    //bunu iyi anlaman gerek !!!!!!!
       boolean result=true; //boolean methodlarda once bir boolean value olusturmak lazim.burada yaptigimiz gibi
        if(a %2==0){
            result=true;
        }else
            result=false;
        System.out.println (result);
        return result;
    }
} //1:30:45


