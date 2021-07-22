package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DLargestNumber {
    public static void main(String[] args) {
        /*
        Given a 2d array of ints, find the biggest number(integer) and replace all array values
        on biggest number in the array then print an array.

Example:

Given values: [[1, 2, 3], [5, 33, 9]]

output: [[33, 33, 33], [33, 33, 33]]
         */
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows



        int max = arr[0][0];
        for(int[]arr1:arr){
            for(int num:arr1){
                if(num>max){
                    max=num;
                }

            }
        }
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=max;
            }

        }

        System.out.println(Arrays.deepToString(arr));

    }
}
