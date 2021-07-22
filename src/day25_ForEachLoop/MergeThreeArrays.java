package day25_ForEachLoop;

import java.util.Arrays;

public class MergeThreeArrays {
    public static void main(String[] args) {

        int [] arr1 ={1,2,3,11},
                arr2={4,5,6},
                arr3 = {7,8,9,12,13,14};

        int [] arr4 = new int[arr1.length+arr2.length+arr3.length];

        for (int i = 0; i <arr1.length ; i++) {

            arr4[i]=arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr4[j+arr1.length]=arr2[j];
        }

        for (int a = 0; a < arr3.length; a++) {
            arr4[a+arr1.length+arr2.length]=arr3[a];
        }
        System.out.println(Arrays.toString(arr4));

        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}
