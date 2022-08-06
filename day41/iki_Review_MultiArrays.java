package com.days.day41;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class iki_Review_MultiArrays {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println ( Arrays.deepToString ( matrix ) ); // this is how we print arrays.

        System.out.println ( Arrays.deepToString ( assign2DarrayRandomly ( 10 ) ) );
    }
//lets create a method that returns 2D Arrays.

    public static int[][] assign2DarrayRandomly(int maxNumber) {
        Random random = new Random ();
        int[][] array = new int[5][5];


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {



                array[i][j] = random.nextInt ( maxNumber + 1 );


            }

        }
            return array;
    }
    //1.36.09 da kaldim.
}



