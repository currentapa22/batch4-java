package com.days.day38;

public class bes_printArray {

    public static void main(String[] args) {
       int[]numbers={10,20,30,40,50,60};

        printArray ( numbers );//working +

        String[] fruits={"orange", "melon", "cherry"};
        //printArray ( fruits ); will give error because printarray accepts integer parameter, fruits string.

        printArray ( fruits );// working++

        //hoca bir shortcut gosteriyor.

        bes_printArray print= new bes_printArray ();//we created an object from this same class.
        print.printString(fruits);//click on the printstring and create an method click.
        print.printIntegers(numbers);


    }

    public void printIntegers(int[] numbers) {
    }

    public void printString(String[] fruits) {
    }

    public static void printArray(int[]nums){
for(int num:nums){
    System.out.println ( "num = " + num );
}
}

public static void printArray(String[] str){
        for(String mystring:str){
            System.out.println ( "mystring = " + mystring );
        }
}

public static void printArray(){

}








}
