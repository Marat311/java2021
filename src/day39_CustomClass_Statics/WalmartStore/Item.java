package day39_CustomClass_Statics.WalmartStore;

public class Item {
    public String name;
    public double prise;
    public int quantity;

    public void setInfo(String name, double prise, int quantity) {
        this.name = name;
        this.prise = prise;
        this.quantity = quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", quantity=" + quantity +
                '}';
    }
}
/*
Create a class called Item
    Instance variables:
        - name (String), price (double), quantity (int)

    Instance methods:
        - setInfo(): Accepts and initializes all three variables
        - toString(): returns information about Item


 */
