package Replits;

import day28_CustomMethods.CustomMethodIntro;
import sun.jvm.hotspot.types.JDoubleField;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        int[] res = new int[size*2];

        res[res.length-1]=nums[nums.length-1];



        System.out.println(Arrays.toString(res));

        scan.close();

    }
}
