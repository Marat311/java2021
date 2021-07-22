package day25_ForEachLoop;

import java.util.Arrays;

public class forEachLoop_Practice {
    public static void main(String[] args) {

        String [] arr1 = {"A", "B", "C", "D"},
                  arr2 = {"E", "F"};

        String []arr3 = new String[arr1.length+arr2.length];

        int j = 0; //create int for increase arrays index
        for (String each:arr1) { //
            arr3[j++]=each; //increase arr3 by 1
        }

        for (String each2: arr2){
            arr3[j++]=each2;
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("++++++++++++++++++");

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int countOdd = 0, countEven=0;

        for(int each: numbers){
            if(each%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);
    }
}
