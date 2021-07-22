package day26_MultiDementialArrays;

import java.util.Arrays;

public class warmUp_AllZeroToTheEnd {
    public static void main(String[] args) {
        /*
        write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                {10, 5, 1, 0, 0, 0}
      MUST use for each loop
         */
        int[] array = {10, 0, 5, 0, 1, 0,0,5,80,100,5,46};

        int result[] =new int[array.length];
        System.out.println("+++++++++++for each loop +++++++++++++");

        int i =0;  //index number of the result
        for(int each: array){
        if(each!=0){
            result[i++]=each;
        }
        }

        System.out.print("result: "+Arrays.toString(result));
        System.out.println();
        System.out.println("++++++++++++For loop++++++++++++");

        int result1[] =new int[array.length];


        for(int j = 0, k=0; j<array.length; j++){

            if(array[j]!=0){
                result1 [k++]= array[j];
            }
        }
        System.out.println("result1 = " + Arrays.toString(result1));



    }
}
