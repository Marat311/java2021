package day29ReturnMethods;

import java.util.Locale;

public class returnMetods {

    public static void main(String[] args) {

        String str = "Java";

       String result= reverse(str);

      boolean isPalindrome= isPalindrome(str);

        System.out.println(isPalindrome);
    }


    public static String reverse(String str){  //ABC

        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }

        return result;

    }

    public static boolean isPalindrome(String str){
        String reversedStr = reverse(str);
        boolean isPalindrom = str.equalsIgnoreCase(reversedStr);
        return (isPalindrom)?true:false;
    }
}
