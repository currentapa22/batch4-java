package com.days.youtube.assignment1;

public class Assigment_1 {
    String name;
    String surname;
    String gender;
    String role;
    int exp;
    static String company="MasterCard";

   public void memberStatus(){
       System.out.println (name+" "+surname+"(" +gender + ")"+",has been working at "+ company+" "+ " with "+ exp+ " years experience"+" as "+ role);

   }

}
