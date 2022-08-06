package com.days.day22;

public class Review5ve6week {

    public static void main(String[] args) {
        int number=20;
        System.out.println ("main method");                //asagidaki methodu call yapmazsam it wont be executed.
                                            // Review5ve6week.sum(); classname.methodname();   bu da bir cagirma sekli
        sum(number,86); //ctrl click on sum, you will go to the method down there.
        //sum(20);                                      // bu da cagirma sekli
        sum(50,23);//we are only passing the value, variable name is not important    //method ile ayni tur variable olmasi gerektigi icin deger verdik yukarida.
                                                       //bunu yapmak yerine ustte bir int number=20;  --> sum(number) yapabiliriz
        System.out.println ("after method");

    }
                                                             //lets create a method
                                                            //can creatable inside the class but outside main method.
    public static void sum(int a,int b){  //signature this whole line name is header
        // public is access modifier       //birden fazla parameter olusturabilirsin parentez icinde
                                            // int a ,String" ",int b
        //{icerisine}body deniyor
        System.out.println ("Hello world");
        System.out.println ( "a = " + a );
        System.out.println ("b = "+ b );


    }





}
