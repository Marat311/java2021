package day21;

public class warmUp4 {
    /*
    4. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

     */
    public static void main(String[] args) {


        String input= "mn@#123Ab!";

        String letters="";
        String digits="";
        String specialChars = "";

        for(int i =0; i<input.length(); i++){

            char each = input.charAt(i); //gets the characters from the string

            if(each>='A' && each<='Z'){ //if the characters is upper case from the string
                letters+=each;

            }else  if (each>='a'&& each<='z') {  //if the character is lower case letter
                letters += each;

            }else if(each>='0' && each<='9'){  //if the character is digit
                digits += each;

            }else {  //if the character is special char
                specialChars+=each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);



    }
}
