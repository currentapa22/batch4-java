package com.days.day9;

public class soruCevap {

    public static void main(String[] args) {
        //unary operators
        //++ increases value of the variable by 1.
        //-- decreases the value of variable by 1.
        //create 2 int variable ,and create third one after adding first 2 , assign it to 3.one

        int a =10;
        int b = 20;
        int sum = ++a + ++b; // a =11 b = 21
        System.out.println("sum = " + sum); //32

        sum = a-- +b--; // a still 11 and also b is 21. These decrement will apply after this line a is10 b is 20.
        System.out.println("sum = " + sum); //32
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sum = a+b;//30
        sum= --a + --b;
        System.out.println("sum = " + sum); //28

        double d =2.9;
        System.out.println("d = " + d);
        d++;// increase value of the variable by 1 so will be 3.9
        System.out.println("d = " + d);

        // create 2 int , and swap their values.
        //you can use 3. one to make it.
         int k= 10, l= 20;
         int sum2=k+l;//sum 2 is 30                              //normal matematik gibi degil, bunu bilince daha kolay.
         k = sum2-k;//k is now 20  (30-10)
         l=sum2-l; // l will be 10 (30-20)
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("sum2 = " + sum2); //bu semayi yaparsan k ile l nin degerlerini istedigin gibi degistirebilirsin , formul calsiiyor.

        //lets do again without creating the third variable.

        int kk =20, ll=10;
        kk=kk-ll;
        ll=kk+ll;
        System.out.println("kk = " + kk);
        System.out.println("ll = " + ll); // kk=10 , ll= 20 ///dogru cozdun kendi basina !!!
        // a=a+b oldugunda mesela ilk a yi matematikteki esittir ggibi dusunme.
        // Ilk a variablenin adi , asignment operatorunden sonrakiler ise sadece o variablelerin degerleri gibi dusun. Daha acik!

        //bir baska ornek!
         int first = 10;
         int second = 5;
         int third= first; //third = 10
         first = second; //first =5
        second = third; //second =10
        System.out.println("first = " + first);
        System.out.println("second = " + second);

    }



}
