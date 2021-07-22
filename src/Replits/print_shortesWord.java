package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class print_shortesWord {
    public static void main(String[] args) {
        /*
        Write a program that will find out shortest words in the given
        string str. If there are few words that are evenly short,
        print them all. Use split method in order to split str string
        variable and create an array of strings.
        Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
         */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

     String arr[] = str.split(", ");
        System.out.println(Arrays.toString(arr));

        String s = arr[0];
        String result = "";
        for(int i = 0; i<arr.length; i++){
            String r = arr[i];
            if(r.length()<=s.length()){
                s=r;
            }


        }

        for(String each:arr){
            if(each.length()==s.length()){
                result+=each+", ";
            }

        }

        arr=result.split(", ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



    }
}
