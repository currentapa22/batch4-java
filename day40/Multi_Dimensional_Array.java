package com.days.day40;

import java.util.Arrays;

public class Multi_Dimensional_Array {
    //Today's session will give us core of the concepts for multi-dimensional arrays.
    //Row=satir
    //Column=sutun

    /*
    double :one double
    double[]:a one-dimensional array of doubles
    double[][]: a two-dimensional array of doubles
    double[][][]: a three-dimensional array of doubles
     */
    //Rectangular Two-dimensional array== an array of arrays      ikiside 2-dimensional arrayin adi.
    //An array of arrays,the elements of which are accessed with multiple integer indexes.
    public static void main(String[] args) {

        double[][]distances= {
                {0, 983, 787, 1375, 967, 1087},
                {983, 0, 214, 1102, 1763, 1723, 1842},
                {787, 214, 0, 888, 1549, 1548, 1628},
                {1375, 1763, 1549, 661, 0, 1426, 1187},
                {967, 1723, 1548, 781, 1426, 0, 239},
                {1087, 1842, 1627, 810, 1187, 239, 0},
        };
        //An element in a two-dimensional array is accessed through a row and column index.
        //The syntax for declaring a two-dimensional array is: Variable Type[][] arrayRefName;
                                                                // int[][]matrix; gibi.
        //[0][1] every single containier for example row-0 column-1 called 'cell'
        int[][] numbers=new int[3][3];
     // in memory this is     0 - 1 - 2
                        // 0- 0 , 0 , 0
                       // 1- 0 , 0 , 0
                       // 2- 0 , 0 , 0
        //how we assign ?
        numbers[0][1]=20;
        System.out.println ( "Arrays.toString (numbers) = " + Arrays.toString ( numbers ) );// won't work we need to use deepToString() method.
        System.out.println ( "Arrays.deepToString ( numbers ) = " + Arrays.deepToString ( numbers ) );//to print multi arrays!!

        //if we turn int to double , default value 0-> 0.0

      int myint=2;
        int[][] testMatrix={
                {10,20,30},
                {11,22,33},
                {44,55,66}
        };
        //i want to change value of 55 to 155
        testMatrix[2][1]=155;
        System.out.println ( "Arrays.deepToString ( testMatrix ) = " + Arrays.deepToString ( testMatrix ) );
        System.out.println ( "testMatrix[2][2] = " + testMatrix[2][2] );

        //when you are creating an array with for loop you need to do 2 loops , 1 for row , 1 for column.

        int[] oneD={1,2,4};
        System.out.println ( "oneD.length = " + oneD.length );

        int[][] twoD= {{10, 20, 30},
                {11,22,33},
        };

        System.out.println ( "twoD.length = " + twoD.length );//returns row numbers- inner
        System.out.println ( "twoD[0].length = " + twoD[0].length );//returns index 0 row length ,3 in this example
        System.out.println ( "twoD[1] = " + twoD[1] );//returns row 1 element numbers.

        //1D arrayler icin
        String[] array=new String[]{"Talha","Ali","Bob"};
        System.out.println (Arrays.toString ( array ));

        String[][] deepArray=new String[][]{{"Talha ,Musa "},{"Ali","Bob"}};
        System.out.println (Arrays.deepToString ( deepArray ));

        //What elements does the array numbers contain after the following code is executed?
        int[][]nums=new int[3][3];
        for(int r =0;r<nums.length;r++){
            for(int c=0;c<nums[r].length;c++){
                numbers[r][c]=r+c;
            }

        }System.out.println ( "Arrays.deepToString ( nums ) = " + Arrays.deepToString ( nums ) );

        int test[][]={{1,2}}; //this will be my 0 index , first row value.






    }


    }

