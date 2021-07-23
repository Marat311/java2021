package day34_LocalDateTime_Wrapper;

public class WrapperClassMethods {

    public static void main(String[] args) {
        System.out.println("--------------parseOf method ----------------");
        String str = "123";
        int num = Integer.parseInt(str); //convert String to primitive data type - int

        System.out.println("------------valueOf method--------------");

        int num2 = Integer.valueOf(str); //Unboxing
         //        Integer wrapper class

        Integer num3 = Integer.parseInt(str); //autoboxing
        //              int primitive


        Integer num5 = Integer.valueOf(str); //convert primitive to Wrapper class
                       //wrapper class

        System.out.println(num-1); //122

        String str2 = "true";
       boolean r1 =  Boolean.parseBoolean(str2); // none boxing

        boolean r2 = Boolean.valueOf(str2); //unboxing

        Boolean r3 = Boolean.parseBoolean(str2); //autoboxing

        String str3 = "2.5";
        double d1 = Double.parseDouble(str3);

        System.out.println("------------------------");

        char ch = '4';

        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);
        System.out.println("_____________________________");

        String s = "a1b2c3";
        int sum = 0;

        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt( ""+each );
                //sum += each;
            }
        }

        System.out.println("sum = " + sum);

        System.out.println("-------------------------------------------------");

        String s2 = "AAABBBCCC!@#$%#@!$%^&12345678";

        String letters ="",
                digits = "",
                specialChars = "";

        for (char each : s2.toCharArray()) {

            if(Character.isDigit(each)){
                digits += each;
            }else if(Character.isLetter(each)){
                letters += each;
            }else{
                specialChars += each;
            }

        }


        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);




    }
}
