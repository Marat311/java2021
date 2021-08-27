package Replits.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lamecalc {
    public static void main(String[] args) {
      ArrayList<String> r = new ArrayList<>(Arrays.asList("led", "mop", "lead", "make"));
      String find = "lea";
            // complete the method

            String res = "";
            for(String each:r){
                if(each.contains(find)){
                    res =each;
                    break;
                }else {
                    res= "search failed";
                }
            }
        System.out.println(res);



        }}