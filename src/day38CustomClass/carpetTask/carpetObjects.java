package day38CustomClass.carpetTask;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects {
    public static void main(String[] args) {

       Carpet carpet = new Carpet();
        Carpet carpet1 = new Carpet();
        Carpet carpet2 = new Carpet();
        Carpet carpet3 = new Carpet();
        Carpet carpet4 = new Carpet();

        carpet.customOrder(10.5, 15.5, 125, true);
        carpet1.customOrder(12.8, 13.7, 96, true);
        carpet2.customOrder(11.3, 11.2, 100, false);
        carpet3.customOrder(15, 17.5, 140, false);
        carpet4.customOrder(17.5, 20.5, 180, true);

        ArrayList<Carpet> carpets = new ArrayList<>(Arrays.asList(carpet, carpet1, carpet2, carpet3, carpet4));
        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();

        for(Carpet each:carpets){
            if(each.isPersian){

                persianCarpets.add(each);
            }else{
                regularCarpets.add(each);
            }
        }


        System.out.println("persianCarpets = " + persianCarpets);
        System.out.println("regularCarpets = " + regularCarpets);


    }
    /*
     total price of Carpet = (width*length)*unitprice

            if the Carpet is persian  Carpet that's came from Turkey, add 200$ to the totalPrice

        create a class called carpetObjects, and create an array of the Carpet that contains 5 Carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
        write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets
     */
}
