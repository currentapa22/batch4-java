package com.days.day51;

public class get_set_last_exp_test {
    public static void main(String[] args) {
        get_set_last_explanation per1= new get_set_last_explanation ();
        per1.city="Oslo";
        per1.setName ( "David" );
        String per1Name= per1.getName ();
        System.out.println ( "per1Name = " + per1Name );

        get_set_last_explanation per2= new get_set_last_explanation ();
        per2.setBrthYear ( 2018 );
        per2.setName ( "Ronaldo" );
        System.out.println ( "per2.getName () = " + per2.getName () );
        System.out.println ( "per2.getBrthYear () = " + per2.getBrthYear () );
    }

}
