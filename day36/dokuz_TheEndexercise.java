package com.days.day36;

public class dokuz_TheEndexercise {
    public static void main(String[] args) {
        /*

Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"

        */
String str="Hello";
boolean front=true;
String result="";
if(front){
    result=str.substring ( 0,1 );

}else{
    result=str.substring ( str.length ()-1 );
}
        System.out.println ( "result = " + result );


    }
}
