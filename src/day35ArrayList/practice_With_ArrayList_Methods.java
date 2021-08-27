package day35ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class practice_With_ArrayList_Methods {
    public static void main(String[] args) {
        System.out.println("-----------------add(Object)--------------");

        ArrayList<String> names = new ArrayList<>();
        String object = "Marina";
        String objec = "Max";

        names.add(object);
        names.add(objec);

        System.out.println(names); //[Marina, Max]

        System.out.println("-----------add(index, Object)-------------");

        ArrayList<String> names1 = new ArrayList<>();
        String object1 = "Marina";
        String object2 = "Max";
        String object3 = "Mark";

        names1.add(object1); //0 index
        names1.add(object2);  //1 index

        names1.add(0, object3); //add on index 0 -> Mark

        System.out.println(names1); // [Mark, Marina, Max]

        System.out.println("------------get(index)----------------- ");

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Leo", "Teo", "Kai", "Tom"));
               //                           index               0       1       2     3
        list.get(1);  //get Teo on given index

        System.out.println(list.get(1));  //Teo => (String)

        System.out.println("-------------size()----------------------");

        System.out.println(list.size()); //4 => returns int, show size ArrayList

        System.out.println("----------------set(index, Object)------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,6,7,8,9));
        //                       index                          0 1 2 3 4
        nums.set(3, 1); //3-> index, 1-> object, change old index at given new index with new element

        System.out.println(nums); //[5, 6, 7, 1, 9]

        System.out.println("-----------remove(index)---------------");

        nums.remove(4); //remove element at the given index

        System.out.println(nums); //[5, 6, 7, 1]

        System.out.println("------------remove(Object)---------------------");

        ArrayList<String> str = new ArrayList<>(Arrays.asList("Cat", "Dog", "Luc", "Tom", "Luc", "Pop"));

        str.remove("Luc"); //remove first matching object

        System.out.println(str); //[Cat, Dog, Tom, Luc, Pop]

        System.out.println("---------------clear()------------------------");

        str.clear();  //remove all objects from arrayList

        System.out.println(str); //[] --> empty arrayList

        System.out.println("----------------indexOf(Object)---------------");

        ArrayList<Character> ch = new ArrayList<>(Arrays.asList('A', 'B', 'K', 'C', 'A', 'D', 'C', 'E'));
                                                 //   index      0    1    2    3    4    5    6    7
        int n = ch.indexOf('C'); // 3 --> index from first matching object
        System.out.println(n); //3

        System.out.println("----------------LastIndexOf(Object)---------------");

        System.out.println(ch.lastIndexOf('A')); //4 -> return the last matching Object index number

        System.out.println("--------------contains(Object)-----------------");

        boolean b = ch.contains('A');  //return boolean, checks if the object is contained in the ArrayList
        System.out.println(b);  //true

        System.out.println("-----------------equals(ArrayList)-----------------------");

        ArrayList<String> str1 = new ArrayList<>(Arrays.asList("Marina", "Alec", "Venya", "Motya"));
     //   ArrayList<String> str2 = new ArrayList<>(Arrays.asList("Aselya", "Kolya", "Masha", "Noy")); //false
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList("Marina", "Alec", "Venya", "Motya")); //true



        System.out.println(str1.equals(str2)); //checks if the list1 equals list2 returns boolean


    }
}
