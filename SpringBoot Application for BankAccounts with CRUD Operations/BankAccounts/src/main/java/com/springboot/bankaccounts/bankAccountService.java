package com.springboot.bankaccounts;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class bankAccountService {
    private List<BankAccount> accounts = new ArrayList<>(Arrays.asList(new BankAccount(1, 0.0 ),
                                        new BankAccount(2, 100)));

    public List<BankAccount> getAllAccounts() {
        return accounts;
    }

    public BankAccount getAccountWithID(int id) {

        for (BankAccount a : accounts) {
            if (a.getId()==id)
                return a;
        }
        return new BankAccount(0, 0);
    }
    public void addAccount(BankAccount acount){
        accounts.add(acount);
    }

    public void updateAccount(int id, BankAccount account) {
        for (int i = 0; i < accounts.size(); i++) {
            BankAccount a = accounts.get(i);
            if(a.getId()==id){
                accounts.set(i, a);
                return;
            }
        }
    }

    public void deleteAccount(int id) {
        accounts.removeIf(t->t.getId()==id);
    }
    public boolean addBalance(int id, double balance){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                return accounts.get(i).depist(balance);
            }
        }
        return false;
    }

    public boolean withdrawBalance(int id, double balance){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                return accounts.get(i).withDraw(balance);
            }
        }
        return false;
    }

    public boolean transferBalance(int id, double balance){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                return accounts.get(i).transferBalance(balance);
            }
        }
        return false;
    }
}
