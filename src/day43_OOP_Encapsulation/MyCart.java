package day43_OOP_Encapsulation;

public class MyCart {
    public static Item item1, item2, item3, item4, item5;

    static {
        item1 = new Item("Milk", 3, 2);
        item2 = new Item("Eggs", 0.5, 30);
        item3 = new Item("Diaper", 48,1);
        item4 = new Item("Bread", 4, 5);
        item5 = new Item("Toilet Papers", 10, 20);
    }

}

/*
 create a class called MyCart
            create 5 static variables of Items
            Add a static block to to set all the static variables
 */

