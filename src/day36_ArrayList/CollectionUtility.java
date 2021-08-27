package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 5, 0, -1, 30, 40, 15,20,20,20));

        //Arrays.sort(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("---------------------Swap-------------");

        Collections.swap(list, 0, 2);
        System.out.println(list);

        System.out.println("---------------replaceAll-----------");

        Collections.replaceAll(list, 10, 20);

        System.out.println(list);

        System.out.println("-----------------frequency-------------");


        int f = Collections.frequency(list, 20);
        System.out.println(f);

        System.out.println("-----------------------");

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A', 'A','B','C','C','C','D'));

     /*   ArrayList<Character> unique = new ArrayList<>();

     for(Character each:chars){
            if(Collections.frequency(chars, each)==1){
                unique.add(each);
            }
        }
        System.out.println(unique);
       */

        ArrayList<Character> unique = new ArrayList<>(chars);
        unique.removeIf(p-> Collections.frequency(unique, p)!=1);
        System.out.println(unique);

        System.out.println("---------------------");

        String str = "ABABABACDEEEEE";
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list3);
        String unique1 ="";
      /*  for(String each:list3){
            if(Collections.frequency(list3, each)==1){
                unique1+=each;
            }
        }
System.out.println(unique);
       */

        list3.removeIf(p-> Collections.frequency(list3, p)!=1);
        System.out.println(list3);


        int max = Collections.max(list);
        System.out.println(max);
        int min = Collections.min(list);
        System.out.println(min);


        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("--------------");
        numbers.addAll(Arrays.asList(10,10,10,9,9,9,8,7,6,5,4,3,2,1));
        numbers.removeIf(p -> p == Collections.max(numbers));
        int firstMax = Collections.max(numbers);

        numbers.removeIf(p -> p == Collections.max(numbers));
        int secondMax = Collections.max(numbers);

        numbers.removeIf(p -> p == Collections.max(numbers));
        int thirdMax = Collections.max(numbers);

        System.out.println("firstMax = " + firstMax);
        System.out.println("secondMax = " + secondMax);
        System.out.println("thirdMax = " + thirdMax);


    }
}