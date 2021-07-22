package Replits;

import java.util.Scanner;

public class Apartment_Leasing {
    public static void main(String[] args) {


    int propertyPrice = 0;
    int numberOfBedrooms, garageSpots;
    float metroAccessibility, schoolScore, highwayAccessibility;
    boolean backyard, smoking, garage;
    String houseType;
    Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
    //WRITE YOUR CODE HERE
        System.out.println("Enter your property type:");
    houseType = scan.nextLine();
    //house type
        if (houseType.equalsIgnoreCase("Condo")) {
        propertyPrice += 50_000;
    } else if (houseType.equalsIgnoreCase("Townhouse")) {
        propertyPrice += 75_000;
    } else {
        propertyPrice+=95_000;
    }

        System.out.println(propertyPrice);

    //bedrooms
        System.out.println("How many bedrooms do you have?");
    numberOfBedrooms = scan.nextInt();

    int bedrooms=30_000*numberOfBedrooms; //number of bedrooms
    propertyPrice+=bedrooms;
        System.out.println(propertyPrice);

    //backyard
        System.out.println("Do you have a backyard?");
    backyard = scan.nextBoolean();

        if(backyard){

        if(houseType.equalsIgnoreCase("Condo")){
            System.out.println("Backyard is not available for condo!");;
        }else{
            propertyPrice+=5000;
        }
    }
        System.out.println(propertyPrice);

    //garage
        System.out.println("Do you have garage?");
    garage = scan.nextBoolean();

        System.out.println("How many spots?");
    garageSpots = scan.nextInt();



        if(garageSpots<=10){
        propertyPrice+=20000*garageSpots;
    }else{
        // propertyPrice+=20000;
        System.out.println("Pardon, it's not public parking!");

    }
        System.out.println(propertyPrice);


        System.out.println("How close is metro station?");
    metroAccessibility = scan.nextFloat();

    //metro
        if(metroAccessibility<=1){
        propertyPrice+=10_000;
    }else if(metroAccessibility>1 && metroAccessibility<=3){
        propertyPrice+=5000;
    }else{
        System.out.println("You are living around metro station");
    }
        System.out.println(propertyPrice);

        System.out.println("How close is highway?");
    highwayAccessibility = scan.nextFloat();

    //highway
        if(highwayAccessibility<=1){
        propertyPrice+=15000;
    }else if(highwayAccessibility>1 && highwayAccessibility<5){
        propertyPrice+=8000;
    }else if(highwayAccessibility>5 && highwayAccessibility<20){
        propertyPrice+=4000;
    }else{
        propertyPrice+=0;
    }
        System.out.println(propertyPrice);

        System.out.println("What's the raiting of nearest school?");
    schoolScore = scan.nextFloat();

        if(schoolScore<=10 && schoolScore>=8){
        propertyPrice+=45000;
    }else if (schoolScore<8 && schoolScore>=4){
        propertyPrice+=20000;
    }else{
        propertyPrice+=5000;
    }
        System.out.println(propertyPrice);

        System.out.println("Does any of your family members smoke?");
    smoking = scan.nextBoolean();

        if(smoking){
        propertyPrice-=5000;
    }

        scan.close();

        System.out.println("Market report has been generated.");


        System.out.println("Your estimate market price is: "+propertyPrice);
}
    }


