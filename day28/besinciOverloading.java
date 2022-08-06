package com.days.day28;

public class besinciOverloading {
    public static void main(String[] args) {
    String name="Michael";
    print();
    print(name);
    print(12);

    }

    public static int  print() {
        System.out.println ("Hello java");
        return 5;

    }
    public static void print(String str) {
        System.out.println ("Hello "+str);

    }
    public static void print(int number) {
        System.out.println ("number is "+ number);

    }
    public static void print(String str,int number) {
        System.out.println ("String and number "+str +number);

    }

    public static void print(int number,String str){
        System.out.println ("Number and String "+ number +str);

    }

}
