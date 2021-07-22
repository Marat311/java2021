package Replits;

public class QuizeArrays {
    public static void main(String[] args) {

        int num1[] =new int [3];
        int [] num2 = {1,2,3,4,5};
        num1=num2;
        for (int i = 0; i < num1.length ; i++) {
            System.out.println(num1[i]);
        }

        System.out.println("=====================");

        int arr[] ={1,2,3,4};
        System.out.println(arr.length-1);
        int i = 0;
        do{
            System.out.println(arr[i]+ " ");
            i++;
        }while (i<arr.length-1);
    }
}
