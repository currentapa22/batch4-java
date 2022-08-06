package com.days.day41;

import java.util.Arrays;

public class dort_ReviewPractice1 {
    public static void main(String[] args) {

        /*
        Create a method;
        -request an array
        -request a value of array
        -then return index of the value!!

        Sample: int []a={"Honda","BMW","KIA"};

        arrayIndexFinder(a,"Kia")--> return ->Your "KIA" value's index position is "2"!!

         */
        String[] a={"Honda","BMW","KIA","KIA"};
        System.out.println ( "Arrays.binarySearch (a,\"KIA\") = " + Arrays.binarySearch ( a, "KIA" ) );

arrayIndexFinder ( a,"KIA" ); //WORKS WELL!!!++

    }

public static int arrayIndexFinder(String[] myarray,String key){
if(myarray==null){
    System.out.println ("Provide array is NULL!!");
    return -1;
}
int index=0;
while(index<myarray.length){
    if ( myarray[index].equalsIgnoreCase ( key )){
        index++;
        while(index<myarray.length){

            if ( myarray[index].equalsIgnoreCase ( key )){
                System.out.println ("BRO! You have more than 1 key!");
                return -1;
            }

        }

        System.out.println ("Your"+key+"value's index position is "+ index+" !");
        return index;
    }
    index++;
}
    System.out.println ("The key "+key+" does not exist in given array!!!");
    return -1;



}




}
