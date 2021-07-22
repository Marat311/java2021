package day33_Methods;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class warmUp {
    public static void main(String[] args) {
        int r []={10,20,30,40};
        System.out.println(Arrays.toString(remove(r, 2)));
        String[] students = {"Dilem", "lola", "Katy", "Jack", "Sam"};
        students= ArraysUtility.remove(students, 2);
        System.out.println(Arrays.toString(students));

        System.out.println("++++++++++++++++++++");

        char[] chars = {'A', 'B', 'C', 'D'};
        char [] chars2 = {'F', 'J', 'K'};

        char [] chars3 = ArraysUtility.merge(chars, chars2);

        System.out.println(Arrays.toString(chars3));








    }

    //remove the element at given index of the array

    public static int[] remove(int [] arr, int index){
    if(index<0 || index>arr.length-1) {  //if the given index number invalid
    System.out.println("Invalid Index");
    System.exit(0);

}
        int [] result = new int[arr.length-1];
        for(int i = 0, j=0; i<arr.length; i++){
            if(i==index){
                continue;
            }else {
                result[j++] = arr[i];
            }
        }
        return result;
    }

}
