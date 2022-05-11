package Day3;

import java.text.DecimalFormat;
import java.util.Scanner;

//TaskThree
public class BankAccount {
    private double balance;
    DecimalFormat df = new DecimalFormat();
    public BankAccount(){
        this.balance = 0.0;
    }
    public BankAccount(double balance){
        setBalance(balance);
    }
    public void depist(double amount){
        if (amount>0 && amount <=5000) {
            balance = balance + amount;
            System.out.println("Successfully Deposit of amount: "+amount);
        }
        else System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit: "+amount);
    }
    public void withDraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
            System.out.println("WithDraw successful of amount: "+amount);
        }
        else System.out.println("There is not enough funds");;
    }
    public void printBalance(){
        df.setMaximumFractionDigits(2);
        System.out.println("Current Balance is: "+df.format(getBalance()));
    }
    public void transferBalance(double amount){
        if(amount<=balance) {
            balance = balance - amount;
            System.out.println("Balance Transfered Succefully of amount: "+amount);
        }
        else{
            df.setMaximumFractionDigits(2);
            System.out.println("Transfer cancelled. You are trying to transfer "+amount+" units, but only "+df.format(getBalance())+" are");
        }

    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0){
            this.balance = balance;
        }
        else System.out.println("Balance should be Positive Decimal number");
    }

    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount2 = new BankAccount(150.5);
        System.out.println("Account One: ");
        bankAccount.printBalance();
        System.out.println("Deposit Request:");
        bankAccount.depist(100.5);
        bankAccount.printBalance();
        System.out.println("Deposit Request:");
        bankAccount.depist(7000);
        System.out.println("withDraw Request:");
        bankAccount.withDraw(50.7);
        bankAccount.printBalance();
        System.out.println("withDraw Request:");
        bankAccount.withDraw(500);
        System.out.println("Transfer Request:");
        bankAccount.transferBalance(20);
        System.out.println("Transfer Request:");
        bankAccount.transferBalance(800);
        bankAccount.printBalance();
        System.out.println();
        System.out.println("Account Two: ");
        bankAccount2.printBalance();

    }
}
