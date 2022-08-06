package com.days.day39;

import java.util.Arrays;

public class sekiz_Reverse_method {
    public static void main(String[] args) {
        int[] nums={5,12,30,14,50,23,45,56,78,55,222,1246};


        arr(nums);

        int[] digits={98,87,76,65,54,32,21,1,23};
        reversed ( digits );
        String reverse=reversed ( digits );//integer i string e cevirdik ve simdi elementlere erismek istiyorsak split metod kullanabiliriz

        System.out.println ( "reverse = " + reverse );
        String[]split=reverse.split ( "," );//split metod tekrardan array a donusturuyor!!
        System.out.println ( "Arrays.toString ( split ) = " + Arrays.toString ( split ) ); //array oldu tekrardan
    }

public static int[] arr(int[] nums){
        int[] newArray= new int[nums.length];
        int index=nums.length-1;
        for(int i =0;i< nums.length;i++){
            newArray[i]=nums[index];

            index--;
        }
    System.out.println ( "Arrays.toString ( nums ) = " + Arrays.toString ( nums ) );
    System.out.println ( "Arrays.toString ( newArray ) = " + Arrays.toString ( newArray ) );
        return newArray;

}



//hocanin metodu

    public static String reversed(int[]nums){
        int[] newArray= new int[nums.length];
        int index=nums.length-1;
        for(int i =0;i< nums.length;i++){
            newArray[i]=nums[index];

            index--;
        }
        System.out.println ( "Array old one =" + Arrays.toString ( nums ) );
        System.out.println ( "Array after reverse = " + Arrays.toString ( newArray ) );
        return Arrays.toString (  newArray);

    }



}
