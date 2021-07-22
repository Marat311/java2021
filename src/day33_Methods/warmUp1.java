package day33_Methods;

import java.util.Arrays;

public class warmUp1 {
    public static void main(String[] args) {

        char[] chars = {'A', 'B', 'C'};
        chars=reverse(chars);
        System.out.println(Arrays.toString(chars));


    }
    /*
     reverse array of integer
     */
    //reverses the given integer array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        
        for (int i = array.length-1, j=0; i>=0; i--, j++){
            result[j]=array[i];
        }
        return result;
    }

    //reverses the given String array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];

        for (int i = array.length-1, j=0; i>=0; i--, j++){
            result[j]=array[i];
        }
        return result;
    }

    //reverses the given Double array
    public static double[] reverse(double[] array){
        double[] result = new double[array.length];

        for (int i = array.length-1, j=0; i>=0; i--, j++){
            result[j]=array[i];
        }
        return result;
    }

    //reverses the given char array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];

        for (int i = array.length-1, j=0; i>=0; i--, j++){
            result[j]=array[i];
        }
        return result;
    }
    
    
    
    
}
