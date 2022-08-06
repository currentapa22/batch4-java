package com.days.day11;

public class unaryAndRelationalReview {

    public static void main(String[] args) {

        String s1="1";


        //System.out.println(s1++); Error use with numeric data type.!!

        //num++ equal to num= num+1
        // num-- equal to num= num-1

        int val=0;
        int a = 1;
        val=a++;
        System.out.println("val = " + val);

        System.out.println(10 == 9);
        System.out.println(10 != 9);
        System.out.println( 10 >9 ); // sari ile cizilmis gibi ustleri cunku bunlari final kod gibi ,sonucun degismeyecegini biliyoruz.


        System.out.println(4>2==2>4);//false

        int b=100;
        b= b-50; //readability is low.
        b-=50; // everyone use like this , more efficient
        System.out.println(b);








    }

}
