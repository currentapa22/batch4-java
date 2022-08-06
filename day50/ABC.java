package com.days.day50;

public class ABC {
    int a;
  private  int b;
    String c;
    Add_1 ad=new Add_1 (); // if i create object from here , instead of methods down, i can use it for each of the methods.
    ABC(){

    }

    ABC(int a ){
    this.a=a;
    }

    public int getB() {
        return b;
    }

    public void callAMethodFromOtherClass(int num,int num1){

        ad.getSum1 ( num,num1 );
    }

    public void toString1() {
        System.out.println ( "a=" + a + ", b=" + b + ", c='" + c + '\'' + '}');
    }
}
