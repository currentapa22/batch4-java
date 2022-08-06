package com.days.day6;

public class Precedencelastpartoftoday {
    public static void main(String[] args) {
        //Precedence = islem onceligi demek

        System.out.println(100 + 20 / 4);
        System.out.println(500 -100 * 2 );
        System.out.println(100 * 20+40 / 4);

        int result= 100 * 20+40 / 4;
        System.out.println("result = " + result);

        //if the result is 1 ,the number is odd.(egzersizlerde cikar)
        System.out.println(99%2);//result would be 1 so 99 is odd.
        System.out.println(100%2);//100 is even

        //Parantez onceligi gecerli!!! compiler oncelikle parantez icini isleme koyuyor.
        int result2= 100 * 20+40 / 4 - 2;
        System.out.println("result2 = " + result2);
        int result2paranthesis= 100 * (20+40) / 4 - 2;
        System.out.println("result2paranthesis = " + result2paranthesis);

        String name= "Benzema ";
        String action=" is playing";
        String team = " in Real Madrid";
        String match = name + action + team;//local variable we assigned here
        System.out.println(name + action + team);
        System.out.println(match);

        System.out.println(name + 3 + 6); //result is Benzema 36 because name is a string and double quote makes the line
        // string so 3 ile 6 yi toplamiyoruz yan yana yaziyoruz string kabul edip.

        System.out.println(name + 7 * 3 * 9); //Benzema 189
        String real= name + false;
        System.out.println(name + false );
        System.out.println("real = " + real);

        //System.out.println(false + 20 ); this doesnt make no sense for compiler. give errors.


    }

}
