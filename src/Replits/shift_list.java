package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class shift_list {
    public static void main(String[] args) {
        /*
        Modify an array that is "left shifted" by one -- so {6, 2, 5, 3}
        becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.`

Example:

input: 6, 2, 5, 3

output: [2, 5, 3, 6]
         */

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){  //6,2,5,3
            nums[i] = scan.nextInt();
        }

        int f = nums[0];

         int j = 0;
        for (int i = 0; i<nums.length-1; i++){


         nums[j++]=nums[i+1];
        }
        nums[j++]=f;
      System.out.println(Arrays.toString(nums));




        scan.close();

    }
}
