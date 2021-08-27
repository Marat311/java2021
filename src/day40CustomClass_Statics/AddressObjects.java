package day40CustomClass_Statics;

import java.util.Scanner;

public class AddressObjects {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Address address = new Address();

        System.out.println("Enter your building number");
        String building = s.next();

        s.nextLine();
        System.out.println("Enter your street");
        String street = s.nextLine();

        System.out.println("Enter your city name");
        String city = s.nextLine();

        System.out.println("Enter your state name");
        String state = s.nextLine();

        System.out.println("Enter your zip code name");
        int zip_code = s.nextInt();

        address.setInfo(building, street, city, state, zip_code);

        System.out.println(address);


    }

}
