package day39_CustomClass_Statics.WalmartStore;

import java.util.ArrayList;

public class WalmartStore {
    public String location;
    public double totalWorth;
    ArrayList<Item> inventory = new ArrayList();

    public static String companyName;

    public void setInfo(String location) {        this.location = location;    }

    public void calculateWorth(){
        for(Item each:inventory){
           totalWorth+=each.prise*each.quantity;
       }
    }

    public void restockInventory(ArrayList<Item> newItems) {

        newItems.removeIf(eachNewItem -> inventory.contains(eachNewItem.name));
        inventory.addAll(newItems);
    }

     /*   for(Item eachItem:inventory){
            for(Item item:list) {
                if (eachItem.name.equals(item.name) ) {
                    if(eachItem.prise== item.prise)continue;
                }
                   inventory.add(item);

            }
        }

    */





    public String toString() {
        return "WalmartStore{" +
                "location='" + location + '\'' +
                ", totalWorth=" + totalWorth +
                ", inventory=" + inventory.size() +
                '}';
    }
}
/*
Create a class called WalmartStore
    -> Instance variables:
        - location (String), totalWorth (double)
        - ArrayList<Item> inventory = new ArrayList();

    -> Static variables:
        - company name (String),

    -> Instance methods:
        - setInfo(): Accepts and initializes location ONLY
        - calculateWorth():Checks inventory, totals up amount of money all the items are worth.
         (each times price * quantity). Stores to the totalWorth variable

        - restockInventory(List of Item) -> Adds the given items to the store inventory.
            Challenge: If the item exists in the inventory already (same item name and price)

        - toString(): returns information of the walmart store (location, total number of inventory, and total worth)

 */