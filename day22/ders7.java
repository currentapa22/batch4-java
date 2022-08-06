package com.days.day22;

public class ders7 {

    public static void main(String[] args) {
        getSumBetween ( 200, 500 );
        getSumBetween ( 1000, 1500 );
        getSumBetween ( 10, 50 );    //kodu tekrar tekrar yazmamiza gerek yok ,sadece value yi pass ediyoruz.
    boolean compare=    compareResult(50,80);//return type of this method is boolean.
        System.out.println ( "compare = " + compare );
    }

    public static int getSumBetween(int a, int b) { //a=200  b=500;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println ( "sum of the numbers between  " + a + " and " + b + "=" + sum );
        return sum;

    }


    //let's do that with while or do while loop


    public static int getSumBetweenByDoWhile(int a, int b) {
        int sum = 0;
        do {
            sum = sum + a;
            a++;
        } while (a <= b);
        return sum;
    }

    public static boolean compareResult(int a, int b) {
        int sum = getSumBetweenByDoWhile ( a, b );  //do while loop
        int sum1 = getSumBetween ( a, b ); //for loop
        boolean result = false;
        if ( sum == sum1 ) {
            result = true;
        } else {
            result = false;
        }
    return result;

    }
//Ders notu;birinci ve ikinci methodda belli sayi araliklarindaki sayilarin toplamini hesapladik
    //sonrasinda bu hesaplamayi do while loop ve for loop olmak uzere 2 farkli metodda uyguladik
    //3. method ise en onemlisi, ilk iki methodu, 3. method icinde birbiriyle kiyasladik.
    //1.ve 2. method un return type is integer.O yuzden line 37-38 de biz bu iki methodu integer variablesine baglayabildik.
    //sonra 1.ve 2. methodun resultlarini compare ettik ,sonra result i return yaptik.boolean olarak!
}
