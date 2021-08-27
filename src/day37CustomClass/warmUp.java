package day37CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmUp {
    public static void main(String[] args) {
        /*
        1. write a program that can swap the first and last elements of an ArrayList

2. write a program that can return the first unique elements of an ArrayList

3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

4. Write a program that can return the nth largest number from an ArrayList of integers
         */

        System.out.println("--------1------swap------------------------");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Collections.swap(nums, 0, nums.size()-1);
        System.out.println(nums);

        System.out.println("----------2-----first unique----------------");
        ArrayList<Character> ch = new ArrayList<>(Arrays.asList('A', 'B', 'A', 'C', 'D','F', 'C', 'D'));
        ch.removeIf(p -> Collections.frequency(ch, p)!=1);
        System.out.println(ch.get(0));

        System.out.println("--------3-----frequency ----------");
        String str = "AABBCCDDEE";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";
        for(int i = 0; i< list.size(); i++){
            int num = Collections.frequency(list, list.get(i));
            if(!result.contains(list.get(i))){
                result+=list.get(i)+num;
            }

        }
        System.out.println(result);

        System.out.println("-----------4------largest num----------");

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10));

        int n= 5;
        for(int i =1; i<n; i++){
            num.removeIf(p -> p ==Collections.max(num));//remove max number 4-th times to show 5-th max number
        }

            int r = Collections.max(num); //here we see what will be max num
            System.out.println(r);








    }
}
