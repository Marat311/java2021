package Replits.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class AppendPosSum {
    /*
    Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers
This method should:

Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element
For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3). The original ArrayList should remain unchanged.
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        ArrayList<Integer> list2 = new ArrayList<>();

        Integer sum = 0;
        for (Integer each : list) {
            if(each>0){
                list2.add(each);
                sum+=each;
            }
        }
        list2.add(list2.size(), sum);
        System.out.println(list2.lastIndexOf(sum));

        System.out.println(list2);

        String s = "Java";
        System.out.println(s.substring(2));
        System.out.println(s.substring(0,2));
        System.out.println(s.substring(2 ));



    }
}
