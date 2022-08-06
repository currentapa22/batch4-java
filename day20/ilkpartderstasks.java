package com.days.day20;

public class ilkpartderstasks {
    //20.gunun videosunun ilk dersidir.Odevi cozuyoruz,ornekler uzerinden.slaylarda 17-18. sayfa


    public static void main(String[] args) {

        int num1=7;
        int count=1;
        int multiplication;

        do{
            multiplication=num1*count;
            System.out.println (multiplication);
            count++;

        }while(count<11);


        int givenNumber = 5;
        int j =1;

        while(j<=10){
            System.out.println (givenNumber+ " *"+ j +" = "+(j*givenNumber));
            j++;
        }


        //2. egzersiz sorusu
        int m=0;
        for(int i=0;i<=5;i++){
            m=2*m;
            System.out.println (m);
            m++;

        }


        int l =6;
                l*=2;
        System.out.println (l);
        for (int y=0;y<=4;y++){
            l*=2;
            System.out.println (l);
        }











    }
}
