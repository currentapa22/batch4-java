package com.days.day46_OOP_Starts;

public class Phone_5 {

    long serialNumber;

    String modelName; // instance variable

    int  objSpecific;
    static  int count;
   public Phone_5(){ // default constructor/

        count++;

    }
  /*  public Phone_5(long serialNumber, String modelName, int objSpecific){//parameterized constructor
    this.serialNumber=serialNumber;
    this.modelName=modelName;
    this.objSpecific=objSpecific;

    }
 line 16 ve 21 arasi paramatized constructor. But there is a shortcut to do that .Right click , generate, constructor, select all instance variables(not static)
 and click okay. line 26 to 29 will  be created.
*/

    public Phone_5(long serialNumber, String modelName, int objSpecific) {
        this.serialNumber = serialNumber;
        this.modelName = modelName;
        this.objSpecific = objSpecific;
    }

    public Phone_5(long serialNumber) { // ANOTHER CONSTRUCTOR METHOD WITH ONLY 1 PARAMETER! I DONT HAVE TO CHOOSE ALL VARIABLES ON THE LIST!
        this.serialNumber = serialNumber;
    }

    public void formatPhone(){
        System.out.println ("FORMAT!!!");
    }

public void resetPhone(){

    System.out.println ("RESET!!!");
}


public void updateModelName(String modelName){ //String modelName parameter -local variable
      //  modelName dedigimiz zaman parameter olani mi kastediyoruz yoksa instance variable(line 7) olani mi kastediyoruz ?
    System.out.println ( "modelName = " + modelName );
    //if we delete line 26 parameter String modelName, line 28 modelName will show instance variable.But if we have same name local variable
    //it will address to local variable.if we delete address to class variable.
    //we want to local parameter modelName and assign it to class variable modelName.But if we type modelName=modelName; both will be local variable
    // java gave us one keyword called 'this'
    this.modelName=modelName;
    //this keyword refers to  current object!! so it takes you to instance variable not parameter!!!
    //left side our instance variable, right side local variable.

}
}
