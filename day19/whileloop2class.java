package com.days.day19;

public class whileloop2class {


    public static void main(String[] args) {

        int pratic1=0;
        int sum=0;
        while(pratic1<100){
           sum +=pratic1;
            pratic1+=2;
        }
        System.out.println ("sum= " + sum);


        int number=30;
        while(number>=20){
            System.out.println ("in the loop"+number);
            number--;
        }


        //bu altta 3 soru slaytlardaki sorular, iyi incelemek lazim
        int i =0;
        while(i<10){
            if(i %2==0);
            System.out.println (i);
            i+=2;
        }

       // int u =1;
       // while (u<10)
         //   if(u % 2 ==0) //output nothing because we started from 1 that means first condition in loop is wrong so it will never go further!
           //     System.out.println (u++);

        int t=1;
        while(t<10)
            if((t++) %2 ==0) //postfix t++ first time still equals to 1 so ,condition is false.
                System.out.println ("t: " + t);


        boolean isItNotAppear= false;
        while(isItNotAppear){
            //click(refreshButton);
            isItNotAppear=true;   //its hard to do this on for loop.






        }

















    }
}
