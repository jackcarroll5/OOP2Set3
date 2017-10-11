package com.example.oop2set3;

/**
 * Created by T00194823 on 05/10/2017.
 */
public class BankAccount extends SavingsAccount implements Transactable,Taxable {
protected String name;
protected int accNum;

public BankAccount()
{
  setName("");
  setAccNum(0);
}

public BankAccount(String name,int accNum)
{
  setName(name);
  setAccNum(0);
}

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAccNum(int accNum)
    {
        this.accNum = accNum;
    }


    public String getName()
    {
        return name;
    }

    public int getAccNum()
    {
        return accNum;
    }

    @Override
    public void lodge() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public double calcTax()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "\nName: " + getName() + "\nAccount No: " + getAccNum()
        + super.toString();
    }


}
