package Replits;

public class methods_addthirdChar {
    /*
    at3 accepts two strings and returns a string.

The first string is the one that will be manipulated.
At the 3rd char position of target you will insert the word argument.

Example:

at3("longword","foo")

return: "lonfoogword"
at3("longword","foo")

return: "lonfoogword"
at3("blabla","a")

return: "blaabla"
     */
    public static void main(String[] args) {
        System.out.println(at3("longword", "foo"));
    }

    public static String at3(String target, String word){
        String result = "";
     //   String secWord = target.substring(target.length()/2);
        for(int i = 0; i<target.length(); i++){
            if(i==3){
                result+=word;
            }
            result+=target.charAt(i);

        }


        return result;
    }


}
