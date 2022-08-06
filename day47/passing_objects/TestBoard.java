package com.days.day47.passing_objects;

public class TestBoard {


    public static void main(String[] args) {

   // Board board1;
   // board1.printBoardLabel (); gives error because line 8 i didn't  finish initialization

        Board board1=new Board(10001,"mobileBoard");
        board1.fixBoard ();



        board1.printBoardLabel ( board1 ); // this is called passing an object as an argument to a method!!





    }
}
