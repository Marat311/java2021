package Replits;

public class methods_extractString {
    public static void main(String[] args) {
        /*
        Create a method extractNum that cleans any non number string from a string it gets and returns the clean string

input:

s (string) - given String

return: string: a String of numbers only

Example:

extractNum("aa2aa3") ==> 23
extractNum("aa2aa3") ==> 23
extractNum("aa2") ==> 2
extractNum("aa2") ==> 2
extractNum("aa10aa") ==> 10
extractNum("aa10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10
hint:

you can use: Character.isDigit() or ascii values
         */
    }

    public static String extractNum(String s) {

        char [] ch = s.toCharArray();
        String result = "";
        for(char each: ch){
            if(each>=48 && each<=57){
             result+=each;
            }
        }
    return result;
    }
}
