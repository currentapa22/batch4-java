package com.days.day43;

public class WrapperParsing_2 {
    public static void main(String[] args) {



        /*PASSING VALUES FROM A STRING.

        1.By using Integer.valueOf(String), Double.valueOf(String) etc. methods

        String number ="1234";                                      String number3="1234.56";
        int number2= Integer.valueOf(number);                       double number4=Double.valueOf(number3);

        2.By using parseInt(String), parseDouble(String) etc.methods.
        String number="1234";                                                String number3="1234.54";
        int number2=Integer.parseInt(number);                                double number4=Double.parseDouble(number3);

         ->valueOf() method returns an object.
         */
        Integer i2=Integer.valueOf ( 11 );// unnecessary boxing here , bu yuzden sari renkli cikiyor    Integer i2=11; ile ayni seye esit aslinda.


        String str="1001";
        Integer i1=Integer.valueOf ( str );

       i1=Integer.parseInt ( str );//parseint() same with valueOf()

        System.out.println ( "i1 = " + i1 );//1001


        System.out.println ("\n///////////////////////////////////////\n");
        //what happens if we change str ="1001" to "1000.9"
        str="1000.9";

        Double d1=Double.valueOf ( str );
        System.out.println ( "d1 = " + d1 );// output 1001.9 no problem.

      //  i1=Integer.valueOf ( str ); //only accepts integers. it throws error NumberFormatException
       // int i3=Integer.valueOf(str);//it throws error NumberFormatException

//        System.out.println ( "i3 = " + i3 );//
  //      System.out.println ( "i1 = " + i1 );//


        str="111a";
      //  i1=Integer.valueOf ( str ); // valueOf method throws expection.NumberFormatException
      //  System.out.println ( "i1 = " + i1 );


        //String str ="1-16 of over 9.000 results for"    return result value as Integer!!(as object)
        //lets solve
        str ="1-16 of over 19,123,111 results for";
        System.out.println ( "getResult ( str ) = " + getResult ( str ) );
    }
public static Integer getResult(String input){ //this kind of method i will encounter all the time so be familiar.

        int start=input.indexOf ( "r" )+2;
        int end=input.indexOf ( "results" )-1;

    String rowResult = input.substring ( start, end );

   String result= rowResult.replace(",", "");
    return Integer.valueOf ( result );

}



}
