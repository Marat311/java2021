package Replits;

import java.util.Scanner;

public class methods_mergeString {
    /*
    Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. Please note one and two can be of different lengths.

Examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
     */
    public static String mergeStrings(String one, String two) {

        String result = "";
        int max = 0;
        if(one.length()>two.length()){
            max=one.length();
        }else{
            max=two.length();
        }
      for(int i =0; i<max; i++) {
          if (i<one.length()){
              result+=one.charAt(i);
          }
          if(i<two.length()){
              result+=two.charAt(i);
          }

      }
return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
        in.close();
    }

}
