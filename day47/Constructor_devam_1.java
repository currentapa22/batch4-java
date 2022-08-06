package com.days.day47;

public class Constructor_devam_1 {
    int idNumber;

    String name;

    int refValue;

    boolean isActive;

    char code;


    /*Constructors Chaining
Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Chaining can be done using this() keyword.   [this and this() is not the same!!!!!!!!]
this() keyword should always be the FIRST line of the constructor.!!!!*/

    public Constructor_devam_1(){                              //how we can call first constructor from second constructor ? this() keyword on method 2
        System.out.println ("default constructor");
    }
                                                                //when we use this() be careful to not create a infinite loop. like don't put line 25 this(25,"Burak") ,if
                                                                //you do that it goes 3.method and third method line 32 has this(20) again so it will jump back second constructor
                                                                // and second constructor first line (25,"Burak") so it goes third one  , so goes on.... Be careful!
    public Constructor_devam_1(int idNumber){
        this();                                 // this() keyword calls first constructor method on line 20
        this.idNumber=idNumber;
        System.out.println ("1 parameter constructor");
    }

    public Constructor_devam_1(int idNumber,String name){
        this(20);                   // this(20) keyword has an argument in it, so it will call second constructor line 24.
        this.idNumber=idNumber;
        this.name=name;
        System.out.println ("2 parameters constructor.");

    }








    static int count;// i cant use static object in constructor method, it's belongs to the class not object
    public Constructor_devam_1(int idNumber, String name, int refValue, boolean isActive, char code) {
        this.idNumber = idNumber;
        this.name = name;
        this.refValue = refValue;
        this.isActive = isActive;
        this.code = code;
    }


    //its possible to overload constructor method slayt sayfa 8.
    public static void main(String[] args) {

    //    Constructor_devam_1 test1= new Constructor_devam_1 ( 1,"test1", 10001, true,'T' );

//        System.out.println ( "test1.name = " + test1.name );

       // Constructor_devam_1 obj1=new Constructor_devam_1 ();
        Constructor_devam_1 obj2=new Constructor_devam_1 (1001,"Husit"); // it follows to order !!!!!

    }
}
