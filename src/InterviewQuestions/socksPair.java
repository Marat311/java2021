package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class socksPair {

    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,1,3,1,2,1,3,3,3,3)); //3
        ArrayList<Integer> n1 = new ArrayList<>(Arrays.asList(ar.get(0))); //1,3,2
             for(int n2:ar) { //1,1,3,1,2,1,3,3,3,3
          if(!(n1.contains(n2))){
              n1.add(n2);
          }

        }
           int count=0;
           Integer pair = 0;
         for(Integer num:n1){ //1 3 2
           for(Integer num2:ar){ //1 1 3 1 2 1 3 3 3 3
               if(num2==num){
                   count++;
               }
           }
           count = count/2;
           pair +=count;
           count = 0;
         }
        System.out.println(pair);

    }
}
