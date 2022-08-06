package com.days.day52.ikinci_ornek;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaShop {
int a;

static ArrayList<String > pizzaKinds=new ArrayList<> ( Arrays.asList ("Cheese Pizza", "Veggie Pizza" ,"Pepperoni pizza",
"Margherita Pizza"));
// i can declare arraylist as static as well.
static int totalsoldPizza; // how many pizza sold in this shop.
    public static String buyPizza(int index){ //made this method static because we want to call this method by class name.
        if(index<pizzaKinds.size() && index>=0){
            totalsoldPizza++;
            return pizzaKinds.get ( index );
        }else{
            return pizzaKinds.get(0);
        }

    }









}
