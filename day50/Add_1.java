package com.days.day50;

import com.days.day48.Player_2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Add_1 {

    public static void main(String[] args) {
        int a=10;
        int b=10;
        Add_1 ad= new Add_1 ();
        ad.getSum ( a,b );
        Add_1 operation= new Add_1 ();
        operation.getSum ( 40,50 );
        operation.getSum ( 20,30,40 );
       // operation.getSum ();// what if we want to sum of 7 number , should we create a method every single time?
        int[] nums={1,2,3,4,5};
        operation.getSum ( nums );
        operation.getSum1 ( 1,2,3,4,5,6,7 );
        ad.getSum1 ( 10,20 );
        operation.getSum1 ( 2,51,75,242,132 );
        ad.getSum1 ( nums );// on the backend int ... nums2 , so i can just pass an array.

        printStrings ( "Hello", "Java");
    }
                    //this method very important ,Improves reuseability.
    public void getSum1(int ... nums2){ // this is new syntax ,i can pass as many as integer i want. ->  int ... nums2 this is an array on the backend side!
       int sum=0;
        for (int num:nums2){
            sum+=num;


        }
        System.out.println ( "sum = " + sum );
    }

    public static void printStrings(String ... str){
        for(String s:str){
            System.out.println (s);
        }
    }


public String getSum(int b){

        return ""+b;
}
                                                                    //Parameter order is important
    public void getSum(int a, int b){     // as a parameter we can put an object, it doesn't have  to be primitive type.
        System.out.println (a+b);

    }
    public int getSum(int a, int b,int c){
        System.out.println (a+b+c);

        return (a+b+c); // any statement after return will be unreachable
    }

    public void getSum(int[] nums){

    }


    public int calculateAge(int number){
        int age=0;
        LocalDateTime time = LocalDateTime.now();
      int year=  time.getYear ();
        System.out.println ( "year = " + year );
        age=year-number;
        System.out.println ( "age = " + age );
        return age;

    }
}


/*PASS- VALUE NOTES:

Information can be passed to methods as parameter.
Parameters act as variables inside the method.
Parameters are specified after the method name, inside the parentheses.
You can add as many parameters as you want , just separate them with a comma.
When a parameter is passed to the method , it is called an argument.
You can have as many as parameters as you like
When you are working with multiple parameters, the method call must have the same number of arguments as there are parameters,
and the arguments must be passed in the same order.
The void keyword indicates that the method should not return a value.
If you want the method to return a value, you can use a primitive data type (such as int, char,etc.)
Instead of void , and use the return keyword inside the method

You can use any data type for a parameter of a method or a constructor.
This includes primitive data types, such as doubles, floats and integers and reference data types such as objects and arrays.
 */