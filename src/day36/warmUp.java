package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp {
    /*
    1. write a program that can set the last element of the Integer arraylist to zero
                ex:
                    list = [1,2,3,4,5];
                    output: [1,2,3,4,0];
     */
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int num = 0;
        nums.set(nums.size()-1, num);
        System.out.println(nums);


        /*
        2. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
         */


        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for(int i = 0; i<nums2.size(); i++){
            if(nums2.get(i)%2!=0){
                nums2.set(i, nums2.get(i)*2);
            }
        }
        System.out.println(nums2);

        /*
        3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */

        String arr[] = {"A", "B", "C"};
        String arr2 [] = {"D", "E", "F", "G"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.addAll(Arrays.asList(arr2));
        System.out.println(list);


        int [] n = {1,2,3,4,5};
        //int n2 = 2;
        //Integer r = n2;
        ArrayList<Integer> l = new ArrayList<>();
        for(int each:n){
            l.add(each);
        }
        System.out.println(l);

    }
}
