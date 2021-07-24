package Replits.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class combineAll {
    public static ArrayList<Integer> combineAl(ArrayList<Integer> numberOne, ArrayList<Integer>numberTwo) {

        numberOne.addAll(numberTwo);

        return numberOne;


    }

    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.addAll(Arrays.asList(1,4,5,8));


        ArrayList<Integer> n2 = new ArrayList<>();
        n1.addAll(Arrays.asList(7,3,2));


        System.out.println(combineAl(n1, n2));
    }
}
