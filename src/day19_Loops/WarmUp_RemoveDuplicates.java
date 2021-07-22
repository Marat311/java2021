package day19_Loops;

public class WarmUp_RemoveDuplicates {

    public static void main(String[] args) {

       /*
       1. ask the user to enter a word. the word must be five characters long and print the word without the duplicated characters, but if the word is less than five characters long, print "Too Short." and if the word is more than five characters long, print "Too long."

        Ex:
            input:
                aabbc

             output:
                 abc

        */
        String a = "aabbc";
        String result = "";

        if(a.length()==5){
            if(!result.contains(""+a.charAt(0))){
                result+=a.charAt(0);
            }
            if(!result.contains(""+a.charAt(1))){
                result+=a.charAt(1);
            }
            if(!result.contains(""+a.charAt(2))){
                result+=a.charAt(2);
            }
            if(!result.contains(""+a.charAt(3))){
                result+=a.charAt(3);
            }
            if(!result.contains(""+a.charAt(4))){
                result+=a.charAt(4);
            }
        }else if(a.length()>5){
            result="Too long";
        }else{
            result="too short";
        }
        System.out.println(result);

    }}
