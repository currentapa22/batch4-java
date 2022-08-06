package com.days.day9;

public class AssigmentOperators {

    public static void main(String[] args) {

        int num=20;
        int value= num;
        System.out.println("num = " + num);// kodu calistiramayiz variableye deger vermek lazim.
 // Assigment operators
        // 1. =   , 2.  += , 3. -= , 4. *=, 5. /= , 6. %=
        //= is assigment op , == is used for equals meaning.
        // +=
        int  num2= num+ 50; //20 +50 num2= 70 // bu ayni matematik gibi isliyor
        num2 = num2+100; //ama bu farkli mantikta isliyor,Bu bir assigment. num2= 70+100 here.
        System.out.println("num2 = " + num2); //there is no error.

        num = num + 500; // num = 20 + 500
        System.out.println("num = " + num);
         num+= 1000; // shortcut means num = num + 1000
        System.out.println("num = " + num); // 1520

        num -=520; // means num =1520-520
        System.out.println("num = " + num);
         num /=10; // means bolme islemi. 1000/10
        System.out.println("num = " + num);

        num %=3; // num = num %3  num = 100%3 =1
        System.out.println("num = " + num);

        int value7=200;
        value7=value7-50; //bir asagidaki satir ile ayni.
        value7-=50;
        System.out.println("value7 = " + value7); //100


        int num11=200;
        num11 +=value7; // means num11= num11+value7
        System.out.println("num11 = " + num11);
    }
}
