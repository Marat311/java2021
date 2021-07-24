package Replits.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class combineArrays {
    /*
    Finish the combineRs method to combine the two given String arrays
    into one arraylist and return the arraylist.

for example:

combineRs(["f","o","o"],[" b","a","r"])

returns [f, o, o, b, a, r]
combineRs(["f","o","o"],[" b","a","r"])

returns [f, o, o, b, a, r]
combineRs(["1","2","3"],["4"])

returns [1, 2, 3, 4]
     */
    public static void main(String[] args) {

        String[] arr = {"f","o","o"} ;
        String[] arr2 = {" b","a","r"};

        ArrayList<String> result = new ArrayList<>();

        for(String each:arr){
            result.add(each);
        }
        for(String each:arr2){
            result.add(each);
        }
        System.out.println(result);
    }
}
