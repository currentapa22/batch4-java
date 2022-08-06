package com.days.day44;
import java.util.ArrayList;
public class ArrayList_1 {
    public static void main(String[] args) {

//ArrayList is a class!
        int[] numbers={10,20,30,40};//we created int array , [] is array sign. [] can come after numbers as well.
                    // 0  1  2  3  //each of the numbers are element of this array, each element is an integer.
        int a =numbers[0];
        numbers[3]=100; // i can change the value
        System.out.println ( "numbers[3] = " + numbers[3] );
        System.out.println ( "numbers.length = " + numbers.length );

        //there is another data structure called ArrayList

       /* ArrayList is resizeable, which can be found in the java.util.package
       ->Java ArrayList class uses a dynamic array for storing the elements.It is like an array but there is no size limit.
       ->We can add or remove elements anytime.
       ->Since ArrayList is a dynamic array and we do not have to specify the size,the size of array automatically increases
         decreases when we add and remove items.
       ->The main difference between Array and ArrayList is that array's size cannot be modified.
       ->!!ArrayList can not be used for primitive types like int, char,etc.We need a "WRAPPER CLASS" for such cases.*/

        //ArrayList<Wrapper Class Name> don't put primitive data type.

            ArrayList<Integer> digits= new ArrayList<> ();    //i dont have to decide the size!
            ArrayList<String> cities= new ArrayList<> ();   //how can we reach methods?   digits.     or cities. yaparak methodlari gorebilirim.
            ArrayList<Integer>  evenNums=new ArrayList<> ();
        //How I can add or remove an element to ArrayList?
        //How can I reach size of list?

        digits.add (100);
        digits.add(200);

        for(int i =0; i <101;i++){
            digits.add(i);
        }
        System.out.println ( "digits = " + digits ); //to add numbers 0 -101.

            //let's add even nums.
        for(int i =0; i<101 ; i++){
            if(i %2==0){
                evenNums.add(i);
            }
        }
        System.out.println ( "evenNums = " + evenNums );

        //How can we bring elements of this arraylist?
        //get method

        System.out.println ( "digits.get(4) = " + digits.get ( 4 ) );//expected result 2 , result =2 .

        //how can we learn length? size method ile
        System.out.println ( "digits.size () = " + digits.size () );

        digits.add(0,500); // we can decide the index number of new element.!
        System.out.println ( "digits.get(0) = " + digits.get ( 0 ) );
        System.out.println ( "digits = " + digits );//500 is at index 0.// bu sayiyi eklemeden onceki index 0 degeri ise index 1 e gecer.!

        //there is another method called set method, accepts 2 parameter.
        digits.set(0,30);// now we can't see 500 anymore. its 30 and 500 is not element anymore!!
        //set method changes value of given index number with given integer value.
        System.out.println ( "digits.get ( 0 ) = " + digits.get ( 0 ) );
        System.out.println ( "digits = " + digits );

        digits.set(1,90);
        System.out.println ( "digits = " + digits );

        digits.add(10);//if i add like this it will go LAST ELEMENT
        //ALWAYS IF WE DON'T DEFINE THE INDEX NUMBER, IT WILL GO END OF THE LIST!
        System.out.println ( "digits = " + digits );

        digits.add(2,2000);//we defined index number here!
        System.out.println ( "digits = " + digits );//200 was at index 2 now it moved to index 3 cunku add method kullandik
        //ama set method ile eklemis olsaydik degerler kaymasi o degerin yerine gecer!

        digits.set(3,10);
        System.out.println ( "digits = " + digits );


    }
}
