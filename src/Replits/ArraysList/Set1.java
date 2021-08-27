package Replits.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Set1 {
    /*
    Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence, otherwise return false.
`Examples:`
`Examples:`
`Main.appearsTwice("java", "java is fun!")`
`Main.appearsTwice("java", "java is fun!")`
      `- returns false, because java appears only once.`
      `- returns false, because java appears only once.`
`Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")`
copied!
`Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")`
      `- returns true, because laptop appears twice.`
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String target = "laptop";
        String sentence = "I would like to buy a new laptop, because my laptop is too old.";


        System.out.println(appearsTwice(target, sentence));

    }

    /**
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
  /*  public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:

        String[] sentence1 = sentence.split(" ");

        ArrayList<String> array = new ArrayList<>(Arrays.asList(sentence1));



        int count = 0;
        for (String each : array) {

            if(each.equals(target)) {
                count++;
            }else if(each.equals(target+",")){
                count++;
            }

        }
        if(count>1){
            return  true;
        }else{
            return false;
        }



    }

   */
   /* public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        int frequency = 0;
        String [] splitBySpace = sentence.split(" ");
        for (int i = 0; i < splitBySpace.length; i++){
            if (splitBySpace[i].contains(target)){
                frequency++;
            }
        }
        if (frequency == 2){
            return true;
        }
        return false;
    }
*/


    public static boolean appearsTwice(String target, String sentence) {

        ArrayList<String> array = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        int freq = 0;
        for (String each : array) {
            if (each.contains(target)) {
                freq++;
            }
        }
        if (freq != 1) {
            return true;
        } else {
            return false;
        }

    }

}

