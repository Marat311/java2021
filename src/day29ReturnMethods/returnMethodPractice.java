package day29ReturnMethods;

public class returnMethodPractice {


    public static void main(String[] args) {
        //find max num between 10 & 20 and then multiply by 2
        int[] nums = {200, 300, 500, 5, -1, 0, -100, 1000, 2000};
        int maximumNumber = maxNumberFromIntArray(nums);
        int minimumNumber = minNumberFromIntArray(nums);

        System.out.println("minimumNumber = " + minimumNumber);
        System.out.println("maximumNumber = " + maximumNumber);

        System.out.println(  maxNumberFromIntArray(nums)  );

        System.out.println( minNumberFromIntArray(nums)  );

        int result = max(10,20)*2;
        System.out.println(result);


    }



    public static int max(int a, int b){
      int max=0;
      if(a>b){
          max=a;
      }else{
          max=b;
      }


        return max;
    }

    public static int min(int a, int b){
        return (a<b) ? a : b ;
    }

    public static int maxNumberFromIntArray(int [] numbers){
        int max = numbers[0];
        for(int number:numbers){
            max = max(max,number);
        }
        return max;
    }

    public static int minNumberFromIntArray(int [] numbers){
        int min = numbers[0];
        for(int number:numbers){
            min = min(min,number);
        }
        return min;
    }
}
