package com.example.oop2set3;

/**
 * Created by T00194823 on 05/10/2017.
 */
public class SavingsAccount {
    private double balance;

    public SavingsAccount()
    {
      setBalance(0);
    }

    public SavingsAccount(double balance)
    {
       setBalance(balance);
    }


    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    @Override
    public String toString() {
        return "\nBalance: " + getBalance();
    }
}
