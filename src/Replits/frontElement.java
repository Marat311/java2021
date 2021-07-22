package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class frontElement {
    public static void main(String[] args) {
        /*
        Given an int array num of any length, print a new array of its first
        2 elements. If the array is smaller than length 2, use whatever elements
        are present.

Examples:

input: 1, 2, 3

output: [1, 2]
input: 1, 2, 3

output: [1, 2]
input: 1

output: [1]
input: 1

output: [1]
input: 4, 5, 4, 3, 8

output: [4, 5]
         */

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[] arr = new int[2];
        System.out.println("num"+Arrays.toString(num));
        System.out.println("arr"+Arrays.toString(arr));

        if (num.length == 1) {
            System.out.println(Arrays.toString(num));

        } else {

            for (int i = 0, j = 0; i < num.length; i++) {
                arr[0] = num[0];
                arr[1] = num[1];

            }
            System.out.println(Arrays.toString(arr));

        }
        scan.close();

    }}