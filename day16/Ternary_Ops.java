package com.days.day16;

public class Ternary_Ops {

    public static void main(String[] args) {

        //ternary ops is a type of java conditional operator.
        //it is used to evaluate boolean expressions
        //the operator decides which value will be executed/assigned depends on boolean exp.

        // "?" operation performs when condition is "true"
        // ":" operation performs when condition is "false"

        // syntax :    (condition) ? expression1 : expression2
        //this like if-else but we are typing in one line!

        // after ? we have to put the true , after : we have to put the false exp.

        //assume that they are not equal for now.
        int num1 = 2;

        int num2 = 1;

        String result = "";

        result = (num2 < num1) ? result = "num1 is bigger" : "num2 is bigger!"; //this expression will return one of these expression.(parantez ici boolean ama return string)
        //System.out.println(num2 < num1) ? result= "num1 is bigger" : "num2 is bigger!"; // boyle de yapabilirsin.

        System.out.println ( "Result = " + result );

        //return type is depends on the expression we put , might be integer,string vs.

        if ( num2 < num1 ) {
            result = "num1 is bigger";
        } else {
            result = "num2 is bigger";
        }
        System.out.println ( "Result = " + result );

        // iki ornek de birbirinin aynisi , sadece farkli tip operator kullanip yaptik.!
        // yukaridaki 1 line de bitti but if ornegi 5 satir suruyor.
        // ilki daha okunakli!


        int x, y;
        x = 20;               //for ternary ops we have 3 operator,1. ==(condition) ,2. ? ,3. :
        y = (x == 1) ? 61 : 90; // y gets 90 because condition is wrong.
        System.out.println ( "Value of y is: " + y ); //y=90
        y = (x == 20) ? 61 : 90; // condition is true , so y gets 61
        System.out.println ( "Value of y is: " + y );

//    y= (x==1) ? 61: 90;     normalde syntax de en sondaki ; yok ama y= dedigimizde
        // operator kullaniyoruz o yuzden line i bitirmek icin ; koyuyoruz.

        //2.ders

        // String result2 = (num1>=0)? "Num1 is positive" : -1 ;

        System.out.println ( 1 > 0 ? 1 : "ooo" );    //one side is integer , other side is string, bir satir yukarida hata veriyordu
        //cunku variable type is String but -1 is not string. hangi exp.'nun dogru oldugu farketmez, string e integer verince hata verir!.


        // whatever you want , you can type in ternay ops but if you assign it to a variable, expressions must have the same variable type.!!!


        System.out.println ( num1 > num2 ? num1 : num2 );

        //num1>num2 ? 1 :1.0 //can you assing any kind of variable? exp 1 integer, exp 2 double.
        // we can assing it to double, so integer value going to casting (implicitly)

        double num3 = num1 > num2 ? 1 : 1.0;

        // When to use it ?
        //Ternary operator makes the code much more easy, readable, and shorter.
        //It can be used to replace the if...else statement in certain situations
        //Note: Every code using an if-else statement cannot be replaced with a ternary operator.


        int number49 = 24;
        String resultt = (number49 > 0) ? "Positive number " : "Negative Number";
        System.out.println ( "result = " + number49+" " +resultt );


        //Note: Every code using an if-else statement cannot be replaced with a ternary operator
        //it is not recommended to use nested ternary operators. This is because it makes our
        //code more complex.

        //int n1=12 , n2= 9 ,n3=-14;
        //nested ternay ops to find the largest.
        //int largest = (n1>n2) ? ((n1>n3) ? n1 : n3) : ((n2>n3)) ? n2 : n3);
        //System.out.println ( "largest = " + largest );
        //slaytta 12. sayfa    n3 biggest.


        //Similarity       ternary ops vs. If else
        //1.Both if-else and ternary operator are used to evaluate Boolean
        //expressions

        //Difference
        //1.Ternary Operator is a programming statement, If-Else is a programming block
        // {

        //}  buna block deniyor.if-else has code block.Ternary working with statements.

        //Ternary Ops is faster than If-Else. Bazen interviewde soruyorlar.

        //Ternary Operator is more useful for initialisation of variables
        //than If-Else    // Because we use it one line , and easier to write actually.

        //Ternary Operator is more readable than If-Else

        //For Nested versions; it is vice-versa If-Else is more readable than Ternary Operator

       //task1
        int a=3329831;

        String sonuc="";

        sonuc=(a %2 == 0) ? "value is even " : "value is odd";
        System.out.println ( "The " + sonuc + a);

        //task2 //nice job.
        int limit=50;
        int b = 80;
        int score = -500;
        int c = 45;

        String mark="";
        mark=(c>limit) ? b +" and you passed":  c +" and you failed.You need " +(50-c)+  " more points to pass the exam";
        System.out.println ( "Your mark is " + mark );

        //ayni soruyu konusmaya devam ediyoruz.02:10:40
        String failOption= "failed. You need " + (50-score) +"more points to pass the exam";
        String resultScore="";
        resultScore = score <50 ? (score<0 ? " Wrong score!!" :failOption ) : "passed";



        String name="Hi Ahmet Yilmaz you are ";
        String second2= " selected as QA Engineer";
        int agelimit=18;
        int realage=14;
        String solution="";
        solution= realage>agelimit ?(name+second2 ) : (name +" not" + second2);
        System.out.println ( "Sonuc = " + solution );



        String triangle="";
        int z=3;
        int q=4;
        int n=5;
        triangle= (z+q>n && q+n>z && n+z>q) ? "zqn triangle is valid" : "zqn triangel is not valid";
        System.out.println ( "This" + triangle );

        int say1=1;   //sayilari toplayinca birbirini verip vermedigini kontrol ediyoruz.
        int say2=2;
        int say3=3;
        String uclu="";
        uclu = ((say1+say2==say3) && (say1+say3==say2) || (say2+say3==say1)) ? "true" : "false";
        System.out.println ( "uclu = " + uclu );





    }
    }


