package com.days.day35;

public class BirText {
    //Bugun ve yarin string class ve methodlarini gorecegiz.!
    //Is hayatinda string ve string class ve methodlarini hep kullanacagiz!
    //onemli bir subject!!!!

    /*String Class is a predefined class in the Java library which comes with JRE
    String Class is used as a reference type of a variable which references a String object
    String Class is defined as 'java.lang.String' in Java which is used to create a String object.

    String is an object that represents a sequence of char values.Each of the letters and characters you should think
    like char. "Hello Java" is combine of chars H,e,l,o,J,a,v,a    !!
    If we are not creating new string objects, whatever we create is in the string pool.


     */
    public static void main(String[] args) {

        String text="Hello Java"; //1. way// there are 2 ways to create a string.
        String str= new String ("Hello");//2. way // create an object from String class.
        String city= new String ("London");
        String text2= new String ("Hello Java");          // text!== text1.
        String text3="Hello Java";   // text2==text3 wrong.

        System.out.println (text==text2);// text2 is created from object so it is not in the string pool!.
        System.out.println (text == text3); // in the string pool

        String text4= new String ("Hello Java");
        System.out.println (text2==text4);//even though they are both object, with 'new' keyword java creates a new different address this object.
        //don't forget when java compares string , it doesn't compare the value , it compares the string addresses!.

        String city2="London";
        String city3="London";
        System.out.println ( city2 == city3 );//true.

        System.out.println ( city == city2 );//false.

        String str2= new String("Hello again"); //when you do ctrl+click on String , it will take you string class.But this goes line 260
        String str3=new String();// this goes line 244
        String str4=new String("Hello"); //goes 260. (method overloading var line 260 da).


    }
}
