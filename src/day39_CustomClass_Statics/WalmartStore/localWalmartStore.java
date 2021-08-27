package day39_CustomClass_Statics.WalmartStore;

import java.util.ArrayList;
import java.util.Arrays;

public class localWalmartStore {
    public static void main(String[] args) {
        WalmartStore walmartStore = new WalmartStore();

        Item [] items = {new Item(), new Item(), new Item(), new Item(), new Item(), new Item(), new Item(), new Item(), new Item(), new Item()};
        items[0].setInfo("bread", 3.5, 1);
        items[1].setInfo("milk", 6.5, 1);
        items[2].setInfo("potato", 4.3, 1);
        items[3].setInfo("juice", 7, 1);
        items[4].setInfo("bread", 3.5, 1);
        items[5].setInfo("bread", 3.5, 1);
        items[6].setInfo("bread", 3.5, 1);
        items[7].setInfo("bread", 3.5, 1);
        items[8].setInfo("bread", 3.5, 1);
        items[9].setInfo("bread", 3.5, 1);




        walmartStore.inventory.addAll(Arrays.asList(items));
        walmartStore.setInfo("New York");


        System.out.println(walmartStore);

        Item [] itemsToRemove = {new Item(), new Item()};

        items[0].setInfo("bread", 5, 1);
        items[1].setInfo("milk", 6.5, 1);

        ArrayList<Item> list = new ArrayList<>(Arrays.asList(itemsToRemove));

        walmartStore.restockInventory(list);
        walmartStore.calculateWorth();
        System.out.println(walmartStore);



    }
}
/*
create a class named LocalWalmartStore
    1. Make a WalmartStore objects
    2. create an array of Items with their informations set (at least has 10 Items).
    3. Add those initial Items to the ArrayList of Item in the

 */