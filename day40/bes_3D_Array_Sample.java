package com.days.day40;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bes_3D_Array_Sample {
    //we will not use this at work but we just need to understand concept.
    public static void main(String[] args) {
        int[][][] array3D={
                {
                        {1,-2,3},
                        {2,3,4},
                },
                {
                        {-4,-5,6,9},
                        {1},
                        {2,3}
                }
        };
        System.out.println ("3d Array: "+ Arrays.deepToString ( array3D ) );
        //3d Array: [[[1, -2, 3], [2, 3, 4]], [[-4, -5, 6, 9], [1], [2, 3]]]

    }










}
