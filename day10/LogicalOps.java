package com.days.day10;

public class LogicalOps {
    public static void main(String[] args) {

  // && = logical and     || = logical or   !=logical not.
  // &&= true only if both expression1 and expression2 are true
        int a = 10;
        int b = 20;
        int sum= 30;
        System.out.println(a>b); // this operator gives us boolean value which is false.
        System.out.println(sum>b); // return boolean,30>20 so its true.
        System.out.println(a<sum); // its true.
        System.out.println(a<sum && sum > b);// expression 1 and expression 2 are both true.Result true.


        System.out.println("and operator " +(a > b && b<sum)); //exp1 is false , exp 2 is false .Both has to be true in order to get true.False !

    // || = logical or operator. true if either expression1 or expression2 is true.
        System.out.println(a<sum || sum>b); //expression1=true, expression2= true.Result true.
        System.out.println(a>b ||b<sum); //expressiion 1 =false, expression 2 = true.Result true.

        System.out.println( sum >a && a >b );//false .exp1 true, exp2 false
        System.out.println(sum >a || a>b); // true. exp 1 true, exp2 false.

        System.out.println(sum<a & ++a>b); // && yerine & de kullanabiliriz ama arada bir fark var.If there is  single & , java checks both side of operation,&& if the first false
        //wouldn't check the second value!
        //                 30<10 &   10>20
       //a will be 11 now.
        System.out.println("a = " + a);
        System.out.println(sum<a && ++a<b);
        System.out.println("a = " + a);//what is the value of a ?
        //when we use double and operator java is checking first expression.
        // If the first exp. is not true java wouldn't check rest.
        //but if we use single and op. java would check both side.
        //in general we use && .


        //a =11
        System.out.println(sum>a | ++a<b);
        //                  30>11 | a<20
        // we used | single or operator .if the first side is true its true.
        //a will be ? even thoug first side is true ,
        // compiler still run exp2 and a will get +1
        System.out.println("a = " + a);

        System.out.println(sum<a || ++a<b);
        //                  30<12 || ++a<20
        //                  false ||  true
        //                  true a is 13
        System.out.println("a = " + a);
        System.out.println(sum<a && ++a<b);
        //a is ?
        System.out.println("a = " + a);

        // for and ope. to get true, both sides gotta be true and java checking first exp and if its false , java wouldn't check exp2.
        //a is still 13 because java didnt go that far yet.

        //example

        boolean expression1  = sum< a;
        boolean expression2 = ++a < b;
        boolean result = sum<a && a<b;
        System.out.println("a = " + a);

        System.out.println("result = " + result);
        //its possible to assign value to a variable like we did here.!

        // ! Operator

        boolean succes= true;
        System.out.println("succes = " + succes);

        System.out.println("!succes = " + !succes);
        System.out.println("a != b" + (a != b) );// means a is not equal to b. returns a boolean value.


    }





}
