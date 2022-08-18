package com.days.day54_AfterHoliday;

public class Inheritance_1 {
    /*Java provides inheritance system so we can keep all similar functions together.When we type common methods , we will
    we will create a connection so we will access easyly.This connection called inheritance basically.We will explain again but this is the
    simplest way to explain.
    As an advantage we don't have to create common features again and again.

    Some keywords i need  to know , slayt sayfa 9 .   Employee is a SUPER or PARENT or BASE class and Developer is SUB or CHILD or DERIVED class

    Super Class:The class whose features are inherited is known as super class(or a base class or a parent class)
    Sub Class: The class that inherits the other class is known as sub class (or derived class or child class).The sub class can have
    its own fields and methods in addition to the superclass fields and methods.
                          (child class) (Inheritance keyword)  (Parent class)
    Syntax: public class  Developer         extends             Employee{
    }


     */

    /*
    What is inherited?
    -All public variables and method can be inherited
    -All protected variables and methods can be inherited.
    -All default variables and methods are inherited only if super class and sub class are in the same package.

    -Private variables and methods can not inherited.But it is accessible using public getter/setter methods.
    -Constructors can not be inherited.

     */


    /*
    TYPES OF INHERITANCE

    Single Inheritance: Subclasses inherit the features of one superclass.
    Multiple Inheritance : Multiple Inheritance is a feature of an object-oriented concept, where a class can inherit properties of more than
    one parent class.
    -Java doesn't support Multiple Inheritance.

    Multi Level Inheritance: Subclass will be inheriting a SuperClass and as well as the subclass also act as the SuperClass to the other class.
    Hierarchical Inheritance: Once class serves as superclass for more than one sub class.// slayt 15
     */

    /*
    Superclass's Constructor
    -In an inheritance relationship, the superclass constructor always executes before the subclass constructor.
     */


}
