package com.days.day51;

public class get_set_last_explanation {

 private String name;
 private int brthYear;
    String city;
    int age;

public void setName(String name){
    this.name=name;
}

public String getName(){
    return this.name;
}

public void setBrthYear(int birthYear){
    if(birthYear<1950 || birthYear>2022){
        System.out.println ("Give a valid age");
    }else{
        this.brthYear=birthYear;
    }

}

public int getBrthYear(){
    return this.brthYear;
}








}
