package com.example.oop2set3;
import javax.swing.*;

public class Problem1 {
    public static void main(String[] args)
    {
       String address,type,price,name;
       double p;


     House h1 = new House();

     JOptionPane.showMessageDialog(null,"House 1's details are: " +
     h1.toString(),"House Details",JOptionPane.INFORMATION_MESSAGE);


     House h2 = new House("Bridge Street,Tralee,Co.Kerry","Bungalow",
     1500,"Tom Ford");


        JOptionPane.showMessageDialog(null,"House 2's details are: " +
                h2.toString(),"House Details",JOptionPane.INFORMATION_MESSAGE);

       address = JOptionPane.showInputDialog("Please enter the address of your house: ");

        type = JOptionPane.showInputDialog("Please enter the type of house you live in: ");

        price = JOptionPane.showInputDialog("Please enter the price of your house: ");
        p = Double.parseDouble(price);

        if(p < 0)
            p = 0;

        name = JOptionPane.showInputDialog("Please enter the owner's name: ");


        House h3 = new House(address,type,p,name);



        JOptionPane.showMessageDialog(null,"House 3's details are: " +
                h3.toString(),"House Details",JOptionPane.INFORMATION_MESSAGE);


       }
    }

