package day25_ForEachLoop;

import java.util.Arrays;

public class warmUp_ReverseElements {
    public static void main(String[] args) {
/*
1. write a program that can  reverse each elements in an array of string
        Ex:
            array = {"Java", "Python", "C#"}

            output:
                ["avaJ", "nohtyP", "#C"]

            2.    write a program that can count how many palindromes in an array of string
   Ex:
   {"anna", "level", "java"}
   Output 2
   do not change the elements



 */
        String[] array = {"Java", "Python", "C#"};

        for (int j = 0; j <array.length ; j++) {


            String element = array[j]; //element of the array

            String reverse = ""; //to store the reversed vision of the element
            for (int i = element.length() - 1; i >= 0; i--) {
                reverse += element.charAt(i);  //gets the characters from the string element

            }
            array[j] = reverse; //assigning reversed element to the index of the array
        }
        System.out.println(Arrays.toString(array));

    }
}
