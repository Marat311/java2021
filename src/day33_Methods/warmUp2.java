package day33_Methods;

import java.util.Arrays;

public class warmUp2 {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8};
        //              0 1 2 3 4 5 6 7
        int [] arr2= Arrays.copyOfRange(array, 1, 5);
        System.out.println(Arrays.toString(arr2));



    }

    public static boolean contains(int [] array, int element){
        boolean result = false;
        for(int each:array){
            if(each==element){
                result=true;
            }
        }
        return result;
    }

    public static boolean contains(double [] array, double element){
        boolean result = false;
        for(double each:array){
            if(each==element){
                result=true;
            }
        }
        return result;
    }

    public static boolean contains(String [] array, String element){
        boolean result = false;
        for(String each:array){
            if(each.equalsIgnoreCase(element)){
                result=true;
            }
        }
        return result;
    }

    public static boolean contains(char [] array, char element){
        boolean result = false;
        for(char each:array){
            if(each==element){
                result=true;
            }
        }
        return result;
    }
}
