package day23;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {

        //toString() method

        int [] array = {1,2,3,4,5,6};
        System.out.println(array); // [I@5cad8086  gives hashCode

        System.out.println(Arrays.toString(array));

        String [] array2 = new String[5];

        System.out.println(array2); //gives hashCode

        System.out.println(Arrays.toString(array2)); //null, null, null, null, null

        int [] array3 = new int[5];
        array=array3;

        System.out.println(Arrays.toString(array3)); // [0,0,0,0,0]

        double[] ar = new double[3];
        System.out.println(Arrays.toString(ar)); //[0.0, 0.0, 0.0]
        System.out.println("==========================================================");


        //sort() method, sort the elements of the array in ascending order

        String[] students = {"Coco", "Chanel", "Gucci", "Prada"};
        Arrays.sort(students); //array is sorted by ascending order

        System.out.println(Arrays.toString(students));

        int [] numbers = {9,10,5,3,0,-1,-5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Minimum number "+numbers[0]);
        System.out.println("Maximum number "+numbers[numbers.length-1]);


        char[] chars = {'z', 'b', 'k', 'a', 'y', 'x'};

        System.out.println(Arrays.toString(chars));
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        //equals(arr1, arr2) return boolean

        int [] arr1 = {1,2,3};
        int arr2[] = {1,2,3};
        int arr3[] = {3,2,1};
        int arr4[] = {2,3,1};

        boolean res = Arrays.equals(arr1, arr2);
        boolean res2 = Arrays.equals(arr1, arr3);
        boolean res3 = Arrays.equals(arr3, arr4);

        System.out.println("res = " + res);

        System.out.println("res2 = " + res2);
        Arrays.sort(arr3);
        System.out.println("res2 = " + res2);

        Arrays.sort(arr4);
        System.out.println("res3 = " + res3);









    }
}
