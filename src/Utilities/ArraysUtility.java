package Utilities;

import java.util.Arrays;

public class ArraysUtility {
    //adds integer to an int array
    public static int[] addElement(int[] array, int number){
        /*
        int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array) {
             result[i++] =each;
        }
        result[i] = number;
         */

        int[] result = Arrays.copyOf( array,   array.length+1 );
        result[ result.length -1] = number;

        return result;
    }


    //adds double to a double array
    public static double[] addElement(double[] array,  double number){
        double[] result =  Arrays.copyOf(array, array.length+1 );  //{1.5, 2.5, 3.5, 0.0};
        result[result.length-1] = number; //{1.5, 2.5, 3.5, 4.5};

        return result;
    }


    //adds String to a String array
    public static String[] addElement(String[] array, String str){
        String[] result = Arrays.copyOf(array, array.length + 1) ;//  { A, B, null }
        result[result.length-1] = str; //  { A, B, C }
        return result;
    }


    // adds char to char array
    public static char[] addElement(char[] array, char ch){
        char[] result = Arrays.copyOf(array, array.length + 1) ;//  { A, B, null }
        result[result.length-1] = ch; //  { A, B, C }
        return result;
    }

    //return max number from the array of integer
    public static int max(int[] array){
        int max = array[0];
        for(int each: array) {
         max=   Math.max(each, max);
        }
        return max;
    }

    //return max number from the array of double

    public static double max(double[] array){
        double max = array[0];
        for(double each: array) {
            max=   Math.max(each, max);
        }
        return max;
    }

    //return min number from the array of integer
    public static int min(int[] array){
        int min = array[0];
        for(int each: array) {
            min=   Math.min(each, min);
        }
        return min;
    }

    //return min number from the array of double

    public static double min(double[] array){
        double min = array[0];
        for(double each: array) {
            min=   Math.min(each, min);
        }
        return min;
    }

    // merge two arrays of int
    public static int[] merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (int each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (int each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // merge two arrays of double
    public static double[] merge(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (double each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (double each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // merge two arrays of String
    public static String[] merge(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (String each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (String each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // merge two arrays of char
    public static char[] merge(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (char each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (char each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }

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

    //reverse method contains int in array
    public static boolean contains(int [] array, int element){
        boolean result = false;
        for(int each:array){
            if(each==element){
                result=true;
            }
        }
        return result;
    }

    //reverse method contains double in array
    public static boolean contains(double [] array, double element){
        boolean result = false;
        for(double each:array){
            if(each==element){
                result=true;
            }
        }
        return result;
    }

    //reverse method contains String in array
    public static boolean contains(String [] array, String element){
        boolean result = false;
        for(String each:array){
            if(each.equalsIgnoreCase(element)){
                result=true;
            }
        }
        return result;
    }

    //reverse method contains char in array
    public static boolean contains(char [] array, char element){
        boolean result = false;
        for(char each:array){
            if(each==element){
                result=true;
            }
        }
        return result;
    }





    //1. create a function that can return the maximum number from an array of integer
    // max( new int[]{10,20,30} ) ==> 30


    //2. create a function that can return the minimum number from an array of integer
    // min( new int[]{10,20,30} ) ==> 10

   // return array that can add an Inteeger  after the  last index of an integer array

    public static int [] addElement1(int [] arr, int num){ //arr- [1,2,3], num-4
        int [] array = new int[arr.length+1];
        int j=0;
        for (int i=0; i<arr.length; i++){
            array[j++]=arr[i];
        }
        array[array.length-1]=num;
        return array;
    }

    //return method merge that can merger two arrays of integers
    public static int [] merge1(int [] arr1, int [] arr2){
        int [] arr3 = new int[arr1.length+arr2.length];
        int j = 0;
        for(int i = 0; i<arr1.length; i++){
            arr3[j++]=arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            arr3[j++]=arr2[i];
        }
        return arr3;
    }

    //return method contains where array contains int and return boolean
  /*  public static boolean contains(int [] arr, int num) {
        boolean contains = false;
        for (int each : arr) {
            if (each == num) {
                contains= true;
                break;
            } else {
                contains= false;
            }

        }
return contains;
    }

   */

    //return array remove index
    public static int[] remove(int[] arr, int index){
        if(index<0 || index>arr.length-1) {  //if the given index number invalid
            System.out.println("Invalid Index");
            System.exit(0);

        }
        int[] array = new int[arr.length-1];
        int j = 0;
        for(int i=0; i<arr.length; i++){

            if(i==index){
                continue;
            }
            array[j++]=arr[i];
        }
        return array;
    }

   // return method named remove that accepts one double array and one double (index).
   public static double[] remove(double[] arr, int index){
       if(index<0 || index>arr.length-1) {  //if the given index number invalid
           System.out.println("Invalid Index");
           System.exit(0);

       }
       double[] array = new double[arr.length-1];
       int j = 0;
       for(int i=0; i<arr.length; i++){

           if(i==index){
               continue;
           }
           array[j++]=arr[i];
       }
       return array;
   }

   //return method named remove that accepts oen String array and one int (index).
   public static String[] remove(String[] arr, int index){
       if(index<0 || index>arr.length-1) {  //if the given index number invalid
           System.out.println("Invalid Index");
           System.exit(0);

       }
       String[] array = new String[arr.length-1];
       int j = 0;
       for(int i=0; i<arr.length; i++){

           if(i==index){
               continue;
           }
           array[j++]=arr[i];
       }
       return array;
   }

   // return method named remove that accepts oen char array and one int (index).
   public static char[] remove(char[] arr, int index){
       if(index<0 || index>arr.length-1) {  //if the given index number invalid
           System.out.println("Invalid Index");
           System.exit(0);

       }
       char[] array = new char[arr.length-1];
       int j = 0;
       for(int i=0; i<arr.length; i++){

           if(i==index){
               continue;
           }
           array[j++]=arr[i];
       }
       return array;
   }


}
