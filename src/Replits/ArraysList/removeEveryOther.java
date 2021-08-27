package Replits.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeEveryOther {
    public static void main(String[] args) {
       ArrayList<String> words = new ArrayList<>(Arrays.asList("hi", "yo", "sup", "yolo", "book"));
        int j = 1;
        for(int i = 0; i< words.size(); i++) {
            words.remove(j);
            j+=2;
        }
        System.out.println(words);


    }
}
