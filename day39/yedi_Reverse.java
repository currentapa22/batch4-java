package com.days.day39;

import java.util.Arrays;

public class yedi_Reverse {

    /*
    Given an array of ints length, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
     */

    public static void main(String[] args) {

     //   int[]nums={1,2,3,4,5};
        int[]nums={1,213,532,531221,775,43,5976,543};
        //         5,4,3,2,1 new array
        int[] newArray=new int[nums.length];
        int index= nums.length-1;//5
        for(int i=0;i< nums.length;i++){
            newArray[i]=nums[index];

            index--;

        }
        System.out.println ( "Arrays.toString (nums) = " + Arrays.toString ( nums ) );
        System.out.println ( "Arrays.toString ( newArray ) = " + Arrays.toString ( newArray ) );


    }




}