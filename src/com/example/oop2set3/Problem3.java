package com.example.oop2set3;
import java.util.Scanner;

/**
 * Created by T00194823 on 05/10/2017.
 */
public class Problem3 {
    public static void main(String[] args) {

        String IDC,makeComp,typeComp;
        int sizeComp;
        Computer[] comps = new Computer[2];
        int i;

        Computer c1 = new Computer();

        System.out.println("The no argument computer:" + c1.toString());

      Computer c2 = new Computer("S3554","Acer","RAM",8600);

      System.out.println("\nThe 3-argument computer: " + c2.toString());

      Laptop l2 = new Laptop();

        System.out.println("\nNew Laptop:" + l2.toString());

        Laptop l3 = new Laptop("85439590","Dell","RAM",500,true);

        System.out.println("\nLaptop 2:" + l3.toString());

         Scanner input = new Scanner(System.in);

        for (i = 0; i < comps.length; i++)
        {
            System.out.print("\nPlease enter the ID of your new computer: ");
            IDC = input.nextLine();
            System.out.print("Please enter the make of your new computer: ");
            makeComp = input.nextLine();
            System.out.print("Please enter the type of your new computer: ");
            typeComp = input.nextLine();
            System.out.print("Please enter the size of your new computer: ");
            sizeComp = input.nextInt();

            input.nextLine();

            comps[i] = new Computer(IDC,makeComp,typeComp,sizeComp);
        }

        for (i = 0; i < comps.length; i++)
            System.out.println("\n\nThe array of computers:" + comps[i]);

        System.out.print("\nPlease enter the ID of your new computer: ");
        IDC = input.nextLine();
        System.out.print("Please enter the make of your new computer: ");
        makeComp = input.nextLine();
        System.out.print("Please enter the type of your new computer: ");
        typeComp = input.nextLine();
        System.out.print("Please enter the size of your new computer: ");
        sizeComp = input.nextInt();

        Computer c3 = new Computer(IDC,makeComp,typeComp,sizeComp);
        System.out.println("\n\nThe new computer's details:" + "\n" + c3);


        System.out.println("\n\nThe new laptop's details:" + "\n" + makeLaptop());

   }

   public static Laptop makeLaptop()
 {
     String ID,make,type,touchY;
     int size;
     boolean touch = true;

     Scanner input = new Scanner(System.in);

   System.out.print("\nPlease enter the ID of your new Laptop: ");
     ID = input.nextLine();
     System.out.print("Please enter the make of your new Laptop: ");
     make = input.nextLine();
     System.out.print("Please enter the type of your new Laptop: ");
     type = input.nextLine();
     System.out.print("Please enter the size of your new Laptop: ");
     size = input.nextInt();
     input.nextLine();
     System.out.print("Does your new Laptop have a touch screen?: ");
     touchY = input.nextLine();

     if (touchY.equals("Y"))
     touch = true;
     else
         touch = false;

     Laptop l1 = new Laptop(ID,make,type,size,touch);
    return l1;
 }
}
