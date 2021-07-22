package Replits;

import java.util.Scanner;

public class diving01 {
    public static void main(String[] args) {
        /*
        In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.

The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive.

The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.

Flow:

Accept the 7 scores from the judges
Accept the difficulty number
Display the final score
Enter score for judge 1:
1
Enter score for judge 2:
5
Enter score for judge 3:
5
Enter score for judge 4:
5
Enter score for judge 5:
5
Enter score for judge 6:
8
Enter score for judge 7:
9
Enter difficulty:
2.1
Total: 35.28
         */
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];


        int total=0;
        for(int i =0, j=1; i<score.length; i++, j++) {
            System.out.println("Enter score for judge " + j + ":");
            score[i] = input.nextInt();
        }
        int max = (int)score[0];
        int min = (int)score[0];
        for (int i = 0; i <score.length; i++) {

            if (score[i] < min) {
                min = (int) score[i];
            }

            if (score[i] > max) {
                max = (int) score[i];
            }


            total += score[i];

        }

        total-=max+min;
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("Enter difficulty:");
        double dif = input.nextDouble();


        System.out.println("Total: "+(total*dif*0.6));



    }}
