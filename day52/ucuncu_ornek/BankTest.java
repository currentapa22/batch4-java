package com.days.day52.ucuncu_ornek;

public class BankTest {
    public static void main(String[] args) {

        BankAccount account1= new BankAccount (1000);
        BankAccount account2=new BankAccount (2000);
        System.out.println ( "account1.balance = " + account1.balance );
        System.out.println ( "account2.balance = " + account2.balance );

        account1.putMoney ( 3000 );//won't effect account2 because its different object.
        System.out.println ( "account1.balance = " + account1.balance );
        System.out.println ( "account2.balance = " + account2.balance );

        System.out.println ( "BankAccount.bankCapital = " + BankAccount.bankCapital );//expected code 6000 but its answer is 4000 neden ?

        account2.putMoney ( 10000 );//expected 12000
        //capital will be 16000
        System.out.println ( "account2.balance = " + account2.balance );
        System.out.println ( "BankAccount.bankCapital = " + BankAccount.bankCapital );

        BankAccount account3=new BankAccount (  20000);
        System.out.println ( "account1.balance = " + account1.balance );
        System.out.println ( "account2.balance = " + account2.balance );
        System.out.println ( "account3.balance = " + account3.balance );
        System.out.println ( "BankAccount.bankCapital = " + BankAccount.bankCapital );


    }
}
