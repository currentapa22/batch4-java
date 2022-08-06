package com.days.day38;

public class dort_Fruit {
    public static void main(String[] args) {

        //create an array (string) ,assign 5 value
        String[] myfruits={"lemon","apple","watermelon","orange","banana"};//1.yol
        System.out.println ( "myfruits[0] = " + myfruits[0] );

        String[] meyveler=new String[5];//2.yol
        meyveler[0]="Limon";
        meyveler[1]="Elma";
        meyveler[2]="Karpuuz";
        meyveler[3]="Portakal";
        meyveler[4]="Muz";

        System.out.println ( "meyveler[0] = " + meyveler[0] );

        int[] nums=new int[4];
        nums[0]=121;
        nums[1]=53;
        nums[2]=2321;
        nums[3]=6123;

        int[] nums1={1,2,4,5,7,2,3};


        int[] years=new int[5];
        years[4]=2000;
        years[0]=1000;
        years[1]=3000;
        //we didn't assign anyything for years[2]. Output ??
        System.out.println ( "years[2] = " + years[2] );//default value is 0

        myfruits[0]="Mango";
        System.out.println ( "myfruits[0] = " + myfruits[0] );

        //we learned how to print length of array.
        System.out.println ( "myfruits.length = " + myfruits.length );

        //how can i print entire array ??
        String deneme="";    // kendim yaptim helal olsun efenim!     //for loop da baslangic ve end index numberini degistirebilirsin.
        for(int i =0;i< myfruits.length;i++){
            deneme=myfruits[i]+" ";
            System.out.print ( deneme+"" );
        }

        //is there any short way to print all  fruits elements?
        for(String fruit:myfruits){// i have declared a string in for loop , and this string represent each element of given array after the column (:).
            System.out.println ( "fruit = " + fruit );
        }//ama bu yontemi kullanirsan baslangic ve son index numberi degistirip print yapamazsin yani belli araliklari alma imkanin yok!>

        //we can do that for int as well
        for(int year:years){
            System.out.println ( "year = " + year );

        }//we can put this code into the method ..



    }
}
