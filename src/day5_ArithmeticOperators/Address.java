package day5_ArithmeticOperators;

public class Address {
    /*
    1. create a class named Address and declare the following variables:
    name, buildingNumber, streetName, city, state, zipCode use string
    concatenation to display the full address of the personEx:
    Daniel Owens7925 Jones Branch DrMcLean VA 22102
     */

    public static void main(String[] args) {
        String name = "Daniel Owens",
               street = "Jones Branch Dr",
                city = "McLean",
               state = "VA",
               zipCode = "22102";
        int buildingNUmber = 7925;

        System.out.println(name+"\n"+buildingNUmber+" "+street+"\n"+city+" "+state+ " "+zipCode); //\n new line



    }
}
