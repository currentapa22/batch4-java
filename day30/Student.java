package com.days.day30;

public class Student {
//these  4 parts called fields.
    String name;//instance variable   //every students has these 4 properties so its called COMMON PROPERTIES.
    String surname; // we haven't assigned value yet but when we create object we will.
    int number;
    int birthyear;
    static String schoolName="London College";// static keyword koyunca , kac tane ogrenci olursa olsun hepsi ayni okula gidiyorlar demektir.
    //this static schoolName belongs to the Student class.it wont change for different objects.Sabit!
    //In general static variables named class variables because static variables are belong to class.
    //if the variable is instance variable , i can directly reach it from method.

//these properties declared in the class but out of the methods.!!
//each value we will give belong to OBJECT! and each value will be DIFFERENT!
//--Instance variable in Java is used by Objects to store their states. Variables that are defined without the STATIC keyword
// and are "Outside any method declaration" are Object-specific
//  and are known as instance variables.
//if a variable is static , you will see the keyword static.(if its not its instance variable)


//yukaridaki 4 variableyi initialize etmeden de System.out.println () icinde yazdirabilirsin cunku herhangi bir
//methodun icine dahil degil!

//these methods belongs to object so an object can reach these methods.

    //instance method (non static)
    public void studying(){

        System.out.println (name+" "+surname+ " student is studying.");

    }
//instance method (non static)
    public void sleeping(){
        System.out.println ("number = "+ number);
        System.out.println ( "name = " + name );
    }

    //lets create a static method and see what is the difference.
    public static void studentSport(){
    //can't reach instance variables inside a static method.
    //we can only reach static variables
        System.out.println ( "schoolName = " + schoolName );
    }
  //static methods and static variables belongs to class.

//we will print information of the students
    public void studentInfo(){// instance method(non static) we can reach instance variables)
        System.out.println ("Student info"); //all of them instance variables.
        System.out.println ("name = " +name);
        System.out.println ( "surname = " + surname );
        System.out.println ( "number = " + number );
    }






}
