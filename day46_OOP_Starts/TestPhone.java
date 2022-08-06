package com.days.day46_OOP_Starts;

public class TestPhone {

    public static void main(String[] args) {
 //create few objects and we want to see how many object we created.
       Phone_5 phone1= new Phone_5 ();
        System.out.println ( "phone1.modelName = " + phone1.modelName );
        phone1.serialNumber=233434343;
        System.out.println ( "phone1.serialNumber = " + phone1.serialNumber );
        phone1.modelName="Nokia";
        System.out.println ( "phone1.modelName = " + phone1.modelName );
        phone1.updateModelName ( "Sony" );// this keyword alinan bu degeri objecte gonderiyor.!!
        System.out.println ( "phone1.modelName = " + phone1.modelName );//expected output Sony

        Phone_5 phone2= new Phone_5 ();
       phone2.serialNumber=9782739;
        System.out.println ( "phone2.serialNumber = " + phone2.serialNumber );

        Phone_5 phone3= new Phone_5 ();
       phone3.serialNumber=000022112;
        System.out.println ( "phone3.serialNumber = " + phone3.serialNumber );

        Phone_5 phone4= new Phone_5 ();
       phone4.serialNumber=342231232;
        System.out.println ( "phone4.serialNumber = " + phone4.serialNumber );

        Phone_5 phone5= new Phone_5 ();
       phone5.serialNumber=53524529;
        System.out.println ( "phone5.serialNumber = " + phone5.serialNumber );

        //how can i access count from here?
        System.out.println ( "We have  " + Phone_5.count+" in our store!!" );//count is static variable , so we call it with class name

        //Can we access static variables via objects ? // interview question
        System.out.println ("Total Phone object number is : "+ phone1.count); // even though after phone1. we don't see count , we still can use it !!! not good practice but possible.
                                                                                // even though we didn't use Class name(Phone_5) instead of phone1, result will be still same because count is static variable!!!!

        System.out.println ("\n///////////////////////////////////////////////\n");
        System.out.println ("\n///////////////////////////////////////////////\n");
        System.out.println ("\n///////////////////////////////////////////////\n");

        Phone_5 sony123=new Phone_5 ();
        sony123.serialNumber=10004;
        sony123.modelName="SkyBlue";
        sony123.objSpecific=12;


        Phone_5 sonyBlueSky=new Phone_5 (10005,"BlueSky2",16);// we called our parameterized constructor.
        System.out.println ( sonyBlueSky.serialNumber );//expected 10005 , output 10005. Parameterized constructor helps us to create an object and initialize it in one line!!

        System.out.println ("\n///////////////////////////////////////////////\n");

        Phone_5 mi6=new Phone_5 (22222);
        System.out.println ( "mi6.serialNumber = " + mi6.serialNumber );


    }
}
