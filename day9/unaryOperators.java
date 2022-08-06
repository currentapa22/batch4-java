package com.days.day9;

public class unaryOperators {


    public static void main(String[] args) {

    int sum = 5+20; // 5 and 20 is operant + is operator.

        System.out.println("sum = " + sum);
        sum++; // ilk defa kullandik ++ operatoru. +1 anlamina geliyor.
        System.out.println("sum = " + sum); //26
        ++sum;
        System.out.println("sum = " + sum);//27
        //sometimes position of unary operator (++) is important

        int num = sum; //27
        int num2= ++sum; //28
        System.out.println("num2 = " + num2); //28
        System.out.println("num = " + num); //28

        int num3 = sum++; // before the increment, we assign sum to num3 so num3 get normal sum value
        // and then we put unary after sum, means value would increase after this line.
        System.out.println("num3 = " + num3);
        System.out.println("sum = " + sum); //29

        System.out.println("sum = " + sum++); //what would happen if we add unary in here ?
        //sum=30 // sum++ olunca , artisi bir sonraki lane de goruyoruz.

        //ayni kurallar decrement icinde gecerli(azalis)!!!

        int a =30;
        int b = a--; // -- yi variableden sonra yazdigimiz icin value decrease after we declared the variable, so means next line would be still same result.
        //after that would be decreased.
        System.out.println("b = " + b); //30
        System.out.println("a = " + a); // simdi 29 oldu bir sonraki linede.

        System.out.println("a = " + --a);// if we decrease value of a first and then print out what would the value be ?
        // 28 is the result. oncesinde -- unary operator olunca println yapar yapmaz goruruz.

        System.out.println("a = " + --a);
        System.out.println("a = " + a--);
        System.out.println("a = " + a);
        System.out.println("b = " + b);// it will not affect b , we are not linking a to b.


        int c = +50; //+ eklemen onemli degil , cunku zaten pozitif kabul ediyor .
        int d = -50; // ama negatif yapmak istiyorsan - koymak zorundasin .
        System.out.println(c+d);

        int e = 50;
        e++; // 50 + 1
        e--; // 50-1


        // ! OPERATOR (UNLEM ISARETI)
        // to convert true to false, false to true.

        boolean real = true;
        System.out.println("real = " + real);
        boolean real2 = !real;
        System.out.println("real2 = " + real2);
        //we assigned real1's value to real2 .And then we use ! to convert to value.It will be false

        boolean real3 = !true;
        System.out.println("real3 = " + real3); // bir baska sekilde kullanabilecegin bir ornek

        real3= real;
        System.out.println("real3 = " + real3);

        boolean real4 = !false;
        System.out.println("real4 = " + real4);


        // declaration and assigment.
        int r = 6;
        System.out.println("r = " + r++); //6
        System.out.println("r = " + r); // 7
        int x = 6;
        System.out.println("x = " + x--); //6
        System.out.println("x = " + x); //5

        int y = 6;
        System.out.println("y = " + ++y); //7
        int p =6;
        System.out.println("p = " + --p);//5 // hepsini dogru yaptim !! tebrikler.
        System.out.println("p = " + p++);// will be 5 again.
        // slaytlarda 7.sayfada unary operator semasi var. orada her sey acik.






    }



}
