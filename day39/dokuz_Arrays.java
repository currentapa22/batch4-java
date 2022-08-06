package com.days.day39;

import java.util.Arrays;

public class dokuz_Arrays {
    public static void main(String[] args) {
        int[] numbers={150,20,130,40,55,10,20,60};
        //i can call this array one by one with their element numbers.

        //if i want to print them.
        System.out.println ( "Arrays.toString (numbers) = " + Arrays.toString ( numbers ) );//[150, 20, 130, 40, 55, 10, 20, 60]

        //toString method is overloaded , so you can use it for double, integer,char,boolean etc.
        //there is another method in Arrays class.

        Arrays.sort (numbers);//bu method sayilari kucukten buyuge siralar ve numbers degisti suan bu sekilde!!.
        System.out.println ( "Arrays.toString (numbers) = " + Arrays.toString ( numbers ) );//[10, 20, 20, 40, 55, 60, 130, 150]

        String[]countries={"Spain","Germany","Holland","Polland","Greece"};

        Arrays.sort ( countries );//string i nasil sort ediyor?  ALFABETIK ORDER!!!!!!!!!
        System.out.println ( "Arrays.toString ( countries ) = " + Arrays.toString ( countries ) );


        //there is another method,if you want to search someting in the array
        System.out.println ( "Arrays.binarySearch (numbers,55  ) = " + Arrays.binarySearch ( numbers, 55 ) );//gives the index number of element



        //stream() method// we can print all the elements of the array one by one !!!!!!!!
        //this method has different sxynax
        Arrays.stream ( numbers ).forEach ( System.out::println );//will print elements
        Arrays.stream (countries).forEach ( x-> System.out.println (x));//will print elements.  // letter x represents each element of countries.X harfi olmak zorunda degil herhangi bir sey olabilir ama gorevi represents each element
        Arrays.stream ( numbers ).forEach ( a->System.out.println(a>30) );//will check each element if greater then 30 , return boolean
        Arrays.stream ( numbers ).filter ( x->x>30 ).forEach ( x-> System.out.println (x) );//print numbers greater then 30.
        System.out.println ( "Arrays.stream ( numbers ).count () = " + Arrays.stream ( numbers ).count () );//element sayisini verir!
        System.out.println ( "Arrays.stream(numbers).sum () = " + Arrays.stream ( numbers ).sum () );//gives us sum of the numbers.

        Arrays.stream ( numbers ).distinct ().forEach ( System.out::println);


    }
}
