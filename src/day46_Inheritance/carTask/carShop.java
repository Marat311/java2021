package day46_Inheritance.carTask;

public class carShop {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 50000, "White", 2000);
        toyota.start();

        Tesla tesla = new Tesla("Smodel", 2021, 120000, "Black", 0);
        tesla.start();

        BWM bwm = new BWM("X6", 2015, 100000, "Red", 30000);
        bwm.start();

    }
}
