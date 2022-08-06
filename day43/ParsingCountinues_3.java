package com.days.day43;

public class ParsingCountinues_3 {
    public static void main(String[] args) {

            //Number to String parsing.
        Integer intObj = Integer.valueOf ( 11 ); //How we convert this integer to string.
        Double dbObj=Double.valueOf ( 11.1 );


        String strObj=String.valueOf ( intObj );//1.YOL //INTEGER
        String strObj2=intObj.toString ();//2.yol     // INTEGER
        String strObj3=intObj+"";//3.yol             // INTEGER

        String strObj4=String.valueOf ( dbObj ); //DOUBLE
        String strObj5=dbObj.toString (); //DOUBLE
        String strObj6=dbObj+"";  //DOUBLE

        System.out.println ( "strObj = " + strObj );
        System.out.println ( "strObj2 = " + strObj2 );
        System.out.println ( "strObj3 = " + strObj3 );


        System.out.println ( "strObj4 = " + strObj4 );
        System.out.println ( "strObj5 = " + strObj5 );
        System.out.println ( "strObj6 = " + strObj6 );


        System.out.println ("\n////////////////////////////////////\n");
        //Can we parse boolean to string ?

        Boolean flag= Boolean.valueOf ("true"  );
        String ss=flag.toString ();//1.yol
        System.out.println ( "ss = " + ss );

        ss=String.valueOf ( flag );//2.yol;
        System.out.println ( "ss =" +ss);

        ss=flag+"";//3.yol
        System.out.println ( "ss = " + ss );


    }
}
