package com.days.day35;

public class LastLetter {

    public static void main(String[] args) {



LastLetter myLastLetter= new LastLetter ();

myLastLetter.lastLetter ( "Bulls" );
myLastLetter.lastLetter ( "Miame Heat" );
myLastLetter.lastLetter ( "Toronto Raptor" );

    }
//non static method, to call we need to create an object.
public void lastLetter(String str){
    System.out.println ( "str.length () = " + str.length () );
    System.out.println ( "str.charAt ( str.length ()-1 ) = " + str.charAt ( str.length () - 1 ) );//works with all Strings.

}


}
