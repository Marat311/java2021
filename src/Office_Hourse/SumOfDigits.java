package Office_Hourse;

public class SumOfDigits {
    public static void main(String[] args) {
    /*

    write a program that can return the sum og digits of an integer
    (Do not use any string manipulations)
    input 123 output 6
     */


        int num = 12345;
        int sum = 0;

    /*

    1234 % 10 = 4   1234/10 =123
    123 % 10 = 3    123/10 = 12
    12 % 10 = 2     12/10 = 1
    1 % 10 = 1      1/10 = 0

     */
        while (num > 0) {
         //sum=sum+(num%10)

            sum+=(num%10);

            //num=num/10
            num/=10;
        }
        System.out.println(sum);
    }

}
