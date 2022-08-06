package com.days.day40;

import java.util.Arrays;

public class ragged_arrrays {
    public static void main(String[] args) {
        //each row in a two-dimensional array is itself an array.Thus , the rows can have different lengths.
        //An array of this kind is know as a ragged array .how to create?

        int[][] triangleArry={         //triangleArray[0].length is 5 but triangleArray[1].length is 4.
                {1,2,3,4,5},
                {2,3,4,5},
                {3,4,5},
                {4,5},
                {5}
        };


        int[][] ragArray= new int[3][];

        ragArray[0]=new int [3];  //3 element
        ragArray[0][0]=1;
        ragArray[0][1]=2;
        ragArray[0][2]=3;

        ragArray[1]=new int[2];//2 element
        ragArray[1][0]=4;
        ragArray[1][1]=5;


        ragArray[2]=new int [1];//1 element.
        ragArray[2][0]=6;

        //In ragged arrays, inside arrays having a different size of arrays.

        System.out.println ( "Arrays.deepToString ( ragArray ) = " + Arrays.deepToString ( ragArray ) );
        //assign etmedigin degerler null olarak gozukucek! null!=empty.

        //If you don't know the values in a ragged array in advance, but do know the sizes-say, the same as before- you
        //can create a ragged array using the following syntax:

        int[][]triangleArray=new int[5][];

        triangleArray[0]=new int[5];
        triangleArray[1]=new int [4];
        triangleArray[2]=new int [3];
        triangleArray[3]= new int [2];
        triangleArray[4]=new int [1];
        //i assigned all the rows, so i can assign column values now!
        triangleArray[0][3]=50;
        triangleArray[4][0]=45;





    }
}
