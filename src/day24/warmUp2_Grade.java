package day24;

import java.util.Arrays;

public class warmUp2_Grade {
    public static void main(String[] args) {
        /*
        2. given the following arrays:
     String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];

         write a program that can store the grades of the students in the array named grades

         */

        String [] names = {"Anna", "Nancy", "Sarah", "Anna", "Leo"};
        int [] scores = {90, 75, 80, 65, 45};
        char [] grades = new char[names.length];
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        int sum = 0;


        for(int i = 0; i< grades.length; i++){


            if(scores[i]>=90){
            grades[i]='A';
            countA++;
        }else if(scores[i]>=80){
            grades[i]='B';
            countB++;
        }else if(scores[i]>=75){
            grades[i]='C';
            countC++;
        }else if(scores[i]>=60){
            grades[i]='D';
            countD++;
        }else{
            grades[i]='F';
            countF++;
        }
            System.out.println(names[i]+":"+scores[i]+":"+grades[i]);

        }
        //  grades[i] = (scores[i] >= 90)?'A' :(scores[i] >= 80)?'B' :(scores[i] >= 70)?'C':(scores[i] >=60)?'D':'F';  //ternary

        double avg =  (double)sum / grades.length;  //find average of scores
        System.out.println("countA = " + countA);
        System.out.println("countB = " + countB);
        System.out.println("countC = " + countC);
        System.out.println("countD = " + countD);
        System.out.println("countF = " + countF);

        System.out.println("avg = " + avg);

    }
}
