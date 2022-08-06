package com.days.day47.passing_objects;

public class Board {

    int serialNumber;

    String label;

    public Board(int serialNumber, String label) {
        this.serialNumber = serialNumber;
        this.label = label;
    }

    public void fixBoard(){
        System.out.println ("Fixed board");
    }

    public void paintBoard(){

        System.out.println ("Board PAINTED");
    }

    public  void  printBoardLabel(Board boardObj){   // parameter is an object, so whenever i want to call this method i have to provide Board type of objects.
        System.out.println ( "Label of board = " + boardObj.label );
    }



}
