package com.days.day53;

import java.util.ArrayList;

public class JavaSchool_2 {

private int studentId; // it should be unique for each student.
    //Parent can see it, but shouldn't change it.                  // only getter method i should create then!
    //Admin members able to change it via password.!!



 public String parentEmailAddress; //Parent can see it , should be able to  change it !!

   private String studentFullName;//Parent can see it but should not change it directly

   private String parentFullName; //Parent can see it , should not be able to change it directly. !! Parent can change only with extra permission.

 private double seasonGrade;//Parent can see it but should not change it.  It will be automatically calculate from the grade system.

   private int absentDays;//Parent can see it but should not change it.It will automatically calculate from the system  //READ ONLY DATA!


  private ArrayList<String> privateNotes=new ArrayList<> (); //Parent should not see and change them!!.

  private static int studentCount=1000;  //no getter no setter.   // we wanted our student numbers should start four digits.



    public JavaSchool_2(  String studentFullName,String parentEmailAddress, String parentFullName) {   //constructor.
        studentCount++;
        this.studentId = studentCount;
        this.parentEmailAddress = parentEmailAddress;
        this.studentFullName = studentFullName;
        this.parentFullName = parentFullName;

        System.out.println ("Total student number: "+ (studentCount-1000));
        System.out.println ("Welcome our JAVA School!!");
    }
//      GETTER:

    public int getStudentId() {
        return this.studentId;
    }


    public String getStudentFullName(){
        return this.studentFullName;
    }

    public String getParentFullName() {
        return parentFullName;
    }

    public  double getSeasonGrade(){
        return  this.seasonGrade;
    }

    public int getAbsentDay(){
        return this.absentDays;
    }




    // SETTER:

    public void setStudentId(String password,int studentId){     //admin can set with password.
        if(password.equals ( "admin" )){

        this.studentId=studentId;}
        else{
            System.out.println ("You are not authorized to set student ID!!");
        }
    }


    public void setStudentFullName(boolean permission,String studentFullName){
        if(permission){
            this.studentFullName=studentFullName;
        }else{
            System.out.println ("You are not authorize to set student name!!");
        }
    }

    public void setParentFullName(String parentFullName,boolean permission) {

        if(permission){
            this.parentFullName=parentFullName;
        }else{
            System.out.println ("You are not authorize to set student name!!");
        }
    }


}

