package com.days.day53;

public class Static_Review_4 {
    /*
    -In Java , static members are those which belongs to CLASS! and you can access there members without instantiating the class.
    -The static keyword can be used with methods , fields, classes(inner/nested), blocks.
    -A static variable is shared by all objects of the class.
    -We'll create only one instance of that static member that is shared across all instances of the class
    -From the memory perspective , static variables are stored in the heap memory.
     */


    /*
    -A static variable is associated with class instead of instance/object of the class.
    -Class variables also known as static variable are declared with the static keyword in a class, but outside a method,
    constructor or a block
    -Static variables can't be declared withing a method /constructor or within a block of code.IT MUST BE DECLARED ON CLASS LEVEL!
    -You can create a static field by using the keyword static. The static fields have the same value in all the instance of the class.These are created and initialized when the
    class is loaded for the first time.
    -There would be only one copy of each class variable per class, regardless of how many objects are created from it.
    -Initialization of static variable IS NOT MANDATORY.Its default value is depending on the data type of variable.

    Syntax= static dataType variableName= value;

    Notes; Since static var. belong to a class , we can access them directly using class name. So we don't need any object reference.
    -We can only declare static variables at the class level!!!!!
    -We can access static fields withoud object initialization.

     */

    /*
    STATIC METHODS
    -You can create a static method by using the keyword static. Static methods can access only static fields, methods.To access static methods there is no need to
    instantiate the class, you can do it just using the class name as
    -Similar to static fields m static methods also belong to a class instead of the object.So we can call them withoud creating the object of the class in which they reside.
     */

    /*
    Notes:
    -Static methods can't use this or super keywords.
    -Instance methods can diretly access both instance methods and instance variables.
    - Instance methods can also access static variables and static methods directly.!!
    -Static methods can access all static variables and other static methods.!!
    - Static methods can't access instance variables and instance methods directly.They need some object reference to do so.!!
     */



    int num;     // instance variable
    static int count;   // static variable- class var.

    static SchoolTest_3 test;     //object

    public Static_Review_4(){
        System.out.println ( "count = " + count );
        count=2;
        test=new SchoolTest_3 ();
    }

    public static void main(String[] args) {
        // num=1;//error     // non static field can not be referenced from static content
        count=1; // static field can be referenced from static method
    }


    public void test(){
        count=2;  /// static field can be referenced from non- static method as well!!!
        num=1; // no error , non static method , non static field . No problem!
    }

}
