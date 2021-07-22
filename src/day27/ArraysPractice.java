package day27;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int[] array = new int[2]; //[0,0]
        array[0]=10; //[10,0]
        array[1]=20;  //[10,20]

         array = new int[4]; //[0,0,0,0] new array with fixed length

         array[2]=30; //[0,0,30,0]
         array[3]=40; //[0,0,30,40]
        System.out.println(Arrays.toString(array));

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbers.length); //10
        System.out.println(numbers[0]); //1
        System.out.println(numbers[numbers.length-1]); //10



        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }


    }
}
