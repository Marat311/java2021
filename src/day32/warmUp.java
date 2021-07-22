package day32;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class warmUp {

    public static void main(String[] args) {
        int [] r={1,2,3};
        System.out.println(Arrays.toString(addInteger(r, 5)));


        System.out.println("+++++++++++++++++++++++++");

        int r1 = sum(10,12);

        int r2= sum(100,200,300);

        int r3 = sum(1000,2000,3000,4000);
        double r4 = sum(2.5, 3.6, 5.5);
        double r5 = sum(1.2, 4.4, 8.2, 6.6);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);


    }
    /*
      1. create a method that can find the sum of two numbers
                    method name: sumOf2Numbers
     */
    public static void sumOf2Numbers(int num1, int num2){
        int result = num1+num2;
        System.out.println(result);
    }


    /*
     2. create a method that can find the sum of three numbers
                    method name: sumOf3Numbers
     */

    public static void sumOf3Numbers(int num1, int num2, int num3){
        int result =num1+num2+num3;
        System.out.println(result);
    }

    /*
    3. create a method that can find the sum of four numbers
                    method name: sumOf4Numbers

     */
    public static void sumOf4Numbers(int num1, int num2, int num3, int num4){
        int result =num1+num2+num3+num4;
        System.out.println(result);;
    }

    /*
        1. create a return method called addInteger that can add an Integer number
        after the  last index of an integer array
     */

    public static int [] addInteger(int [] arr, int num){
        int [] arr1 = new int[arr.length+1];
        int j = 0;
        for(int each:arr){
            arr1[j++]=each;
        }
        arr1[arr1.length-1]=num;
        return arr1;
    }

    /*
     create a return method called addDouble that can add a double
      number after the last index of a double array
     */

    public static double [] addDouble(double [] arr, double num){
        double [] arr1 = new double[arr.length+1];
        int j = 0;
        for(double each:arr){
            arr1[j++]=each;
        }
        arr1[arr1.length-1]=num;
        return arr1;
    }


    public static int sum(int a, int b){
        return a+b;
    }

    public static double sum(double a, double b){ return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static double sum(double a, double b, double c){
        return a+b+c;
    }

    //                        1      2      3      4
    public static int sum(int a, int b, int c, int d){
        //return sum(a,b)+sum(c,d);

        return sum(sum(a,b), sum (c,d));
        //sum     (     3,         4    )
    }

    public static double sum(double a, double b, double c, double d){
        return a+b+c+d;
    }

    /*
     create a return method called addString that can add
     a String after the last index of a String array
     */
    public static String [] addString(String [] arr, String num){
        String [] arr1 = new String[arr.length+1];
        int j = 0;
        for(String each:arr){
            arr1[j++]=each;
        }
        arr1[arr1.length-1]=num;
        return arr1;
    }

}
