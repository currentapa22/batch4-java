package com.days.day8;

public class CastingOpe {


    public static void main(String[] args) {

    double rateA= 1;   //double(variable) <- int(value)
        //casting happened background already.auto casting.

        System.out.println("rateA = " + rateA); //double data type is bigger than int.So there is no data lost

        //int number = 1.0;  // int <--double //this time it cant happen.data type rank is lower.
        int number=(int)1.0;// thats explicit casting.
        // if data type is growing like byte -> short -> int -> long -> float ->double
        //casting would happen in background automatically.(widening type casting[implicit casting)
        //but if  double -> float -> long -> int -> short -> byte is Narrowing Type casting [Explicit casting]

        //if the data is narrowing[Explicit casting] , java cant make it automatically because there may be some data loss.

        // implicit casting , java automatically converts and done by compiler.
        //Characters and booleans cant be converted.

        int myInt = 9;
        double myDouble = myInt; // automatic casting : int to double. (sagdakini soldakine esitliyoruz.)(kucukten buyuge gidiyor cunku int<double.)
        System.out.println(myInt); // output 9
        System.out.println(myDouble); // output 9.0


        short numShort= 100;
        //float numFloat1 = 13.5; // it can not implicity casting because this is double.

        float numFloat = numShort;
        numFloat = 100; // it can implicity casting.

        System.out.println("numShort = " + numShort); //100
        System.out.println("numFloat = " + numFloat); // 100.0


        byte testByte = 127; //even though 127 is integer , max byte value is 127 min byte value is -128.So 127 is in the range, we wont lose any data.
        //Expilicit Casting
        double d = 10;  //we are forcing 10.0 to be 10.
        int i;
        i=(int)d;
        System.out.println("i = " + i);
        //ornek 2

        double numD=12;
        int numInt;
        numInt = (int) numD;// burada (int)numD kisminda typing order is important.(int) would effect the closest value.

        //ornek3
        double numE=12;
        int numIntT;
        numIntT = (int) (numD+10.0); //Baska degerler de ekleyeceksen donusurken yani burada 10.0 ekledik.Parentez icine alip normal matematik gibi yapabilirsin .Int dagilir carpim gibi.
        //be careful while using () !!! double+ double will return double.
        System.out.println("numIntT = " + numIntT); //numIntT= 22

        int num2=(int)10.1;
        System.out.println("num2 = " + num2); // num2= 10 in result, we lost the fractional part.would be same if it was 10.9999


        double myDouble2 = 9.78;
        int myInt1= (int)myDouble2;
        System.out.println("myDouble = " + myDouble2); //9.78
        System.out.println("myInt1 = " + myInt1);//9

        char plusOperator = '+';
        System.out.println("plusOperator = " + plusOperator);
        System.out.println ( "plusOperator = " + (int)plusOperator );
        //charda + nin sayi degerini gormek icin ne yapabiliriz ?
        // if we put (int) System.out.println("plusOperator = " +(int)plusOperator); we will get the number.
        // result would be 43. data typelarinda charin aldigi degerlere bakarsan 0- 65535 oldugunun gorursun
        //so 43 bu sayi araliginda oldugu icin , implicit castin oluyor not explicit.)!!!!


        int deneme = 43;
        char karakter = (char)deneme;
        System.out.println("karakter = " + karakter); // yukaridakinin saglamasi.!!!


       // int testValue= (double)1; //1 -->1.0 error!!
        //casting type should be same or less!!

        byte num4 = 127; // implicitly casting 127 limit.

        byte num5 = (byte) 128; //why its okay ? range was -128 to 127 .
        System.out.println("num5 = " + num5); //result is -128 why ?
        //Because byte -128 -> 127. bunun disina cikamiyor deger olarak. 127 yi gectigi zaman ,en kucuk deger olan -128 e gidiyor.
        //numara 129 olsaydi cevap -127 olacakti. 130 olsa idi -126 olacakti.
        // bir dogru dusun -128 ile 127 degerleri arasinda sinirli !!!

        // Ayni mantik short icinde gecerli. ,max short value is 32767 , onu gecersen en basa eksi en kucuk deger olan -32768 e doner.


        //Casting on Expressions

        short a=1;
        short z =2;
        short n =(short)(a+z);// it cant implicitly casting.We should cast the entire result. short c =a+b; ---> short c = (short)(a+b)
        System.out.println ( "n = " + n );

        System.out.println (" ");
        System.out.println (" ");
        //LONG FLOATING EXPRESSION    /onemli bir ornek !!!/
        byte b = 2;
        char c = '('; //equal to 40
        short s =3;
        int y= 80;
        float f = 1.5f;
        double q=1.1;
        long l = 100L;
        double result = (f*b) + (y/c) - (q*s);

        double result2= (f*b);
        long l1 = l + i; // long+ int turns long
        double v2 = d + b; //double +byte turns double

        System.out.println("result = " + result); //1.699999999999997

        float v = f * b;
        int i1 = y / c;
        double v1 = q * s;    // alt+enter yaparak local variable alabilirsin.DATA TYPE OTOMATIK OLARAK VERIYOR!!!!!!!! YUKARIDA KENDIMIZ BULMAYA CALISTIK AMA BURADA INTELLIJ YARDIMCI OLUYOR.!!!!!!


        ////////////////////////////
        byte bb=120;
        int i2= 2_000_000_000;

        //bb=bb*2; // result is integer.We cant assign byte to integer just like that.
        bb= (byte)(bb*2);
        System.out.println("bb = " + bb); //problem is fixed but solution is not 240blabla.
//ORNEK
        int pies=10,people=4;
        double piesPerson;
        piesPerson = pies/people;    //we can assign integer to double . pies integer , people integer .Int/int= int ama 2.5 diye degil 2 diye geliyo.
        //ardindan o 2 doubleye casting oluyor implicitly. 2.0 result!!
        System.out.println(piesPerson);

        int pieZ=10,peoplee=4;
        double piesPersonn;
        piesPersonn = (double)pieZ/peoplee;
        System.out.println("piesPersonn = " + piesPersonn); // 2.5 oluyor. (double) parantezinden oturu int doubleye donuyor.!!!

        int kies=10,teople=4;
        double piesPersan;
        piesPersan = kies/(double)teople;
        System.out.println("piesPersan = " + piesPersan); // aslinda icinde double varsa ve islemler gecerli ise sonuc hep double olucak cunku en buyuk data sekli.


        //last example
       // int ies=10,eople=4;
       // double iesPerson;
        //iesPerson= double (ies/eople);
       // System.out.println("iesPerson = " + iesPerson);

        // the result of an arithmetic operation using only a mixture of byte , short
        // ,or int values will always be an int.

        //if one operaond is long , float , or double the whole expresison is promoted
        //to long , float , or double respectively.


    }
}
