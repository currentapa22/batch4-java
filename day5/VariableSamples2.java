package com.days.day5;

import java.sql.SQLOutput;

//5.gunun videosunun calisma kagidi bu. Java_Day5_VariablesDataTypes - 2.pdf
public class VariableSamples2 {
    public static void main(String[] args) {


    double pi, conversionRate, temprature;

    long salary;

    boolean isOn;

    char c;

    pi = 3.14159;

    isOn = false;

    c = 'A';

    salary = 34000;

    isOn = true;


    double taxRate = 12.34;
    String name = "Talha";
        System.out.println("The tax rate is " + taxRate + " and payer name is " + name);

        boolean isTrue;

        isTrue = true;

        boolean isJavaCool = true;

        System.out.println(isJavaCool);

        //STRING
        //" " is the main thing for string.Whatever you type in the "" would be printed.

        String namee = "Burak Simsek";
        System.out.println(namee);
        
        String chars = "$ 90.000 per year!!";
        System.out.println(chars);
        //normalde sout kisa yolu ile println yi elde edebiliyorsun.
        // Ama soutv yaptigin zaman bir sira asagidaki gibi sonuc elde ediyorsun.adini da ekliyor .
        System.out.println("chars = " + chars);


        //question
// soutv kullanarak hangisini sececegini listeden gorebiliyorsun.Denemek icin altina soutv yapabilirsin.
        int numberOne_int= 1;
        double numberOne_Double = 1.0;
        String numberOne_String = "1";
        System.out.println("numberOne_Double = " + numberOne_Double); //1.0
        System.out.println("numberOne_int = " + numberOne_int); //1
        System.out.println("numberOne_String = " + numberOne_String); //1

        System.out.println( numberOne_int + numberOne_int); //2
        System.out.println(numberOne_String + numberOne_String); // 11 //
        System.out.println(numberOne_Double + numberOne_Double); //2.0


        String address= "22/b bakers street London";
        System.out.println("address = " + address);

        ////////////////////// THE CHAR DATA TYPE/////////////////////////////
        //A char variable stores a single character from the unicode character set. Its a primitive data type.
        // A variable of the char data type can hold one character at a time
        // Character literals are enclosed in ( this is important!!!) single quotation marks ('A)
        //String data type has " " (double quotation marks) a char has '' single.

        char semicolon = ';' ;   //char is the keyword for the data type character.
        System.out.println("semicolon = " + semicolon);

        char alpha = 'A'; // you cant even add a space before or after it because
        // we said it can holds one character at a time!!
        System.out.println("alpha = " + alpha);
        //you need to use single quotation marks


        //slaytta 15 ve 16.sayfada unicode aciklamasi var.Okumali ve anlamali! (day 5 pdf)
        char number1= 49;
        System.out.println("number1 = " + number1);  //decimal numbers has a value in character numbers ,slayt sayfa 16.
        // character only hold 1 value so  eventhough we input 49 , it will turn to value on the chart for character data type
        // which is 1.
        
        char number2= 65;
        System.out.println("number2 = " + number2); //65 is equal an A in the chart.

        char number3= 923;
        System.out.println("number3 = " + number3);

        char number4= 79;
        System.out.println("number4 = " + number4); // there are thousands of symbols but my computer doesnt have them in the system
        // thats why question marks popping when you compile.

        //we will explain later but null and empty is not the same.Null is nothing . But empty is something created but empty in it.
        //bazen mulakatta sana satirlarca veri veriliyor ve aralarindan sayilari ya da harfleri bulman ve bir araya getirmen gerekiyor.
        // Sayilari bulmak icin decimal number sistemini kullanabilirsin.

        // SLATY SONU ALISTIRMALARI 5
         String bame= "Talha", surname;  //is valid.i dont have do give value , i can just declare without value.

        int num1;int num2; // is valid.
        //int num3;num4; // is not valid because semicolon closed the line already.Java doesnt know the num4 data types.
        boolean flag1,flag2; // is valid . you can put multiple variables in one line unless you use semicolon.and they should be same type
        //double tax1,double tax2; //is not valid .You should put semicolon.or delete second double.

        //Constant Variables- final keyword----------------------

        //The final keyword can be used in a variable declaration to make the variable a named constant.
        //Named constants are  initialized with a value, and that value can't change during the execution
        final int Days_in_weeks = 7;
        final double pisayisi = 3.14;
        final String who_is_right="My wife";


        //you can use keyword 'final' with all the variables.

        int length=12;
        int width = 9;
        int height= 4;
        int volume= length* width*height;
        System.out.println ( "volume = " + volume );


    }

}
