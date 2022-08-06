package com.days.day46_OOP_Starts.exercise;

public class SDET_exc {
    public static void main(String[] args) {

        SDET person1=new SDET ("Burak",25,"M","MasterCard",70000);

       person1.companyChange ( "BMW" ); // We don't have to assign this anywhere because this method will take this value and
        //asssign it to this.company yani to the object.!
        System.out.println ( "person1.company = " + person1.company );
        person1.increaseSalary ( 110000 );
        System.out.println ( "person1.salary = " + person1.salary );
        System.out.println ( "person1.isSuccessful = " + person1.isSuccessful );
        person1.isSuccessful=false;
        System.out.println ( "person1.isSuccessful = " + person1.isSuccessful );
        System.out.println ("\n/////////////////////\n");
        //thanks the constructors we can initialize values in one line and change it. thanks to this keyword so values address to objects.

        SDET person2=new SDET ("Tim",34,"M","Google",75000);
        SDET person3= new SDET ( "Alicia", 19,"F","IBM",100000 );

        //If we don't use parameterized constructor we have to assign everything one by one like this:
        SDET person4= new SDET();
        person4.name="Malgorzata";
        person4.age=35;
        person4.gender="F";
        person4.company="Meta";

        /*
        tek tek assign etmektense, one line icinde assign etmek daha kolay ve iyi bir practice.

         */


    }
}
