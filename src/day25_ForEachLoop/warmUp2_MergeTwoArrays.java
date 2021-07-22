package day25_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class warmUp2_MergeTwoArrays {
    public static void main(String[] args) {

        /*
        2. write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
         */

        int arr1 [] ={1,2,3,4};
        int arr2[] = {5,6};

        int arr3[] = new int [arr1.length+arr2.length];

        int j = 0; //for the index numbers of the third array
        for(int i = 0; i<arr1.length; i++){  //run arr1 by index
            arr3[j++]=arr1[i]; //retrives each element from arr1 and assigns to the indexes of arr3


        }

        for(int i = 0; i<arr2.length; i++){ //for arr2
            arr3[j++]=arr2[i]; //add in arr3 all numbers from arr2;
         // arr3[i+ args.length]=arr2[i]; another way how we can stored arr2 in last 2 index of arr3

        }

        System.out.println(Arrays.toString(arr3));

    }
}
