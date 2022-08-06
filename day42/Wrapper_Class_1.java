package com.days.day42;

public class Wrapper_Class_1 {
    //we need a more powerful structrure to hold the numbers, and should work with object directly.
    //We will learn non -primitive numeric structures.
    //There are some  pre defined classes in java, we call them wrapper classes in general .But there is none name wrapper classes.

    //When we create an object to wrapper class, it contains a field and in this field, we can store primitive data types.
    //Wrapper class provides the mechanism to convert primitive into object and also object into primitive
    //Each of Java's eight primitive data types has a wrapper class , dedicated to it which wraps the primitive data type into an object of that class
    //Wrapper classes are provided in java.lang package in Java which is imported by default into all java programs.

    //Primitive type        Wrapper Class
    /* boolean              Boolean
       char                 Char
       byte                 Byte
       short                Short
       int                  Integer
       long                 Long
       double               Double
       char                 Character

     */

    /*
    How to create an object from Wrapper Class?
    1.By using consturctor to convert a primitive value to an object of a wrapper class
    Integer object=new Integer(1);
    Integer object= new Integer("1");

    2.By using valueOf(arg) static method which creates a new object initialised to the value represented by argument.
    Integer object=Integer.valueOf(1);
    Integer object=Integer.valueOf("1");

     */
    public static void main(String[] args) {



        Integer intObj=new Integer ( 1 ); // this is an object from Integer class.
        Integer intObj2=new Integer("1");

        Integer intOjb3=Integer.valueOf ( 1 );//we are using a predefined method here,this method returns an Integer instance(object)


        int intPrimtv=1;//this is not an object.Just a variable.
        System.out.println ( "intPrimtv = " + intPrimtv );// 1
        System.out.println ( "(intPrimtv+intPrimtv) = " + (intPrimtv + intPrimtv) );//what is output ?


        String value="1";
        Integer strInt= Integer.valueOf ( value ); //we converted string to int with using wrapper class methods.
        System.out.println ( "strInt = " + strInt );// 1
        System.out.println ( "(strInt+strInt) = " + (strInt + strInt) );

        System.out.println ( "(value+value) = " + (value + value) );//what is output.

       // Character charObj= new Character ( "d");//ERROR!
        Character charObj=Character.valueOf ( 'd' );//value of method for character only takes char as a parameter not string.!

        //String valueof method, we int value of method can take string as a parameter.Every data type has different arguments for valueOf()method.

       // Byte byteObj= new Byte ( 126 ); !gives an error.We type this value in method so this method only acccepts byte type but 126 is integer so we have to cast it!
        Byte byteObj= new Byte((byte)126);//have to cast because we type the value in method.
        byte bytePrmtv=126;//doesn't give an error.

        //same applies to short.

       // Byte byteObj2=128; object olmus olmamis farketmez , 127 den buyukse byte icin hata verir.

        Long longObj= new Long(126);//we dont need to explicitly casting here because 126 value is integer, long >int. so implicityl java does that for us.

        //if you are using a number in any method , you have to cast that number if you are supposed to!


        //

     //   2.By using valueOf(arg) static method
        //Primitive type        Wrapper Class                   example
    /* boolean              Boolean                             Boolean b=Boolean.valueof(false);    or Boolean b2=Boolean.valueOf("false");
       char                 Char                                Character c = Character.valueOf('c');
       byte                 Byte
       short                Short
       int                  Integer                         Note: each primitive data type has it own valueof() method , so the parameter is depends on the class we use.
       long                 Long
       double               Double
       char                 Character

     */


        Double dbObj= new Double ( 11.2 );    //
        Double dbObj2=Double.valueOf ( 11.2 ); //valueof() method takes string and double for Double class.!Methodun ustene ctrl +click ile gorebilirsin methodlari.

        System.out.println ("\n////////////////////////////////////////////////////\n");
        char charPrmtv='a';
        char charPrmtv2=97;//java can handle this
        System.out.println ( "charPrmtv = " + charPrmtv );
        System.out.println ( "charPrmtv2 = " + charPrmtv2 );

        Character charObj2= Character.valueOf ( (char) 97 );//97 is integer we have to cast to char!//it only accepts char, when you check the method for Character ,its only accepts char values.

        System.out.println ( "charObj2 = " + charObj2 );


        //lets see float !
        /*
        Any fractional number in java accepted as double by default. If i need to use float;
         */
        Float fltObj=11.2f;

        Float fltObj2=new Float ( 11.1 );  //Float method request a double when you click on the class, we dont need to type F
        Float fltObj3=Float.valueOf ( (float)11.1 );//this method takes float as a parameter so either i have to put 11.1f or (float)11.1 cast


        Float fltObj4=Float.valueOf ("11.1" ); // String as a parameter here !
        System.out.println ( "fltObj4 = " + fltObj4 );

        System.out.println ("\n///////////////////////////////////////////////\n");

       // Integer i1=Integer.valueOf ("1a"  );//Can we turn 1a to number?throws exception: .NumberFormatException error. Compile time error.!
        //Java cannot turn this value to int.


        char c1='A';
        System.out.println ((int)c1);
        int i2='A';
        System.out.println ( "i2 = " +i2 );

        Character C1='A';
        System.out.println ( "C1 = " +(int) C1 );

       // Integer I1='A'; gives error   //Integer doesnt accest char values.!
        Integer I1=(int)'A'; //need to cast.

        System.out.println ( "(I1+I1) = " + (I1 + I1) );//gives 130 as a integer, we can do mathematical ops.

        //Why we need Wrapper Class?
        /*
        Generic classes only work with object and don't support primitives.As a result we have to convert primitive values into wrapper objects.
        Wrapper class provide constants and methods for manipulating various data types unlike primitive data types.
        Wrapper Class objects are necessary if we with to modify the arguments passed into the method(because primitive types are passed by value)
        If we pass a primitive value ,it will not change the original value,But if we convert primitive value in an object , it will change the original value.
         */

       /*


        */






    }


    }

