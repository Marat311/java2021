package Replits;

import java.util.Scanner;

public class catDog {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


        for (int i = 0; i <=word.length()-3 ; i++) { //
            String each = word.substring(i,i+3);  //has 3 characters
            if(each.equalsIgnoreCase("Cat")){
                countOfCats++;
            }
            if(each.equalsIgnoreCase("Dog")){
                countOfDogs++;
            }


        }
        System.out.println("numberOfDogs = " + countOfDogs);
        System.out.println("numberOfCats = " + countOfCats);
        boolean equal = countOfCats==countOfDogs;
        System.out.println(equal);


    }
}
