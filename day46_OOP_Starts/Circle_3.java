package com.days.day46_OOP_Starts;

public class Circle_3 {

    double radius;

    //there is a constructor method we don't see but lets create one!

    public Circle_3() {    //there is NO RETURN TYPE !!!!!!!!!  constructor methods aim is initialization, not returning a value!
        System.out.println ( "It is const method!!!" );//constructor method name has to same with class name
        System.out.println ( "Your Object is ready now" );//its created automatically by Java.// you can do anything with this method but main purpose of this method is initialization.
        radius = 1; // I also can initialize class level variable in this constructor method.!
    }



    public double getArea(){

        return Math.PI*radius*radius;
    }

public double getPerimeter(){
        return 2*radius*Math.PI;
}

public void setRadius(double newRadius){
        radius=newRadius;
}




}
