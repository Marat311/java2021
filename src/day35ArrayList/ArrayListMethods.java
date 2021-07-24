package day35ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Sugar");
        groceryList.add("Butter");

        System.out.println(groceryList);

        System.out.println("-------------------set()-----------");
        groceryList.set(1, "Coffee"); //replace old element at given index with new element
        groceryList.set(0, "Juice");
        System.out.println(groceryList);

        System.out.println("---------remove()---------------");
        //remove(index):
        groceryList.remove(2);
        System.out.println(groceryList);

        //remove(Object):
        boolean r1 = groceryList.remove("Juice"); //remove method remove and also gives boolean expression
        System.out.println(groceryList);
        System.out.println(r1+" r1");

        boolean r2 = groceryList.remove("Face masks");//if we dont have this object it dont change length from array

        System.out.println(groceryList);
        System.out.println(r2);

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        list1.remove((Integer)30); //list1.remove(value.of(30));
        System.out.println(list1);

        list1.clear(); //remove all objects in arrayList
        System.out.println(list1);
        System.out.println("---------------char()----");

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('D');
        list.add('A');
        list.add('C');
        System.out.println(list);

        list.indexOf('B'); //0
        list.lastIndexOf('A'); //5

        ArrayList<Character> uniqueCharacters = new ArrayList<>();

        for (Character character : list) {
            if(list.indexOf(character)==list.lastIndexOf(character)){
                uniqueCharacters.add(character);
            }
        }
        System.out.println("uniqueCharacters = " + uniqueCharacters);


        boolean hasJuice = groceryList.contains("Coffee");
        boolean hasJuice2 = groceryList.indexOf("Sugar")>=0;

        System.out.println(hasJuice);
        System.out.println(hasJuice2);

        ArrayList<String> names = new ArrayList<>();
        names.add("Marina");
        names.add("Marina");
        names.add("Motya");
        names.add("Ben");
        names.add("Ben");
        names.add("Alec");
        System.out.println(names);

        ArrayList<String>result = new ArrayList<>();

        for(String  name:names){
            if(result.contains(name)){
               continue;
            }
            result.add(name);
        }
        System.out.println(result);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        ArrayList<Integer> result2 = new ArrayList<>();

        System.out.println(nums.size()); //4
        for (int i = nums.size() - 1; i >= 0; i--) {
            result2.add(nums.get(i)); //400,300,200,100
        }

        System.out.println(nums);
        System.out.println(result2);

        System.out.println("----------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);

        System.out.println(n1.equals(n2));



    }
}
