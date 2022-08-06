package com.days.day40;

import java.util.Arrays;

public class dort_ragged_arrays_exercise {
    public static void main(String[] args) {
        //What is the output of the following code?
        //int[ ][ ] array = new int[5][6];
        //int[ ] x = {1, 2};
        //array[0] = x; // array[0] means the first array row in the array.
        //System.out.println("array[0][1] is " + array[0][1]);

    int[][] array=new int [5][6];
    int[] x={1,2};
    array[0]=x;
        System.out.println ( "array[0][1] = " + array[0][1] );
       // System.out.println ( "array[0][1] = " + array[0][2] );//out of boundry.We assigned 2 elements array for row 0.
        System.out.println ( "Arrays.deepToString ( array ) = " + Arrays.deepToString ( array ) );
        //ragged arrayde , arrayler ayni sizede olmak zorunda degil, we can assign two elements arrays
        //[[1, 2], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0]] output!




        int[] y={1,2,3,4,5,6,7,8};   //now we assigned this array , longer than boundries what will happen ?
        array[0]=y;
        System.out.println ( "array[0][3] = " + array[0][3] );// output 4.
        System.out.println ( "Arrays.deepToString ( array ) = " + Arrays.deepToString ( array ) );



    }
}
