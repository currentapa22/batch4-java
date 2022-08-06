package com.days.day52.ucuncu_ornek;

public class BankAccount {
    static String bankName="HSBC";
    String accountOwnerName;
    double balance;
    static double bankCapital;

    BankAccount(double money){
        balance=money;
        this.bankCapital=bankCapital+money;
    }

    public void putMoney(double money){

        balance= balance +money;
        bankCapital=bankCapital+money;
    }













}
