package com.days.day44;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayList_6_Review11 {
    public static void main(String[] args) {
        //we have to now how to create an array list!
        //can't use primitive data typess in arraylist! - we put object! Arraylist<Classname>
        //ArrayList<Integer> digits= new ArrayList<> (); gibi!
        //Arraylist is flexible , we don't have to put element numbers when we create one

        ArrayList<Integer> numbers=new ArrayList<> ();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(5);
        numbers.add(5);
        numbers.add(15);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);

        for(int i=0; i <numbers.size ();i++){  //30 dan buyuk sayilara print etmek icin!
            if(numbers.get ( i )>30){
                System.out.println (numbers.get(i));
            }
        }
//Arraylist print etmenin baska bir yolu!
       List<Integer> collect =numbers.stream ().filter ( num->num>30 ).collect ( Collectors.toList () ); //filter(x->)      x is a variable and its represent element of numbers arraylist.foreach loop da yaptigmiz gibi
        System.out.println (collect);           // x olmak zorunda degil ne koyarsan koy.

        //Arraylist print etme yolu
        numbers.stream ().filter ( x->x<20 ).forEach ( System.out::println );



    }
}
