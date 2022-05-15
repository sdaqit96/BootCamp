package com.springboot.bankaccounts;

import java.text.DecimalFormat;

//TaskThree
public class BankAccount {
    private int id;
    private double balance;
    DecimalFormat df = new DecimalFormat();
    public BankAccount(){
        this.id =0;
        this.balance = 0.0;
    }
    public BankAccount(int ID, double balance){

        this.id = ID;
        setBalance(balance);
    }
    public boolean depist(double amount){
        if (amount>0 && amount <=5000) {
            balance = balance + amount;
            return true;
        }
        return false;
    }
    public int getId() {
        return id;
    }
    public boolean withDraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
            return true;
        }
        return false;
    }
    public void printBalance(){
        df.setMaximumFractionDigits(2);
        System.out.println("Current Balance is: "+df.format(getBalance()));
    }
    public boolean transferBalance(double amount){
        if(amount<=balance) {
            balance = balance - amount;
            return true;
        }
        return false;

    }
    public double getBalance() {
        return balance;
    }

    public boolean setBalance(double balance) {
        if (balance > 0){
            this.balance = balance;
            return true;
        }
        return true;
    }
}
