package com.days.day39;

import java.util.Arrays;

public class on_Arrays_Devam {
    public static void main(String[] args) {
        int[]nums={10,20,30,40,50};
        System.out.println ( "nums[0] = " + nums[0] );
        String[]countries={"Spain","Germany","Holland","Polland","Greece"};

        int numberOne=nums[0];
        String countryOne=countries[0];
        System.out.println ( "numberOne = " + numberOne );
        System.out.println ( "countryOne = " + countryOne );
        System.out.println ( "Arrays.toString (nums) = " + Arrays.toString ( nums ) );//it converts to string.
        System.out.println ( "Arrays.toString ( countries ) = " + Arrays.toString ( countries ) );
        System.out.println ( "Arrays.binarySearch ( nums,50 ) = " + Arrays.binarySearch ( nums, 50 ) );//checks for the values index num.
        System.out.println ( Arrays.binarySearch ( countries, "Germany" ) );

        Arrays.sort ( nums );//kucukten buyuge
        Arrays.sort(countries);//alfabetik order.

        Arrays.stream(countries).forEach ( System.out::println );//it will print all elements of this array
        System.out.println ( "Arrays.stream(nums).sum () = " + Arrays.stream ( nums ).sum () );//give sum of the nums.


    }
}
