package Replits;

public class replit4 {
    public static void main(String[] args) {
        String word = "b";


        String r = "";
        if(word.length()>3) {
            if (word.charAt(0) == 'j' || word.charAt(1) == 'j') {
                r="true";
            }else{
                r="false";
            }
        }else{
                r="false";

        }
        System.out.println(r);
    }
}
