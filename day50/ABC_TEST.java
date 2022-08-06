package com.days.day50;

public class ABC_TEST {
    public static void main(String[] args) {
        ABC abc= new ABC ();
        abc.a=5;
        abc.c="anyString";

        System.out.println ( "abc.a = " + abc.a );// will give 0

        ABC ab=new ABC (9);
        ab.getB ();
        ab.toString1 ();
        abc.toString1 ();

        abc.callAMethodFromOtherClass ( 10,20 );
    }
}
