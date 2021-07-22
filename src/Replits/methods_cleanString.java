package Replits;

public class methods_cleanString {
    public static void main(String[] args) {
String str = "one two three";
        System.out.println(clean(str, "two"));
    }
    /*
    This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.

Example:

clean ("one two three","two")

returns "one three"
clean ("one two three","two")

returns "one three"
clean ("foo bar","foo")

returns "bar"
clean ("foo bar","foo")

returns "bar"
clean ("he said bla bla bla","bla")

returns "he said"
     */

public static String clean(String text, String badWord){

String str[] = text.split(" ");
String result = "";
for(String each:str){
    if(!(each.equalsIgnoreCase(badWord))){
        result+=each+" ";
    }
}

  return result;
}
}
