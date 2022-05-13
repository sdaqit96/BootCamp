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
    public boolean depist(double amount){
        if (amount>0 && amount <=5000) {
            balance = balance + amount;
            return true;
        }
        return false;
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
