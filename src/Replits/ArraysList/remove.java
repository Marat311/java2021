package Replits.ArraysList;

import java.util.ArrayList;

public class remove {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();



    }

    public static ArrayList<Integer> returnNum(ArrayList<Integer> nums, Integer num){

        nums.removeIf(each-> each==num);
        return nums;
    }
}
/*
This method gets an Arraylist of Integers and a number(Integer). It returns an Arraylist.

It removes any instance of the given number from the Arraylist.

Example:

romoveInst([1,1,2,3,1,4],1)

returns: [2,3,4]
romoveInst([1,1,2,3,1,4],1)

returns: [2,3,4]
romoveInst([3,4,3,3],4)

returns: [3,3,3]
    }
 */
