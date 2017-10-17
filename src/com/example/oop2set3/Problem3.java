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

        Computer c1 = new Computer();

        System.out.println(c1.toString());

      Computer c2 = new Computer("S3554","Acer","RAM",8600);

      System.out.println("\nThe 3-argument computer: " + c2.toString());

      Scanner input = new Scanner(System.in);


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


      for (int i = 0; i < comps.length; i++)
      {



         // comps[i];
      }

   }

   public static Laptop makeLaptop()
 {
     String ID,make,type;
     int size;
     boolean touch = false;

     Scanner input = new Scanner(System.in);

   System.out.print("\nPlease enter the ID of your new Laptop: ");
     ID = input.nextLine();
     System.out.print("Please enter the make of your new Laptop: ");
     make = input.nextLine();
     System.out.print("Please enter the type of your new Laptop: ");
     type = input.nextLine();
     System.out.print("Please enter the size of your new Laptop: ");
     size = input.nextInt();



     Laptop l1 = new Laptop(ID,make,type,size,touch);
    return l1;
 }
}
