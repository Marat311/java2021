package Office_Hourse.practice_07_07_2021;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
 /*
      Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left”
		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]
       */

        int [] x = {1,2,3,4,5};
        /*
        i=0      x[i]=x[i+1]   2,2,3,4,5
        i=1      x[i]=x[i+1]   2,3,3,4,5
        i=2      x[i]=x[i+1]   2,3,4,4,5
        i=3      x[i]=x[i+1]   2,3,4,5,5
        i=4      x[i]=x[i+1]   2,3,4,5,5          2,3,4,5,1
         */

        int temp=x[0];  //create int to add first number from Array
        for (int i = 0; i <x.length-1 ; i++) { //create loop to run all numbers from Array x
            x[i]=x[i+1]; //assign character by another character+1
        }
        x[x.length-1]=temp; //add on array last character int with first character from array

        System.out.println(Arrays.toString(x));


    }
}
