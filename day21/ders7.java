package com.days.day21;

public class ders7 {

    public static void main(String[] args) {
System.out.println(helloName ( "Burak" ));//this method calling carries now Hello Burak
   String hello=helloName ( "Ali" );//Hello Ali
        System.out.println ( "hello = " + hello );//Hello Ali

    }

    public static String helloName(String name){ // name ="Burak"
        String returningValue="Hello " + name; //returningValue = Hello+Burak
        return returningValue;//Hello Burak



    }






}
