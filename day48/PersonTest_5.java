package com.days.day48;

public class PersonTest_5 {
    public static void main(String[] args) {
        Person_4 person1=new Person_4 ("John",1990);
       // System.out.println ( "person1.name = " + person1.name );
       // person1.name="Kobe";  //we can change value of properties
       // System.out.println ( "person1.name = " + person1.name );  //okay i cant reach but i can call the method and reach :)


        // i can reach but i can't change!!!   I can't assign this value to a string variable because getName method returns nothing(void return type)
        person1.getName ();
        //but if i change the return type i can assign it to a string variable.Up to the return type i can assign it to a variable
        System.out.println ( "person1.getName () = " + person1.getName () );


        Person_4 person2=new Person_4 ( "Henry",1980 );
        System.out.println ( "person2.getName () = " + person2.getName () );

        // i can't reach age property directly but i can reach getAge method
    int person1Age=person1.getAge ();
    int person2Age=person2.getAge (); // this method return int variable so i can assign it to an integer


    }
}
