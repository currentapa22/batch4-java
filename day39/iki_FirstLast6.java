package com.days.day39;

public class iki_FirstLast6 {
    //codingbatten soru cozuyoruz.
    /*
    Given an array of ints, return true if 6 appears as either the first or last element in the array.
     The array will be length 1 or more.


firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false

//we need to check first and last element if one of them 6 you print true, either false.

     */
    public static void main(String[] args) {
        int[]myint={1,2,6};
        int[]myint2={6,1,2,3};
        int[] myint3={13,6,1,2,3};
        System.out.println ( "firstlast6 ( myint ) = " + firstlast6 ( myint ) );
        System.out.println ( "firstlast6 ( myint2 ) = " + firstlast6 ( myint2 ) );
        System.out.println ( "firstlast6 ( myint3 ) = " + firstlast6 ( myint3 ) );


    }
public static boolean firstlast6(int[]ints){//1.yol
        boolean result;
    if ( ints[0] == 6 || ints[ints.length-1]==6 ) {
        result=true;
    }else{
        result=false;
    }return result;
}
}
