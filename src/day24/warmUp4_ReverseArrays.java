package day24;

import java.sql.Array;
import java.util.Arrays;

public class warmUp4_ReverseArrays {
    public static void main(String[] args) {
        /*
        4. Write a program that can reverse an array of integers
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
         */
        int array[] = {1,2,3,4,5};
        int reversedArray[] = new int[5];
        String r = "";




            for (int j = array.length -1, i=0; j >= 0; j--, i++) { //j - is the index number of array starting from last index
                                //i is the index numbers of reversed array starting fom index 0

                reversedArray[i]=array[j];


                }
        System.out.println(Arrays.toString(reversedArray));
        System.out.println(Arrays.toString(array));

        for (int j = array.length -1; j >= 0; j-- ) { //j - is the index number of array starting from last index
            //i is the index numbers of reversed array starting fom index 0

            System.out.print(array[j]);


        }
    }
}
