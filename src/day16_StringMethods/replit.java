package day16_StringMethods;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = scan.nextLine();
        double price1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter Item2 and its price:");
        String item2 = scan.nextLine();
        double price2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter Item3 and its price:");
        String item3 = scan.nextLine();
        double price3 = scan.nextDouble();
        double totalPrice = price1 + price2 + price3;


        System.out.println("Item1: " + item1 + " Price: " + price1);
        System.out.println("Item2: " + item2 + " Price: " + price2);
        System.out.println("Item3: " + item3 + " Price: " + price3);
        scan.close();
        System.out.println("Total \nprice: " + totalPrice);
    }
}