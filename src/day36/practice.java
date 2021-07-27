package day36;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class practice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,2,2,2,2,2,3,3,3,3,3,3,3,5,5,5,6,6,6,6,7,7,8,8,8,9));

        for (int i = 0; i<list.size(); i++){
            if(list.get(i)<5){
                list.remove(i);
            }
        }
        System.out.println(list);


        System.out.println("==========================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,1,1,2,2,2,2,2,3,3,3,3,4,4,4,5,5,6,6,6,7,7,7,8,8,8));
        //list2.removeIf(p -> p<5); //p assigned each element in list2

        list2.removeIf(p -> p%2!=0);

        System.out.println(list2);

        System.out.println("=================");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Marina", "Elena", "Inna", "Kail", "Leo","Mark", "Stiven" ));
        names.removeIf(p -> p.toLowerCase().contains("a"));
        System.out.println(names);

        System.out.println("--------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Anna", "Kaiak", "Lena", "Racecar", "Leo"));

        words.removeIf(p -> StringUtility.isPalindrome(p) ); //if the string is palindrome than remove it fro arrayList
        System.out.println(words);

      /*  for(int j = 0; j<=words.size()-1; j++){

            String reverse = "";

            for(int i =words.get(j).length()-1; i>=0; i--){

                reverse+=words.get(j).charAt(i);
            }

            boolean isPalindrome = reverse.equalsIgnoreCase(words.get(j));
            words.removeIf(p -> isPalindrome);

        }
        System.out.println(words);
*/



    }
}
