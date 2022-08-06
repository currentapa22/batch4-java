package com.days.day22;

public class besinci {

    public static void main(String[] args) {

        System.out.println ( sumCheck ( 30, 80 ) );
        System.out.println ( resultCheck ( 30, 40 ) );
        System.out.println ( sumOver100 ( 30, 12 ) );
        System.out.println ( dorduncuyol ( 30, 120 ) );


    }
// i will create a method and i will get two numbers will check sum of these numbers
    //if sum is bigger then 100 will return true, else false.
    //but the teacher will show us different return type.

    public static boolean sumCheck(int a, int b) {
        if ( (a + b) > 100 ) {
            return true;
            //buraya bir baska kod yazamayiz,cunku return ile kapiyi kapatmis bulunuyoruz.//unreachable line.!!!!!!!!!!!!!!
        } else if ( (a + b) == 100 ) {
            return true;//we can return value in the block
        } else {
            return false; //we can return value in the block like this example
        }

    } //THERE ARE 3 WAY TO EXIT FROM THIS METHOD ABOVE. 1.A+B>100 2.A+B==100 3.EVERYTHING ELSE

    //same operation but different way. yukaridaki ile bu asagidaki ayni amaca
    public static boolean resultCheck(int a, int b) {
        boolean result;
        if ( (a + b) > 100 ) {
            result = true;
        } else {
            result = false;
        }
        return result;  //we returned the value at the and

    }


    /////////////////////////////////////////
    //3 kod da ayni ,sadece farkli sekilde yaklasiyoruz olaya!!!!!
    public static boolean sumOver100(int a, int b) {
        boolean result = false;
        if ( (a + b) > 100 ) {
            result = true;
        } else { // else bir result=false; eklemesek de error almayiz ,missing part yok cunku asagida zaten return result var.
            //result=false demene gerek yok if its not true, its false then!
        }
        return result;

    }//we have to close all options with return type

    public static boolean dorduncuyol(int a, int b) {
        boolean result = ((a + b) > 100) ? true : false;


        return result;
    }

//NOTE;IF YOU RETURN IN THE STATEMENT YOU HAVE TO CLOSE ALL THE WAYS THAT YOU COULD RETURN A VALUE 1.EXAMPLE GIBI //OTHERWISE IT WILL GIVE ERROR
//2.VE 3. YOLLARI DA KULLANABILIRSIN ILKINDE HATA ALMA ORANI DAHA YUKSEK.



}
