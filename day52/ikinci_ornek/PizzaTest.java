package com.days.day52.ikinci_ornek;

public class PizzaTest {
    public static void main(String[] args) {

        Pizza pizza1= new Pizza ();
        pizza1.pizzaSlices=5;

        Pizza pizza2=new Pizza ();
        pizza2.pizzaSlices=7;

        Pizza pizza3=new Pizza ();
        pizza3.pizzaSlices=10;
        System.out.println ( "pizza1.pizzaSlices = " + pizza1.pizzaSlices );
        pizza1.eating ();
        pizza1.eating ();
        System.out.println ( "pizza1.pizzaSlices = " + pizza1.pizzaSlices );

        System.out.println ( "pizza2.pizzaSlices = " + pizza2.pizzaSlices );
        System.out.println ( "pizza3.pizzaSlices = " + pizza3.pizzaSlices );
        pizza2.eating ();
        pizza3.eating ();
        //how many slices are there for each pizza ?
        System.out.println ( "Pizza.familyPizzaSlices = " + Pizza.familyPizzaSlices ); // 16 oldu cunku bu ortak pizza , her seferinde eating methodu cagirdigin zaman -=1 olucak.

        System.out.println ( "PizzaShop.buyPizza ( 0 ) = " + PizzaShop.buyPizza ( 0 ) );// buyPizza static method , class da static.We can call this method by class name.
        Math.max ( 3,5 ); // if the method is static, we can call by using class name !!
        System.out.println ( "PizzaShop.buyPizza ( 2 ) = " + PizzaShop.buyPizza ( 2 ) );

        System.out.println ( "PizzaShop.totalsoldPizza = " + PizzaShop.totalsoldPizza );
        System.out.println ( "PizzaShop.buyPizza ( 3 ) = " + PizzaShop.buyPizza ( 3 ) );
        System.out.println ( "PizzaShop.totalsoldPizza = " + PizzaShop.totalsoldPizza );
    }
}
