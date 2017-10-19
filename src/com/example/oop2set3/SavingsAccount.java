package com.example.oop2set3;

/**
 * Created by T00194823 on 05/10/2017.
 */
public class SavingsAccount extends BankAccount {
    private double balance;

    public SavingsAccount()
    {
        //setName("");
       // setAccNum(0);
        super("No name",0);
       setBalance(0);
    }

    public SavingsAccount(String name, int accNum,double balance)
    {
        super(name,accNum);
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
    public String toString()
    {
        return super.toString() + "\nBalance: €" + getBalance();
    }

    @Override
    public double calcTax()
    {
        return getBalance() * 0.5f;
    }

    @Override
    public void lodge(double amount) {
     setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() > amount)
        setBalance(getBalance() - amount);
    }
}
