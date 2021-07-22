package Replits;

import java.util.Scanner;

public class methods_unique {
    public static void main(String[] args) {
        int [] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        for(int each:nums){
            int count=0;
            for(int each2:nums){
                if(each2==each){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each);
            }
        }


    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE


        for(int each:nums){
            int count=0;
            for(int each2:nums){
                if(each2==each){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each);
            }
        }

    }
    }

