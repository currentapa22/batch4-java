package com.days.day28;

public class ucuncudersNestedLoop {
    public static void main(String[] args) {
        //LABEL STATEMENT!!!!!
        outside: //ilk defa out koydum, asagidaki break e de koyduk , kaldirip koyup farkini inceledik!
        for(int i =0; i <3;i++){//outer loop
            System.out.println ("outer value= "+i);
            for(int l=0;l<3;l++){//inner loop
                if(l==2){
                    break outside;// outside un icinde olan //BUNUN ADI LABEL STATEMENT!!!!!
                }
                System.out.println ( "inner value= " + l );
            }
        }







    }
}
