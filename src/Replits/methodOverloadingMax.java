package Replits;

public class methodOverloadingMax {
    /*
    In this task, you need to write 2 overloaded methods findMax() that will find a maximum number in the array. First version should work with array of integers (int[]) and return int, and second method should work with an array of doubles (double[]) and return double as a result.

Methods must have the same name and different parameters.
     */
    public static void main(String[] args) {
double [] num = {5,2.2,6.41,7.8,6.1,1.5};
        System.out.println(findMax(num));
    }

    public static int findMax(int [] num){

        int max =num[0];
        for(int each:num){
            if(max<each){
                max=each;
            }
        }
return max;

    }

    public static double findMax(double [] num){
        double max =num[0];
        for(double each:num){
            if(max<each){
                max=each;
            }
        }
        return max;


    }



}
