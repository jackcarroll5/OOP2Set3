package com.example.oop2set3;

import jdk.internal.util.xml.impl.Input;
import java.util.Scanner;

/**
 * Created by T00194823 on 05/10/2017.
 */
public class Problem2 {
    public static void main(String[] args) {
        String name;
        int accNum;
        double balance;

        Scanner input = new Scanner(System.in);

     SavingsAccount acc1 = new SavingsAccount();
     System.out.println("No argument Account 1:" + acc1.toString());

     SavingsAccount acc2 = new SavingsAccount("Thomas Kavanagh",4691,500.80);
     System.out.println("\nThe 3-argument Account 2:" + acc2.toString());

     acc2.lodge(500);
        System.out.println("\n\nThe details of the inputted Account 2 after lodging:\n " +
                acc2);




      System.out.print("\n\nPlease enter a name to add to your bank account: ");
      name = input.nextLine();
        System.out.print("Please enter the account number of your bank account: ");
        accNum = input.nextInt();
        System.out.print("Please enter the balance in your bank account: ");
        balance = input.nextDouble();


      SavingsAccount acc3 = new SavingsAccount(name,accNum,balance);
      System.out.println("\n\nThe details of the inputted Account 3:\n " +
      acc3.toString());


         acc3.withdraw(4500);
        System.out.println("\n\nThe details of the inputted Account 3 after withdrawal:\n " +
               acc3);


        acc3.calcTax();
        System.out.println("\n\nThe details of the inputted Account 3 after the tax is calculated:\n " +
                acc3);

    }
}
