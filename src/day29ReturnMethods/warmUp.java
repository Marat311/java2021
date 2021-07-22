package day29ReturnMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class warmUp {
    /*
    1. create a function that can check if the given integer is positive, negative or zero

2. create a function that can print out the combination of two integer arrays

3.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");

                output:
                    "Cybertek School"
4. create a function that can print out the maximum number between two numbers

5. create a function that can print out the array of integers in descending order

     */
    public static void main(String... args) { //... we can use only on main method
        positiveNegativeZero(-5);

        System.out.println("++++++++++++++++++++++");

        int [] numbers = {10,20,30,-50,0};
        for (int each:numbers){
            positiveNegativeZero(each);
        }
        System.out.println("===========merge two arrays============");

        int []array1 = {1,2,3};
        int []array2 ={4,5,6,7};
        mergeTwoArrays(array1, array2);
        int arr[]={10,20,30,50,90};
        int arr1 [] ={100,200,300,400};
        mergeTwoArrays(arr, arr1);

        formatFullName("cyBERtek", "scHooL");

        System.out.println("--------------------------------------------");

        max(20, 20);

        System.out.println("---------------------------------------");
        int[] array = {100, 200, 0, -1, 500, 30, 50};

        sortDesc(array);


        System.out.println("-------------------------------");
        int arr4[] ={50,20,60,80,10};
        sortDesc(arr4);

    }

    public static void positiveNegativeZero(int num){

        if(num>0){
            System.out.println(num+ " is Positive");
        }else if(num<0){
            System.out.println(num+ " is Negative");
        }else{
            System.out.println(num+" is Zero");
        }
    }

    public static void mergeTwoArrays(int [] arr1, int [] arr2){

        int [] arr3 = new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length ; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0, j=arr1.length; i <arr2.length ; i++) {
            arr3[j++]=arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
    }

    public static void formatFullName(String firstName, String lastname){

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1).toLowerCase();

        String fullName = firstName +" "+lastname;

        System.out.println("fullName = " + fullName);

    }

    public static void max(int num1, int num2){
        System.out.println(    (num1 > num2 ? num1 : num2)  +" is maximum number"     );

    }

    public static void sortDesc(int []arr){
        Arrays.sort(arr);
        int [] result = new int[arr.length];

        for (int i = arr.length-1,  j=0; i >=0 ; i--, j++) {
            result[j]=arr[i];
        }

        System.out.println(Arrays.toString(result));
    }


}