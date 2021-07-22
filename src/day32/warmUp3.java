package day32;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class warmUp3 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int num = 2;

        System.out.println(Arrays.toString(remove(arr, num)));

        double[] arr1 = {10.5,15.5,16.8,20.5};
        System.out.println(Arrays.toString(ArraysUtility.remove(arr1, 3)));

        String [] arr3 = {"marina", "inna", "lena", "venera"};
        System.out.println(Arrays.toString(ArraysUtility.remove(arr3, 3)));

        char[] ch = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(ArraysUtility.remove(ch, 1)));
    }

    public static int[] remove(int[] arr, int num){
        int[] array = new int[arr.length-1];
        int j = 0;
        for(int i=0; i<arr.length; i++){

            if(i==num){
                continue;
            }
            array[j++]=arr[i];
        }
        return array;
    }
}
