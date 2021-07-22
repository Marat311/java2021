package Replits;

public class method_String_wordCount {
    /*
    wordCount accepts String and returns how many words are in the given String

Example:

wordCount("foo bar")

returns 2
wordCount("foo bar")

returns 2
wordCount("one two three")

returns 3
wordCount("one two three")

returns 3
wordCount("bla")

returns 1
wordCount("bla")

returns 1
Hint: look at spaces
     */
    public static void main(String[] args) {
        System.out.println(wordCount("foo bar"));
    }

    public static int wordCount(String str){ //"foo bar"
        String[] arr= str.split(" ");
         int count=0;
        for(String each:arr){

         count++;
        }
       return count;
        }
}
