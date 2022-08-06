package com.days.day48;

import java.util.ArrayList;
import java.util.Arrays;

public class Ilk_ders {
    public static void main(String[] args) {
        ArrayList<String> players=new ArrayList<> ( Arrays.asList ("Benzema","Beckham","Ronaldinho","Juninho","Number1"));
        players.add("Ronaldo");
        players.add("Hasan");
        ArrayList<String>selectedPlayers=new ArrayList<> ();

        for(String player: players){

            if(player.contains ( "Ro" )){
                selectedPlayers.add(player);

            }
        }

        for(int i =0;i<players.size(); i++ ){
            if(players.get(i).contains ( "Be" )){
                System.out.println ( "players.get ( i ) = " + players.get ( i ) );
            }
        }
        System.out.println ( "selectedPlayers = " + selectedPlayers );

        selectPlayer(players,"Ro");
        selectPlayer ( "Ro",players );
    }

//lets turn this code a method

    public static ArrayList<String> selectPlayer(ArrayList<String> gamer, String str){

        ArrayList<String> selectedPlayers = new ArrayList<> ();
    for(int i =0; i <gamer.size ();i++){
        if(gamer.get(i).contains ( str )){
            selectedPlayers.add(gamer.get(i));
            System.out.println ("Index number = "+ i );
            System.out.println ( "gamer.get(i) = " + gamer.get ( i ) );
        }
    }

    return selectedPlayers;


    }


    //baska bir yoldan deneyelim
    //we created for each method here actually

    public static void selectPlayer(String str,ArrayList<String > gamer ){
        gamer.stream ().filter(x->x.contains ( str )).forEach ( System.out::println );
        for(String player: gamer){
            if(player.contains ( str )){
                System.out.println ( "player = " + player );
            }
        }
    }


}
