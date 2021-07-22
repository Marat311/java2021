package day24;

public class warmUp3_FrequencyElements {
    /*
    2. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
     */


    public static void main(String[] args) {

        int[] arr ={1,1,2,3,3,4};


        for (int j = 0; j < arr.length; j++) {


              int uniqueEl = arr[j];
              int count=0;  //to store the frequency of element
            for (int i = 0; i <arr.length ; i++) {
              int num = arr[i]; //if the element is occurred in the array


              if (arr[i] == uniqueEl) {
                count++;
              }
            }


              if (count == 1) { //to check if the element is unique
                  //if (count==2) //check if we have 2 elements
                  //if(count!=1) check if we have not uniques elements
                System.out.println(uniqueEl);
              }

        }

    }
}
