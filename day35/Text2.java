package com.days.day35;

public class Text2 {
    public static void main(String[] args) {
//String pool refers to collection of Strings which are stored in heap memory.
        /*Whenever a new object is created;
        -String pool first checks whether the object is already present in the pool or not.
        -If it is present, then same reference is returned to the variable
        -Else new object will be created in the String pool and the respective reference will be returned


*/
        String str="Hello";
        String str2="Hello";
        System.out.println (str==str2);//this statement compares the address not the values!!!!!
        //result should be true..
        String text= new String("Hello");
        System.out.println (text==str);// should be false
        String text1= new String ("Hello");

        System.out.println ( text == text1 );//should be false , they are at different places.
/*
    Each time a new String object will be created in the Java heap memory, regardless of whether there are already
    created String objects with same String content in the Java heap memory
    Using new keyword not always recommended , as this approach is not memory efficient.
 */

//I want to reach Operators icindeki multiply method , how can i ?
        //if i create an object from that class i can reach.
        Operators obj=new Operators ();
        obj.multiply ( 1 ); // as we can see. I can reach the operators class.

    }
}
