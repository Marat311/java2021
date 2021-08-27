package day46_Inheritance.carTask;

public class BWM extends Car{ //child class

    public static boolean isLuxuryBrand = true;
    public BWM( String model, int year, double price, String color, long miles) {
        super("BMW", model, year, price, color, miles);
    }

    @Override
    public void start() {
        System.out.println("Call mechanic");
        System.out.println("Change oil");
        System.out.println("Jump start");
    }
}
