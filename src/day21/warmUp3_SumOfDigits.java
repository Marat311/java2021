package day21;

public class warmUp3_SumOfDigits{
    /*
    3. Write a program that can return the sum of digits froma  string
             Ex:
                 input: A1B2C3

                 output:    6
     */
    public static void main(String[] args) {

        String a = "A1B2C3";
        int sum=0;
        //digits :     1  2  3
        // asci table 49 50 51 =150
        //         (49-48) (50-48) (51-48)


        for(int i =0; i < a.length(); i++){  //each index number of string
        char each = a.charAt(i);
        if(each>='0' && each<='9'){
            sum+=each-48; // in order to convert characters digit to integer number
        }

        }
        System.out.println("sum: "+sum);
    }
}
