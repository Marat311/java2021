package Replits;

public class method_LimitString {
    /*
    This method gets a string and an int, it returns a string.

The method will limit the given String by a certain amount of characters(given int)

Examples:

limit("abcd",2)

returns "ab"
limit("abcd",2)

returns "ab"
limit("bla bla",3)

returns "bla"
     */
    public static void main(String[] args) {

        String str = "bla bla";
        System.out.println(limit(str, 3));
    }

    public static String limit(String text, int maxLength){
        String [] arr = text.split("");
        String result = "";
        for(int i = 0; i<arr.length; i++){
            if(i>maxLength-1){
                break;
            }
             result+=text.charAt(i);
        }
        return result;
    }

}
