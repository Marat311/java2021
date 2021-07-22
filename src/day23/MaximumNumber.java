package day23;

public class MaximumNumber {
    public static void main(String[] args) {
        /*write a program that can find the maximum number from n array of integers

        write a program that can find the minimum number from n array of integers
        */

        int [] numbers = {10,5,4,400,50,0,-1};
        int max = numbers[0];
        int min = numbers[0];
                            //7
        for (int i =0; i<numbers.length; i++){
            int each = numbers[i]; //10
            //  System.out.print("each- "+each);

            //10=10
          if(each>max){
              max=each;
          }

          if(each<min){
              min=each;
          }
        }
        System.out.println("max = " + max);
        System.out.println("Min: "+min);


    }
}
