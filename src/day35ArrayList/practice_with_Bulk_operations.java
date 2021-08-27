package day35ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class practice_with_Bulk_operations {

    public static void main(String[] args) {

        System.out.println("----------Bulk Operations ------------");

        System.out.println("-------------addAll(Collection type)----------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,1,1,2,3,4,5,6,7,8,9,10)); //add collection of elements to the list


        System.out.println("------------removeAll(Collection type)---------------------");

        nums.removeAll(Arrays.asList(1)); //remove all the matching elements from the ArrayList
        System.out.println(nums);//[2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("-----------");





    }
}
