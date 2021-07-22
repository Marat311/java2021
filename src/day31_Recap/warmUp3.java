package day31_Recap;

import Utilities.ArraysUtility;
import Utilities.NumbersUtility;

import java.util.Arrays;

public class warmUp3 {
    public static void main(String[] args) {


        System.out.println(NumbersUtility.isOdd(10));
        NumbersUtility.isEven(10);

        System.out.println(NumbersUtility.isMax(10, 15));
        System.out.println(NumbersUtility.isMin(10, 5));
        System.out.println(NumbersUtility.cube(5));
        int[] r1 = {5, 6, 7};
        int r2 = 6;
        System.out.println("contains num: "+ArraysUtility.contains(r1, r2));
        System.out.println(Arrays.toString(ArraysUtility.addElement(r1, r2)));
        int arr1[] = {1, 2, 3};
        int arr2[] = {5, 6};
        System.out.println(Arrays.toString(ArraysUtility.merge(arr1, arr2)));

        String str = "AABBBC";
        char ch = 'C';
        System.out.println("frequency of char: "+frequency(str, ch)); //1



    }

    //1. create return method where return type will be String
    //result will be A2B3C1
   /*
    public static int frequency(String str, char ch) { //AABBBC, C

        int count = 0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;

    }
    */
    public static int frequency(String str, char ch){ //
        int count=0;

        for(int i=0; i<str.length(); i++){ //AABBC
            //      index                    01234
            if(str.charAt(i)==ch){
                count++;
            }
        }

        return count;
    }


}
