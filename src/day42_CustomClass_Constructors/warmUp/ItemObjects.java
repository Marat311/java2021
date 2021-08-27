package day42_CustomClass_Constructors.warmUp;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemObjects {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
        new Item("milk", 5.5, 1),
        new Item("eggs", 4.95, 1),
        new Item("kinder", 2.5, 3),
        new Item("soap", 2, 5),
        new Item("bread", 3.5, 7),
        new Item("Juice", 1.5, 10)
));

        items.removeIf(item -> item.unitPrice > 3);

        double totalPrice = 0;
        for(Item eachItem:items){
            totalPrice += eachItem.calcCost();
        }

        System.out.println("totalPrice = " + totalPrice);

    }
}
