package day42_CustomClass_Constructors;

public class Car {
    public String make, model, color;
    public int year;
    public double price;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
    }

    public Car(String make, String model, String color) {
        this(make, model);
        this.color = color;
        year = 2000;
        price = 20000;
    }

    public Car(String make, String model, String color, int price){
        this(make, model, color);
        this.price=price;
    }

    public Car(String make, String model, String color, int year, double price) {
        this(make, model, color, year);
        this.price = price;
    }

    public Car(String color, int year, double price) {
        this(null, null, color, year, price);
    }

    public Car(int year, double price) {
        this(null, null, null, year, price);
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
