package day24;

public class warmUp_ClassMates {
    public static void main(String[] args) {
        /*
      1. create string array, and store the names of your  class mates (10)
            print the first three characters of each name

         */

        String [] group4 = {"Ahmed", "Ivan", "Kadir", "Mykyta", "Andrei", "Marina", "Myhtar", "Igor", "Kuzatt", "Ahmet" };

        for(int i = 0; i<group4.length; i++){
            System.out.println(group4[i].substring(0,3));
        }
    }
}
