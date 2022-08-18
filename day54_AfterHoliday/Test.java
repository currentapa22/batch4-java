package com.days.day54_AfterHoliday;

public class Test {
    public static void main(String[] args) {

        Employee emp1=new Employee ();


        Developer dev1=new Developer ();

        dev1.empName="Murat Pasa";
        dev1.empID=10001;
        dev1.codingLang="Java";

        System.out.println ("\n////////////////////////\n");
        System.out.println ( "dev1.codingLang = " + dev1.codingLang );
        System.out.println ( "dev1.empName = " + dev1.empName );//this employee name still will be unique for dev1.
        System.out.println ( "dev1.empID = " + dev1.empID );// we dont have empID in developer class but we extended from employee class so we can reach.

        System.out.println ("\n////////////////////////\n");

        Lawyer lawyer1=new Lawyer ();
        lawyer1.empName="Jenny Tars"; //we are keeping our data separately.
        lawyer1.empID=10002;
        lawyer1.caseName="Case123";
        System.out.println ( "lawyer1.empName = " + lawyer1.empName );
        System.out.println ( "lawyer1.empID = " + lawyer1.empID );
        System.out.println ( "lawyer1.caseName = " + lawyer1.caseName );


    }
}
