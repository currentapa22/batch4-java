package com.days.day39;

public class dort_makePi {
    /*

Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.


makePi() → [3, 1, 4]
     */
    public static void main(String[] args) {
        int[]myint=makePi ();
        System.out.println ( "myint[0] = " + myint[0] );
        System.out.println ( "myint[1] = " + myint[1] );
        System.out.println ( "myint[2] = " + myint[2] );
    }

public static int[] makePi(){ // if we want to return integer array  we put[] after return type.
        int[]pi={3,1,4};
        return pi;


}



}
