package day29ReturnMethods;

public class warmUp1 {
    public static void main(String[] args) {

        int [] num = new int[3];
        num[0]=10;
        num[1]=10;
        num[2]=10;

        System.out.println(num);

        studentGrade(90);
        reverse("marina");

    }
    public static void studentGrade(int score) {

        if (score >= 90) {
            System.out.println("Grade= A");
        } else if (score >= 80) {
            System.out.println("Grade= B");
        } else if (score >= 70) {
            System.out.println("Grade= C");
        } else if (score >= 60) {
            System.out.println("Grade= D");
        } else if (score >= 50) {
            System.out.println("Grade= F");
        } else {  //opposite of pre condition: if the score is invalid
            System.out.println("You are fail");

        }
        /*
    6. calculate the garde of the student based on the score
     */

    }

    public static void reverse(String str){
        String r = "";
        for (int i =str.length()-1; i >=0 ; i--) {
            r+=str.charAt(i);
        }
        System.out.print(r);
        /*
    7. create a method that can reverse any String
     */
    }




        /*
        8. write a method that can print out the unique elements from an array of string
         */

    }

