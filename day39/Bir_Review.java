package com.days.day39;

public class Bir_Review {
    public static void main(String[] args) {
        double[]numbers=new double[5];//lenght is 5 but last index is 4.
        numbers[0]=2.2;
        numbers[4]=2.2;
        //how we can write last element dynamic?
        numbers[(numbers.length)-1]=5.5;//last element dynamic code.
        numbers[1]=3.3;
        System.out.println ( "numbers[2] = " + numbers[2] );//we didn't assign anything. 0.0 olmali
        String[] cities={"London","Roma", "Oslo", "Istanbul","Berlin"};
        System.out.println ( "cities[1] = " + cities[1] );//Expected result is Roma.

        System.out.println ( "cities[cities.length-1] = " + cities[cities.length - 1] );
        System.out.println ( "cities.length = " + cities.length );
        //  System.out.println ( "cities[5] = " + cities[5] );// out of boundries , will give an error.

        for(String city:cities){
            System.out.println ( "city = " + city );//you will call all of the elements of this array.
        }

        for(int i =0;i< cities.length;i++){//we can change i=1 or 2 or 3 , so you can customize it.
            System.out.println ("city: " +cities[i] );
        }
        System.out.println ( cities[0].substring ( 0,3 ) );//we will see london.
        //we will print 3 letter.

        String text= "Hello Java";
        System.out.println ( "text.substring ( 0,5 ) = " + text.substring ( 0, 5 ) );


    }
}
