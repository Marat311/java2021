package Office_Hourse.practice_07_07_2021;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String [] color = {"Yellow","Blue","Purple"};
        //retrieve
        System.out.println(color[0]);

        System.out.println("++++++++++++++++++++");

        int num [] = new int[4]; //4 -it is length

        num[0]=4;
        num[1]=3;
        num[2]=2;
        num[3]=1;

        //Arrays methods

        //equals

        int num1 [] ={1,2,3,4};
        System.out.println("Arrays.equals(num, num1)= "+ Arrays.equals(num, num1));//false

        //sort
        Arrays.sort(num);  //sort by ascending order
        System.out.println("Arrays.equals(num, num1) = " + Arrays.equals(num, num1));

        //to String
        System.out.println("Arrays.toString(num1) = " + Arrays.toString(num1)); //[1,2,3,4]

        //String methods

        //toCharArray

        String a = "Cybertek is a school";
        char[] ch =a.toCharArray(); //convert string to array
        System.out.println(Arrays.toString(ch)); //[C, y, b, e, r, t, e, k,  , i, s,  , a,  , s, c, h, o, o, l]

        //split

        String b = "abcabcabc"; //
        String[] abc = b.split("abc"); //remove all abc and convert to array with ","
        System.out.println(Arrays.toString(abc)); //output: empty array []

        System.out.println(abc.length); //0

    }


}
