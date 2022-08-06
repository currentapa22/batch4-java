package com.days.day53;

public class Review_1 {//Encapsulation review basladik. Slayti okuyarak.

    //Encapsulation is a concept in Java that brings related-code together and wraps it as a single unit.It is a way of keeping things together that are closely related to each other.
    //Encapsulation is a mechanism of wrapping the data(variables ) and code acting on the data (methods ) together as a single unit
    //These variables and methods are related to each other in some way.

    /*
    In encapsulation , the variables of a class will be 'hidden' from other classes, and can be accessed only through the methods of their current class.
    An object hides its internal data from code that is outside the class.
    Only the class's methods may directly access and make changes to the object's internal data.
    The whole idea behind encapsulation is to hide the implemantation details from users.
    Therefore , it is also known as "data hiding"
     */

    /*
    How to achieve Encapsulation?
    1. Declare the variables/objects of a class as private.
    2.Provide public getter and setter methods to modify and view the variables/objects values.//getter and setter methods should be accessible from everywhere(public modifier)
     */

    /*
    Access modifier:
    1.private= When the private access specifier is applied to a class member, the member can not be accessed by code outside the class.
    The member can be accessed only by the methods that are members of the same class.
    2.Public= When the public access specifier is applied to a class member , the member can be accessed by code inside the class or outside.
     */
/*
public class SimpleGetterAndSetter{
private int number;  // private= restricted access

//Getter
public int getNumber(){
return this.number;
}

//Setter
public void setNumber(int num){ // we have to put parameter.
this.number=num;
}
 */

/*
Benefist of Encapsulation
-A class can have total controol over what is stored in its fields.
-To have better access control over the members who are encapsulated.
-Helps us organize code in a better and understandable manner.
-Reduces the complexity of managing the code.
-Decouple the code
-Increases readability.
-The fields of a class can be made read-only or write only.
 */
/*
Read Only Class: We achieve a read only class by providing only GETTER methods inside.
Write Only Class: We achieve a write only class by providing only SETTER methods inside.
 */



}

