package com.days.day38;

public class Bir_Strings_Review {
    /*
    arraylere baslayacagiz ama once gecen haftanin tekrarini yapip biraz soru cozucez.
     */
    public static void main(String[] args) {

        String str="   Hello Java   ";//1.way to create
        String str1=new String("Hello again");/*2. way to create//object.
        //String class in icinde predefined methodlar var ama onlar static degiller.Static olmadigi icin object
        olusturup , onunla beraber cagirmamiz gerekiyor.*/
        String str2="hello java";

        //some string class methods is overwritten, how we understand that ? same method with different parameters!!
        //length()   --> no parameter needed. it will return an integer.you need to print to see.
        System.out.println ( "str.length () = " + str.length () );//you can directly print it or assign it to a variable

        //charAt() we need to provide an index number ( int) .It has to be smaller then length() of this var.
        //index number starts at 0 not 1.
        System.out.println ( "str.charAt ( 9 ) = " + str.charAt ( 9 ) );

        //substring() has overloaded methods.  I need to provide an beginning index, also i could provide last index too
        System.out.println ( "str.substring ( 3,7 ) = " + str.substring ( 3, 7 ) ); // last index is exclusive.

        //toupperCase(), toLowerCase().
        System.out.println ( "str.toUpperCase () = " + str.toUpperCase () );//original var wont change , if you want to
        //change it , you need to assign this to a variable.
        System.out.println ( "str.toLowerCase () = " + str.toLowerCase () );
        String newstr=str.toLowerCase ();
        System.out.println ( "newstr = " + newstr );// new version here.

        //concat() method.
        System.out.println ( "str.concat ( str1 ) = " + str.concat ( str1 ) );
        //makes concatination, it will bring them together.

        //if we want to compare two strings , and if we use (==) this will compare the address.
        //but if we want to compare string context is same or not we can use equals() method.
        //equals()
        System.out.println ( "str.equals ( str1 ) = " + str.equals ( str1 ) );//expected false.
        System.out.println ( "str.equals ( str2 ) = " + str.equals ( str2 ) );//case sensitive, expected false.

       // equalsIgnoreCase() method will check 2 strings REGARDLESS their letters capital or lower case.
        System.out.println ( "str.equalsIgnoreCase (str2  ) = " + str.equalsIgnoreCase (str2) );

        //contains() method ile bir stringde istenilen degerlerin icerilip icerilmedigine bakar!
        System.out.println ( "str.contains(\"Hello\") = " + str.contains ( "Hello" ) );//expected true!


        //startsWith() method that we check whether the string starts with those values or not!
        System.out.println ( "str.startsWith (\"He\") = " + str.startsWith ( "He" ) );//expected to be true

        //endsWith() method does same thing with at the end.!
        System.out.println ( "str.endsWith ( \"He\" ) = " + str.endsWith ( "He" ) );//expected to be false
        System.out.println ( "str.endsWith ( \"va\" ) = " + str.endsWith ( "va" ) );//expected to be true.

        //replace() method will change the values , with all other matching values.
        System.out.println ( "str.replace ( \"Java\", \"Selenium\" ) = " + str.replace ( "Java", "Selenium" ) );//won't effect the original unless you assign it to.
        System.out.println ( "str = " + str );//still same
        //indexOf() method. //verilen stringin hangi indexden itibaren basladigini gosterir.
        System.out.println ( "str.indexOf ( \"Java\" ) = " + str.indexOf ( "Java" ) );
        System.out.println ( "str.indexOf ( \"sdas\" ) = " + str.indexOf ( "sdas" ) );//yok ise bu deger, will give -1.

        //trim() method, will delete the white spaces at the end and beginning.
        System.out.println ( "str.trim() = " + str.trim () );


        //2.ders burada basliyor.
        //Coding battan soru cozuyoruz./String-2 double char.
        /*
        Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"


         */


        String mystring=new String ();

    }
public String doubleChar(String str){
        String res="";
        for(int i=0;i<str.length ();i++){
            res=res+str.charAt ( i )+ str.charAt ( i );
        }return res;
}


}
