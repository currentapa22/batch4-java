package com.days.day24;

public class fifthexercise {
    public static void main(String[] args) {
        //for char
        operations ( 40, 20, '+' );
        operations ( 40, 20, '-' );
        operations ( 40, 20, '*' );
        operations ( 40, 20, '/' );

        //ikinci methodu yaziyorum altina
        //for string
        System.out.println ("////////////////////////////////////");
        operations ( 90, 30, "+" );
        operations ( 90, 30, "-" );
        operations ( 90, 30, "*" );
        operations ( 90, 30, "/" );

        //ucuncu methodu yaziyorum altina
        System.out.println ("/////////////////////////////////////");
        operations ( "Addition",45,55 );
        operations ( "Subtract",45,55 );
        operations ( "Multiplication",45,55 );
        operations ( "Division",45,55 );

    }
    //lets create a method 2 integer parameter and 1 char operators + - * /
    //create a switch statement up to the char value
    //return the values
    //overload the method with different type of parameter double


    public static int operations(int a, int b, char operator) {
        switch (operator) {
            case '+': // if the operator value equals +
                System.out.println ( a + b );
                return a + b; //break yerine return a+b;
            case '-':
                System.out.println ( a - b );
                return a - b; //break yerine return a-b;
            case '*':
                System.out.println ( a * b );
                return a * b; //break yerine return a*b;
            case '/':
                System.out.println ( a / b );
                return a / b; //break yerine return a/b;
            default:
                System.out.println ( a * a + b * b );
                return a * a + b * b;
        } //ayni anda break ve return u kullanamazsin ,unreachable statements!.
    }

    public static int operations(int a, int b, String operator) {
        int result;
        switch (operator) {
            case "+": // if the operator value equals +
                System.out.println ( a + b );
                result = a + b; //break yerine return a+b;
                break;
            case "-":
                System.out.println ( a - b );
                result = a - b; //break yerine return a-b;
                break;
            case "*":
                System.out.println ( a * b );
                result = a * b; //break yerine return a*b;
                break;
            case "/":
                System.out.println ( a / b );
                result = a / b; //break yerine return a/b;
                break;
            default:
                System.out.println ( a * a + b * b );
                result = a * a + b * b;

        }
        return result;
    }



    public static int operations( String operator,int a, int b) {
        int result;
        switch (operator) {
            case "Addition": // if the operator value equals +
                System.out.println ( a + b );
                result = a + b; //break yerine return a+b;
                break;
            case "Subtract":
                System.out.println ( a - b );
                result = a - b; //break yerine return a-b;
                break;
            case "Multiplication":
                System.out.println ( a * b );
                result = a * b; //break yerine return a*b;
                break;
            case "Division":
                System.out.println ( a / b );
                result = a / b; //break yerine return a/b;
                break;
            default:
                System.out.println ( a * a + b * b );
                result = a * a + b * b;

        }
        return result;
    }


}
