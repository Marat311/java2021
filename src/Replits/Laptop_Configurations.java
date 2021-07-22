package Replits;

import java.util.Scanner;

public class Laptop_Configurations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //size
        System.out.println("Select screen size:");
        double screeSize = s.nextDouble();

        double price=0;

        if(screeSize==13.3){
            price+=200;
        }else if(screeSize==15.0){
            price+=300;
        }else{
            price+=400;
        }


        //CPU type
        System.out.println("Select CPU type:");
        String spuType = s.next();

        if(spuType.equalsIgnoreCase("i3")){
            price+=150;
        }else if(spuType.equalsIgnoreCase("i5")){
            price+=250;
        }else{
            price+=350;
        }


        //RAM size
        System.out.println("Select RAM size:");
        int ramSize= s.nextInt();

        price+=(ramSize/4)*50;


        //SSD HDD
        System.out.println("Select storage type:");
        String storageSize = s.next();
        System.out.println("Enter memory size:");
        int memorySize = s.nextInt();
        if(storageSize.equalsIgnoreCase("HDD")){
            price+=(memorySize/500)*50;
        }
        if(storageSize.equalsIgnoreCase("SSD")){
            price+=(memorySize/500)*100;
        }


        //screen
        System.out.println("Enter screen resolution:");
        String screen = s.next();

        if(screen.equalsIgnoreCase("FULLHD")){
            price+=100;
        }
        if(screen.equalsIgnoreCase("4K")){
            price+=200;
        }

        s.close();
        System.out.println("Laptop price is: $"+price);





    }
}
