package com.days.day47;

public class Student_kendi_kodum {

    //        UPDATE Class Student according to these requests
    // If we need to create a student, we have to provide a id number or id number+ name !!
    // Please keep totalStudent number separately , print after each registration!!
    // After registration complete, please make sure this student is active!!

    //Review Student class again , use chaining , try to reduce redundant code
    long studentId;

    String name; // instance variable

    int age;

    boolean isActive;

    static int totalStudent; // class level variable or global variable called. belongs to class not object!!!!!




    public Student_kendi_kodum(long studentId) { // constructor method overloading..
        this.studentId = studentId;
        totalStudent++;
        System.out.println ( "Total student number: "+totalStudent );
        this.isActive=true;
    }

    public Student_kendi_kodum(long studentId, String name) {
        this(studentId);// constructor chaining here. it goes line 24 and does everything in that method , turns back here and does everything in here as well.
        this.name = name;
        System.out.println (totalStudent+". student's name :" + name );


    }

    public static void main(String[] args) {

        Student_kendi_kodum studentKendikodum1 =new Student_kendi_kodum (1001);

        Student_kendi_kodum studentKendikodum2 =new Student_kendi_kodum (1002); // java will understand from the argument its given to which constructor method we meant.

        Student_kendi_kodum studentKendikodum3 =new Student_kendi_kodum (1003,"Burak Simsek");


        Student_kendi_kodum studentKendikodum4 =new Student_kendi_kodum (1004);

        Student_kendi_kodum studentKendikodum5 = new Student_kendi_kodum ( 1005,"Ayse Kiraz" );
        Student_kendi_kodum studentKendikodum6 = new Student_kendi_kodum ( 1006,"Musa Kral" );










    }
}
