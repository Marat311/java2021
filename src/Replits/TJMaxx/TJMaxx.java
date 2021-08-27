package Replits.TJMaxx;

import java.util.ArrayList;

public class TJMaxx  {

    /*
     * Private ArrayList to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private ArrayList<Item> regularItems;
    private ArrayList<OnSaleItem> onSaleItems;

    /*
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */

    public TJMaxx() {
        this.regularItems = new ArrayList<Item>() ;
        this.onSaleItems = new ArrayList<OnSaleItem>();
    }

    /*
     * adds an item object to regularItems list
     * @param item
     */


    public void addRegularItem(Item item) {

        this.regularItems.add(item);
    }

    /*
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {

        this.onSaleItems.add(item);
    }

    /*
     * getter for regularItems
     * @return
     */
    public ArrayList<Item> getRegularItems() {
        //TODO change from null
        return regularItems;
    }

    /*
     * getter for onSaleItems
     * @return
     */
    public ArrayList<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /*
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        int count = 0;
        for (Item eachItem : regularItems) {
            eachItem.getQuantity();
            count++;
        }
        if (regularItems.isEmpty()) {
            return -1;
        } else {
            return count;
        }
    }

    /*
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        int count = 0;
        for (OnSaleItem eachItem : onSaleItems) {
            count++;
        }
        if (onSaleItems.isEmpty()) {
            return -1;
        } else {
            return count;
        }

    }

    /*
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public String getAllItemNames() {

        String eachRegularItem = "";
        for (Item each : regularItems) {// each regular item
            eachRegularItem += " " + each.getName();
        }

        for (OnSaleItem eachSaleItem : onSaleItems) {
            eachRegularItem += eachSaleItem.getName();
        }
        if (regularItems.isEmpty() && onSaleItems.isEmpty()) {
            return null;
        } else {
            return eachRegularItem;
        }


    }

    /*
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {
        for (Item each : regularItems) {
            if (each.getCatalogNumber() == catalogNumber) {
                return each.getPrice();
            }
        }

        for (OnSaleItem each : onSaleItems) {
            if (each.getCatalogNumber() == catalogNumber) {
                return each.getPrice();
            }


        }
        return 0.0;

    }




    /*
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name){

        for (OnSaleItem each : onSaleItems) {
            if(each.getName().equals(name)){
                return each;
            }
        }

        return null;
    }

    /*
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {

     /*   for (Item regularItem : regularItems) {
            if(regularItem.getCatalogNumber()==catalogNumber){
                regularItem.setQuantity(regularItem.getQuantity()-1);
            }
        }

      */
        regularItems.removeIf(each->each.getCatalogNumber() == catalogNumber);
       onSaleItems.removeIf(each ->each.getCatalogNumber() == catalogNumber);
    }


    /*
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {

        int count = 0;
        String name = "";
        for (Item each : regularItems) {
            if(each.getCatalogNumber()==catalogNumber){

                count =regularItemsCount()-1;
                name=each.getName();
            }

        }
        if(count==0){
            removeItem(catalogNumber);

        }
        System.out.println("Item "+name+" was buy" );
        int count1 = 0;
        for(OnSaleItem item:onSaleItems){
            if(item.getCatalogNumber()==catalogNumber){
                count1 = onSaleItemsCount()-1;
            }
        }

       if(count1==0){
           removeItem(catalogNumber);
       }




    }

    public static void main(String[] args) {


        Item item1 = new Item("Top", 5,5,10);
        Item item2 = new Item("Dress", 10,10,20);
        Item item3 = new Item("Short", 15,15,15);
        Item item4 = new Item("Short blue", 15,15,15);
        TJMaxx tjMaxx = new TJMaxx();
        tjMaxx.addRegularItem(item1);
        tjMaxx.addRegularItem(item2);
        tjMaxx.addRegularItem(item3);
        tjMaxx.addRegularItem(item4);
        System.out.println("----add items -----------");
        System.out.println(tjMaxx.getRegularItems());
        System.out.println(tjMaxx.regularItemsCount());
        System.out.println("--------remove item ------------");
        tjMaxx.removeItem(15);
        System.out.println(tjMaxx.getRegularItems());
        System.out.println(tjMaxx.regularItemsCount());
        System.out.println("---------buy item --------");
        tjMaxx.buyItem(10);


        System.out.println(tjMaxx.getRegularItems());
    }


}

