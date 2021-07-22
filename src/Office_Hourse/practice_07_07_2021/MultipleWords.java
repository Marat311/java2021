package Office_Hourse.practice_07_07_2021;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        /*
	Task 2 :	Write a program that accepts string and prints multiple words in the string
        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”
        output : wooden spoons
        		 trash can
         		 dish washer

         */

        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        // find index of ,

        String[] split = words.split(", "); //convert to array use split method
        //on split method we use ", " so it means on string we put all string with ", "(comma and space) between words

        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));

        // find substring until comma
        // use trim
        // check contains " "

     /*   for (int i = 0; i <split.length ; i++) {
            if(split[i].contains(" ")){
                System.out.println(split[i]);
            }
        }

      */

        for (String each: split){  //
            if(each.contains(" ")){
                System.out.println(each);
            }
        }


        // replace word with ""


    }
}
