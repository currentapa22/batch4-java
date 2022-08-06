package com.days.day43;

public class Wrapper_Class_continues_1 {
    public static void main(String[] args) {
        System.out.println ( "Byte.MAX_VALUE = " + Byte.MAX_VALUE );
        /*
        We can use the corresponding value methods (intValue(), doubleValue(), etc) present in each wrapper class.
        Each numeric wrapper class contains the methods doubleValue(), floatValue(),intValue(),shortValue(), longValue() for
        returning a double , float, int , long , or short value for corresponding wrapper object.
        Integer aObj=Integer.valueof(23);                       Double dObj= Double.valueOf(5.55);
        int a =aObj.intValue();                                 double b= dObj.doubleValue();

        We can also convert wrapper objects into different primitive data type;
        Double bObj=Double.valueof(5.55);
        int c =bObj.intvalue();

         */


        Integer i1=Integer.valueOf ( 11 );

        int i2=i1.intValue ();

        System.out.println ( "i1 = " + i1 ); //degerlere baktigimizda ikisi de ayni ama , ama data container is different.
        System.out.println ( "i2 = " + i2 );

        Double d1=Double.valueOf(5.99);
        int i3=d1.intValue ();//it doesn't change the original value.

        double d2=d1.intValue ();

        System.out.println ( "i3 = " + i3 );// data loss output is 5.
        System.out.println ( "d2 = " + d2 );//.intValue ile 5.99 5 oldu ama double d2 oldugu icin 5.0 oldu.!

        //i1 is our object line 20
        int i5=(int)(i1.doubleValue ()); // casting yapmak zorundayiz .doubleValue returns double but i5 is integer.

        /*AUTOBOXING & UNBOXING
        -Java allows primitive types and wrapper classes to be converted automatically.
        -The compiler will automatically box a primitive value that appears in a context requiring an object, and will
        unbox an object that appears in a context requiring a primitive value.
       */
        int i6=11;
        Integer i7=i6;// auto boxing.
        //We declared an object and assign primitive data container to an object.Java does convert automatically.
        //Autoboxing is the process of converting a primitive type data into its corresponding wrapper class object instance.
        //It involves the dynamic allocation of memory and initialisation of an object for each primitive.
        //In autoboxing there is no need to explicitly construct an object.!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //int i=123;    Integer i2=i;//Autoboxing

        //Primitive ---> Wrapper Class (autoboxing)
        //Wrapper Class ---> Primitive (unboxing)


        /*Unboxing!
        ->Unboxing is the process of converting a wrapper instance into a primitive type.
        ->It is a process through which the value of a boxed object type is automatically unboxed from wrapper
        when its value is required
        ->In order to do this , THERE IS NO NEED TO CALL A METHOD (doubleValue() or intValue().)
        Integer i=new Integer(123);
        int i2= i;  //unboxing.      //basically we took the object and assign it to an primitive int.
         */

        int i8=i7; // unboxing .i7 is an object     /Wrapper instance to primitive1









    }
}
