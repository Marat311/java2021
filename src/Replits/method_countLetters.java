package Replits;

public class method_countLetters {
    /*
    Write a method countLetters that can count letters in a
    given string and return a new string in the given format:

number of letters + letter
number of letters + letter
Example:

input: countLetters("aaabbcccc");

output: "3a2b4c"
     */
    public static void main(String[] args) {
         String r = "aaabbbcccd";
        System.out.println(countLetters(r));
    }

    public static String countLetters(String str){

        String result = "";

        //removeDup
        for(int i = 0; i<str.length(); i++){
            if(result.contains(""+str.charAt(i))){
                continue;
            }
            result+=str.charAt(i);
        }

        String result1 = "";
        for(int i = 0; i<result.length(); i++){
            char each = result.charAt(i);
            int count=0;
            for(int j =0; j<str.length(); j++){
                if(each==str.charAt(j)){
                    count++;
                }
            }
            result1+=""+count+each;
        }

        return result1;


    }

}
