package com.days.day23;

// ASCII table denen bir sey var ondan bahsediyoruz
public class dorduncuders {
    public static void main(String[] args) {
        //128 karakter var tabloda ,32 tane kullanilmiyor.
        for(char ch='A';ch<='Z'; ch++ ){
            System.out.print (ch);//we will see capital letters. A to Z
            int a =ch;  //we will see value of the capital carakters.
            System.out.println (a); //each character in the keyword has a value like A==65,B==66 gibi

        }
        for(char c=0;c<256 ; c++){
            System.out.println ("c =" +c);
        }
        int num='A'; //num value is 65
        System.out.println ( "num = " + num );
        int num1='a';//num valus is A+32 , 97
        System.out.println ( "num1 = " + num1 );


    }

}
