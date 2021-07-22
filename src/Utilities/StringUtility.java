package Utilities;

import java.util.Arrays;

public class StringUtility {
    //reverses any given string, and returns it
    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){ // i : 2, 1, 0
            reverse += str.charAt(i); //
        }

        return reverse;
    }


    //checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str){ // "Java"
        String reversedStr =  reverse(str);  //"avaJ"
        return  str.equalsIgnoreCase(reversedStr);
    }


    //remove duplicates from String, returns String
    public static String removeDup(String str){
        String removeDup=""; //empty string it always -1 index

        for (char ch : str.toCharArray()) {
            if(removeDup.indexOf(ch)<0){  // another way => !removeDup.contains(""+ch)
                //if the character is not contained in the result, it will be -1 then concate the character
                removeDup+=ch;
            }
        }





        //"AABBBCCCCCC"==> "ABC"
        return removeDup;
    }
    // removeDup("AAABBBBBBCCCCCCC") ===> "ABC"


    //checks if two Strings are Anagram, returns boolean
    public static boolean isAnagram(String str1, String str2){


        char [] ch1 = str1.toCharArray();
        char ch2 [] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // boolean result =Arrays.equals(ch1,ch2);
        return Arrays.equals(ch1, ch2);
    }

    // returns the frequency of ch from the string str
    public static int frequency(String str, char ch){ //AABBBC  B
        int count = 0; //1

        for (char each : str.toCharArray()) { // each: represents each character of str ['A', A, B, B, B, C]
            if(each == ch){
                count++;
            }
        }

        return count;
    }


    //returns the unique characters from the string
    public static String uniqueChars(String s){
        String unique = "";

        for(int i = 0; i <= s.length()-1; i++){
            char each = s.charAt(i);
            int frequency =  frequency(s, each);
            if(frequency == 1){
                unique += each;
            }
        }

        return unique;
    }


    //returns the frequncy each characters, returns string
    public static String frequencyOfChars(String str){
        String result = ""; //A3B2C4

        for (char each : removeDup(str).toCharArray()) { // each: A, B C
            int frequency =  frequency(str, each); // gets the frequency of each character: 3, 2, 4
            result += each ; //"ABC"
            result += frequency;//"A3B2C4"
        }

        return result;
    }

//return frequency of the word from the sentence
    public static int frequencyOfWord(String sentence, String word){
        int count = 0;
        sentence= sentence.toLowerCase();
        word= word.toLowerCase();
        while(sentence.contains(word)){
            sentence= sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }


}
